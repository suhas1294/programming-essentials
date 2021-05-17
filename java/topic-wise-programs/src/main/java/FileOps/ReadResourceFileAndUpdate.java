package FileOps;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.*;

public class ReadResourceFileAndUpdate {
		public static void main(String[] args) throws IOException {
				File file = new File(ReadResourceFileAndUpdate.class.getClassLoader().getResource("filename.txt").getFile());
				String s = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
				String uuid = "c9c82d30-5431-11e8-a530-1c1b0d10c603";
				// replacing all ent_ids
				String intEntId = "'ent_id': '"+ uuid +"',";
				s = s.replace("'ent_id': '',", intEntId);
				System.out.println(s);
		}
}
