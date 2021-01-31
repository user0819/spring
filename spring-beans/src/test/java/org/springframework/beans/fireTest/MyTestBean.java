package org.springframework.beans.fireTest;

public class MyTestBean {
	private String testStr = "testStr";

	public MyTestBean() {
	}

	public MyTestBean(String testStr) {
		this.testStr = testStr;
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"testStr='" + testStr + '\'' +
				'}';
	}
}
