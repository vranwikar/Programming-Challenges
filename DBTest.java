import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//import com.marketshare.pricemaster.util.DBContext;


public class DBTest {
	final static String systemForecastStep = "PostLoadMRTask";
	private static HashMap<String, String> taskStatus = new HashMap<String, String>();
	public static void main(String [] args)
	{
		taskStatus.put(systemForecastStep", "DNR");
		taskStatus.put(alertsStep", "DNR");
		taskStatus.put(executiveSummaryStep", "DNR");
		taskStatus.put(auditStep", "DNR");
		taskStatus.put(eventAnalysisStep", "DNR");
		String state="COMPLETE";
		if(taskStatus.get(systemForecastStep).equalsIgnoreCase("DNR")){
			taskStatus.put(systemForecastStep, state);
		}
		else{
			System.out.println("Error in Initialization of Task Status Map");
		}
		
		getConnection();
		
	}
	public static void getConnection() {
		Map<String, String> plMap = new HashMap<String, String>();
		plMap.put("p08", "{ms_code=p08, current_price=25.0, single_open=8108}");
		plMap.put("p01", "{ms_code=p08, current_price=25.0, single_open=8108}");
		plMap.put("p02", "{ms_code=p08, current_price=25.0, single_open=8108}");
		plMap.put("p03", "{ms_code=p08, current_price=25.0, single_open=8108}");
		plMap.put("p04", "{ms_code=p08, current_price=25.0, single_open=8108}");
		plMap.put("p05", "{ms_code=p08, current_price=25.0, single_open=8108}");
		plMap.put("p06", "{ms_code=p08, current_price=25.0, single_open=8108}");
		plMap.put("p07", "{ms_code=p08, current_price=25.0, single_open=8108}");
		//printMap(plMap);
		Map<String, String> treeMap = new TreeMap<String, String>(plMap);
		//printMap(treeMap);
		Iterator<String> plMapKeyIter = treeMap.keySet().iterator();
		
		while(plMapKeyIter.hasNext())
		{
			System.out.println(plMapKeyIter.next());
		}
	}
	
	public static void printMap(Map<String, String> map) {
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
				+ entry.getValue());
		}
	}
}