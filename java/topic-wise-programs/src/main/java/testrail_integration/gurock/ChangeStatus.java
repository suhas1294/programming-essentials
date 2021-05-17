package testrail_integration.gurock;

import org.json.simple.JSONObject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ChangeStatus {
	public static void main(String args[]) throws IOException, APIException {

		String baseurl = "https://companyname.testrail.io/";

		APIClient client = new APIClient(baseurl);
		client.setUser("username@companyname.com");
		client.setPassword("");

		//getting details of a test case
		JSONObject tc = (JSONObject) client.sendGet("get_case/4748");
		System.out.println(tc);

		//getting run_id
		/*JSONObject tc = (JSONObject) client.sendGet("get_run/4748");
		System.out.println(tc);*/

		//updating status of a test case run
		Map data = new HashMap();
		data.put("status_id", new Integer(1));
		data.put("comment", "This test worked fine!");
		//JSONObject r = (JSONObject) client.sendPost("add_result_for_case/38/47", data);
		JSONObject r = (JSONObject) client.sendPost("add_result_for_case/1269/914474", data);

		System.out.println(r);
	}
}

