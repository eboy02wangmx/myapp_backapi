$(document).ready(function() {
  
  var $sliders = $(".p-slider"),
      p_diff = 0,
      p_curSlide = 0,
      p_numOfSlides = $(".p-slide").length-1,
      p_animating = false,
      p_animTime = 500,
      p_autoSlideTimeout;

  
  function manageControls() {
    $(".p-slider-control").removeClass("inactive");
    if (!p_curSlide) $(".p-slider-control.left").addClass("inactive");
    if (p_curSlide === p_numOfSlides) $(".p-slider-control.right").addClass("inactive");
  }

  
  function changeSlides(instant) {
    if (!instant) {
      p_animating = true;
      manageControls();
      $sliders.addClass("animating");
      setTimeout(function() {
        $sliders.removeClass("animating");
        p_animating = false;
      }, p_animTime);
    }
    window.clearTimeout(p_autoSlideTimeout);
    $sliders.css("transform", "translate3d("+ -p_curSlide*100 +"%,0,0)");
    p_diff = 0;
  }

  function navigateLeft() {
    if (p_animating) return;
    if (p_curSlide > 0) p_curSlide--;
    if(p_curSlide == 0){
     
      $(".p-slider-container .left").hide();
    }
     $(".p-slider-container .right").show();
    changeSlides();
  }

  function navigateRight() {
    if (p_animating) return;
    if (p_curSlide < p_numOfSlides) p_curSlide++;
    if(p_curSlide == p_numOfSlides){
      $(".p-slider-container .right").hide();
    }
     $(".p-slider-container .left").show();
    changeSlides();
  }

  $(document).on("touchstart", ".p-slider", function(e) {
    if (p_animating) return;
    window.clearTimeout(p_autoSlideTimeout);
    var startX = e.pageX || e.originalEvent.touches[0].pageX,
        winW = $(window).width();
    p_diff = 0;
    
    $(document).on("touchmove", function(e) {
      var x = e.pageX || e.originalEvent.touches[0].pageX;
      p_diff = (startX - x) / winW * 70;
      if ((!p_curSlide && p_diff < 0) || (p_curSlide === p_numOfSlides && p_diff > 0)) p_diff /= 2;
      $sliders.css("transform", "translate3d("+ (-p_curSlide*100 - p_diff) +"%,0,0)");
    });
  });
  
  $(document).on("touchend", function(e) {
    $(document).off("touchmove");
    if (p_animating) return;
    if (!p_diff) {
      changeSlides(true);
      return;
    }
    if (p_diff > -8 && p_diff < 8) {
      changeSlides();
      return;
    }
    if (p_diff <= -8) {
      navigateLeft();
    }
    if (p_diff >= 8) {
      navigateRight();
    }
  });
  
  $(document).on("click", ".p-slider-control", function() {
    if ($(this).hasClass("left")) {
      navigateLeft();
    } else {
      navigateRight();
    }
  });

  
});