package jp.co.myapp.api.app.controller.config;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.Base64;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.DefaultCsrfToken;
import org.springframework.test.web.servlet.MvcResult;

import jp.co.myapp.common.Constants;
import jp.co.myapp.common.util.CryptUtil;
import jp.co.myapp.common.util.MyUtils;
import jp.co.myapp.api.app.controller.AbstractControllerTest;
import jp.co.myapp.api.app.mock.MockSystemDate;

public class ConfigControllerTest extends AbstractControllerTest {

	@Value("#{system.sig_key}")
	private String SIG_KEY;

	@Test
	public void testConfig1() throws Exception {
		getCurrentTest();
		setSystemTime("20180813");
		MvcResult mvcResult = mockMvc
				.perform(get("/api/config").param("agency_code", "9401364").accept(MediaType.APPLICATION_JSON))
				.andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), true);
	}

	@Test
	public void testConfig11() throws Exception {
		getCurrentTest();
		setSystemTime("20190911");
		MvcResult mvcResult = mockMvc
				.perform(get("/api/config").param("agency_code", "9401364").accept(MediaType.APPLICATION_JSON))
				.andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), true);
	}

	@Test
	public void testConfig2() throws Exception {
		getCurrentTest();
		setSystemTime("20180813");
		MvcResult mvcResult = mockMvc
				.perform(get("/api/config").param("agency_code", "9401364").accept(MediaType.APPLICATION_JSON)).andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), true);
	}

	@Test
	public void testConfig3() throws Exception {
		getCurrentTest();
		setSystemTime("20180813");
		MockHttpSession mockSession = new MockHttpSession();
		mockSession.setAttribute("Ref", "1");
		mockSession.setAttribute("RefAction", "addressearch");
		MvcResult mvcResult = mockMvc.perform(get("/api/config").param("agency_code", "9401364").session(mockSession)
				.accept(MediaType.APPLICATION_JSON)).andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), true);
	}

	@Test
	public void testConfigCsrf() throws Exception {

		getCurrentTest();
		setSystemTime("20180813");
		CsrfToken newToken = new DefaultCsrfToken("testHeaderName", "testParameterName", "csrfToken");
		MockHttpSession mockSession = new MockHttpSession();
		mockSession.setAttribute("agency_code", Base64.getUrlEncoder()
				.encodeToString(CryptUtil.encrypt(SIG_KEY, "9401364").getBytes()));
		MvcResult mvcResult = mockMvc.perform(get("/api/config").requestAttr("_csrf", newToken).session(mockSession)
				.accept(MediaType.APPLICATION_JSON)).andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), true);
	}

	@Test
	public void testConfigSessionMyToken() throws Exception {
		getCurrentTest();
		setSystemTime("20180813");
		MockHttpSession mockSession = new MockHttpSession();
		mockSession.setAttribute("myToken", "myTokenFromSession");
		MvcResult mvcResult = mockMvc
				.perform(get("/api/config").session(mockSession).param("agency_code", "9401364").accept(MediaType.APPLICATION_JSON)).andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), true);
	}
	
	@Test
	public void testConfigError() throws Exception {
		getCurrentTest();
		setSystemTime("20180813");
		MvcResult mvcResult = mockMvc
				.perform(get("/api/config").accept(MediaType.APPLICATION_JSON)).andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), true);
	}

	private void setSystemTime(String date) {
		Date mockDate = MyUtils.changeToDate(date, Constants.DATE_FORMAT_YYYYMMDD);
		MockSystemDate system = new MockSystemDate();
		system.setNowTime(mockDate.getTime());
	}

}
