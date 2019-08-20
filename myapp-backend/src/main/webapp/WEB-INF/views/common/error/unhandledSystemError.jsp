<%@ page pageEncoding="UTF-8"%>
<%

if(request.getContentType() != null) {
	response.setContentType(request.getContentType() + ";charset=UTF-8");
}

if(request.getContentType() != null && request.getContentType().contains("application/json")) { %>
{"result":[{"discription":"Internal Server Error","errorId":"500"}]}
<% } else {%>
500 Internal Server Error
<% }%>
