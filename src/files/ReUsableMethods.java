package files;

import io.restassured.path.json.JsonPath;

public class ReUsableMethods {
	
	public static JsonPath rawToJson(String response) {
		JsonPath js1 = new JsonPath(response);
		
		System.out.println("Jira1");
		System.out.println("Jira2");
		System.out.println("Jira3");
		
		System.out.println("Jira4");
		System.out.println("Jira5");
		
		System.out.println("Jira6");
		System.out.println("Jira7");
		
		return js1;
	}

}
