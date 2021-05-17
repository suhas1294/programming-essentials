package uiAutomation;// this question was asked in nextgen interview
// accept number of lines from user and print that much number of lines

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileLineByLine {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/test/resources/test2.txt"));
		int n = Integer.parseInt(args[0]);
		String line;
		for (int i=1; i<=n;i++){
			line = br.readLine();
			if (line == (null)){
				System.out.println("End of line, exiting");
				break;
			}else{
				System.out.println(i + " " + line);
			}
		}
	}
}