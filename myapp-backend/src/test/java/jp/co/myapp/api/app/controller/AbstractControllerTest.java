package jp.co.myapp.api.app.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({ @ContextConfiguration({ "classpath:META-INF/spring/applicationContext-test.xml" }),
		@ContextConfiguration("classpath:META-INF/spring/spring-mvc-test.xml") })
@WebAppConfiguration()
public abstract class AbstractControllerTest {

	private static final Logger logger = LoggerFactory.getLogger(AbstractControllerTest.class);
	@Inject
	protected WebApplicationContext webApplicationContext;
	protected List<String> ignoreList;
	protected MockMvc mockMvc;
	protected String methodName;
	protected String className;

	@Rule
	public TestWatcher testWatcher = new TestWatcher() {
		@Override
		protected void starting(final Description description) {
			logger.debug("JUnitテスト: " + description.getClassName() + "#" + description.getMethodName() + "は開始しました。");
		}

		@Override
		protected void finished(final Description description) {
			logger.debug("JUnitテスト: " + description.getClassName() + "#" + description.getMethodName() + "は終了しました。");
		}

		@Override
		protected void failed(Throwable e, Description description) {
			logger.debug(
					"JUnitテスト: " + description.getClassName() + "#" + description.getMethodName() + "はエラーが発生しました。");
		}
	};

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).alwaysDo(log()).build();
		ignoreList = new ArrayList<>();
	}

	/**
	 * 無視Objectリストを追加
	 * 
	 * @param obj
	 */
	protected void addIgnoreJsonObject(String obj) {
		ignoreList.add(obj);
	}

	/**
	 * JSONのArrayに順が無視するでテストです。
	 *
	 * @param url
	 * @throws Exception
	 */
	protected void runMockTestIgnoreArrayOrder(String url) throws Exception {
		getCurrentTest();
		MvcResult mvcResult = mockMvc.perform(post(url).contentType(MediaType.APPLICATION_JSON).content(getInputJson()))
				.andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), false);
	}

	/**
	 * JSONのArrayに順が無視するでテストです。
	 *
	 * @param url
	 * @throws Exception
	 */
	protected void runMockTestIgnoreArrayOrder(String url, MockHttpSession... sessions) throws Exception {
		getCurrentTest();
		MockHttpServletRequestBuilder mrb = post(url);
		if (sessions != null && sessions.length > 0) {
			mrb.session(sessions[0]);
		}
		RequestBuilder rb = mrb.contentType(MediaType.APPLICATION_JSON).content(getInputJson());

		ResultActions ra = mockMvc.perform(rb);
		MvcResult mvcResult = ra.andReturn();
		
		compareJson(mvcResult.getResponse().getContentAsString(), false);
	}

	/**
	 * JSONのObjectが等しいでテストです。 POST
	 *
	 * @param url
	 * @return httpStatusCode
	 * @throws Exception
	 */
	protected int runMockTest(String url) throws Exception {
		getCurrentTest();
		MvcResult mvcResult = mockMvc.perform(post(url).contentType(MediaType.APPLICATION_JSON).content(getInputJson()))
				.andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), true);
		return mvcResult.getResponse().getStatus();
	}

	/**
	 * JSONのObjectが等しいでテストです。 GET <br>
	 * sesionに事前セットしておきたい場合にsessionを利用
	 *
	 * @param url
	 * @param session
	 * @return httpStatusCode
	 * @throws Exception
	 */
	protected int runMockGetTest(String url, MockHttpSession... sessions) throws Exception {
		getCurrentTest();
		MockHttpServletRequestBuilder mrb = get(url);
		RequestBuilder rb = mrb.contentType(MediaType.APPLICATION_JSON).params(getInputParams());
		if (sessions != null && sessions.length > 0)
			mrb.session(sessions[0]);

		ResultActions ra = mockMvc.perform(rb);
		MvcResult mvcResult = ra.andReturn();
		logger.info("runMockGetTest :" + mvcResult.getResponse().getContentAsString());
		compareJson(mvcResult.getResponse().getContentAsString(), true);
		logger.info("HttpStatus :" + mvcResult.getResponse().getStatus());
		return mvcResult.getResponse().getStatus();
	}

	/**
	 * ファイルDownloadが等しいでテストです。
	 *
	 * @param url
	 * @throws Exception
	 */
	protected void runDownloadMockTest(String url) throws Exception {
		getCurrentTest();
		MvcResult mvcResult = null;
		mvcResult = mockMvc.perform(get(url).params(getInputParams())).andReturn();
		String outCSV = "/" + className.replace(".", "/") + "." + methodName + ".out.csv";
		assertEquals(readJsonFileAsString(outCSV), mvcResult.getResponse().getContentAsString());
	}

	/**
	 * フJSONのObjectが等しいでテストです。 GET 。
	 *
	 * @param url
	 * @throws Exception
	 */
	protected void runMockGetTestWithJson(String url) throws Exception {
		getCurrentTest();
		MvcResult mvcResult = null;
		mvcResult = mockMvc.perform(get(url).params(getInputParams())).andReturn();
		compareJson(mvcResult.getResponse().getContentAsString(), true);
	}

	protected void compareJson(String resultJson, boolean strict) throws JSONException {
		String expectJson = getOutputJson();
		if (StringUtils.isEmpty(resultJson) && (StringUtils.isEmpty(expectJson) || "{}".equals(expectJson))) {
			return;
		}
		expectJson = removeObject(expectJson);
		resultJson = removeObject(resultJson);
		if (strict) {
			JsonParser parser = new JsonParser();
			JsonElement resultJsonObject = parser.parse(resultJson);
			JsonElement expectJsonObject = parser.parse(expectJson);
			String exp = new GsonBuilder().setPrettyPrinting().create().toJson(expectJsonObject);
			String res = new GsonBuilder().setPrettyPrinting().create().toJson(resultJsonObject);
			logger.info("expect:" + exp);
			logger.info("actual:" + res);
			assertEquals(exp, res);
		} else {
			logger.info("expect:" + expectJson);
			logger.info("actual:" + resultJson);

			JSONAssert.assertEquals(expectJson, resultJson, JSONCompareMode.NON_EXTENSIBLE);
		}
	}

	private String removeObject(String json) {
		JsonParser parser = new JsonParser();

		JsonElement je = parser.parse(json);
		if (je.isJsonObject()) {
			JsonObject jsonObject = parser.parse(json).getAsJsonObject();
			for (String ignore : ignoreList) {
				JsonObject tmp = jsonObject;
				String[] objs = ignore.split("\\.");
				int i = 0;
				for (; i < objs.length - 1; i++)
					tmp = tmp.getAsJsonObject(objs[i]);
				if (tmp != null)
					tmp.remove(objs[i]);
			}
			return jsonObject.toString();
		} else {
			return json;
		}
	}

	protected MultiValueMap<String, String> getInputParams() {
		String inJson = "/" + className.replace(".", "/") + "." + methodName + ".in.json";
		String json = readJsonFileAsString(inJson);

		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = new LinkedHashMap<>();
		MultiValueMap<String, String> multi = new LinkedMultiValueMap<String, String>();

		try {
			map = mapper.readValue(json, new TypeReference<LinkedHashMap<String, String>>() {
			});
			for (String key : map.keySet()) {
				List<String> lst = new ArrayList<>();
				lst.add(map.get(key));
				multi.put(key, lst);
			}
			System.out.println(multi);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return multi;
	}

	protected String getInputJson() {
		String inJson = "/" + className.replace(".", "/") + "." + methodName + ".in.json";
		return readJsonFileAsString(inJson);
	}

	protected String getOutputJson() {
		String outJson = "/" + className.replace(".", "/") + "." + methodName + ".out.json";
		return readJsonFileAsString(outJson);
	}

	private String readJsonFileAsString(String jsonFile) {
		InputStream inputStream = getClass().getResourceAsStream(jsonFile);
		if (inputStream == null) {
			fail("JUnitテスト: " + className + "#" + methodName + "のテスト関連ファイル" + jsonFile + "は存在しない。");
		}

		StringBuffer json = new StringBuffer();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
			int cnt = 0;
			String line;
			while ((line = reader.readLine()) != null) {
				if (cnt++ != 0) {
					json.append(System.lineSeparator());
				}
				json.append(line);
			}
		} catch (IOException e) {
			fail("ファイル" + jsonFile + "を読む込み時、エラーが発生しました。");
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				fail("ファイル" + jsonFile + "を読む込み時、エラーが発生しました。");
			}
		}
		return json.toString();
	}

	protected void getCurrentTest() {
		StackTraceElement[] trace = Thread.currentThread().getStackTrace();
		for (int i = trace.length - 1; i > 0; --i) {
			StackTraceElement ste = trace[i];
			try {
				Class<?> cls = Class.forName(ste.getClassName());
				Method method = cls.getDeclaredMethod(ste.getMethodName());
				Test annotation = method.getAnnotation(Test.class);
				if (annotation != null) {
					className = ste.getClassName();
					methodName = ste.getMethodName();
					break;
				}
			} catch (ClassNotFoundException e) {
			} catch (NoSuchMethodException e) {
			} catch (SecurityException e) {
			}
		}

	}
}
