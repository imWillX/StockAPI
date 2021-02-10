package com.hazebyte.stock;

import com.hazebyte.stock.http.HttpClient;
import com.hazebyte.stock.http.Request;
import com.hazebyte.stock.http.Response;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class HttpClientTest {

    @Test
    public void call() throws IOException {
        String link = "https://www.google.com";
        HttpClient client = new HttpClient();
        URL url = new URL(link);
        Request request = Request.builder()
                .url(url)
                .get();
        Response response = client.call(request);
        assertEquals(200, response.getCode());
    }
}