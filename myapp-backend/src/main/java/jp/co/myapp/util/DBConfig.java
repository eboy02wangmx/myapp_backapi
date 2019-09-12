package jp.co.myapp.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBConfig {
	private String driverClassName;
	private String userName;
	private String password;
	private String url;

	public DBConfig() {
		InputStream inStream = DBConfig.class.getResourceAsStream("/jdbc.properties");
		Properties properties = new Properties();
		try {
			properties.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.driverClassName = properties.getProperty("jdbc.driverClassName");
		this.userName = properties.getProperty("jdbc.userName");
		this.password = properties.getProperty("jdbc.password");
		this.url = properties.getProperty("jdbc.url");
	}

	public DBConfig(String driverClassName, String userName, String password,
			String url) {
		super();
		this.driverClassName = driverClassName;
		this.userName = userName;
		this.password = password;
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}