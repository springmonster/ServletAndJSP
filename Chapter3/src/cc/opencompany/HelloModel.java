package cc.opencompany;

import java.util.HashMap;
import java.util.Map;

public class HelloModel {
	private Map<String, String> map = new HashMap<>();

	public HelloModel() {
		map.put("a", "message a");
		map.put("b", "message b");
		map.put("c", "message c");
	}

	public String doHello(String user) {
		return map.get(user) + ", " + user + "!";
	}
}
