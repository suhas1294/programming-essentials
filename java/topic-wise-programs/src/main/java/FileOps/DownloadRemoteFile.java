package FileOps;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.*;
import java.time.Instant;

public class DownloadRemoteFile {
    public static void main(String[] args) throws IOException {
        String cookie = "sid=qsniu2rub3bfs1mc;path=/;uid=45a232b0-b846-11e9-888a-9600002bf2b8;path=/;";
        String url = "https://example.com/extensions/6325ea70-158e-11ea-a7a2-9600002bf2bc.zip";

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.addHeader("Cookie", cookie);
        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();

        File targetFile = new File("qwertyuiop.zip");

        if (entity != null) {
            InputStream inputStream = entity.getContent();
            OutputStream outputStream = new FileOutputStream(targetFile);
            IOUtils.copy(inputStream, outputStream);
            outputStream.close();
        }

    }
}
