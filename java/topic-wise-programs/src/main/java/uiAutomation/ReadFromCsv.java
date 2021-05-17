package uiAutomation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFromCsv {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/test/resources/test.csv"));
		String line =  null;
		HashMap<String,String> map = new HashMap<String, String>();
		
		while((line=br.readLine())!=null){
			String str[] = line.split(",");
			for(int i=1;i<str.length;i++){
				String arr[] = str[i].split(":");
				map.put(arr[0], arr[1]);
			}
		}
		System.out.println(map);
	}
}
