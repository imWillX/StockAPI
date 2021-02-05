package com.hazebyte.stonk.net;

import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class HttpClientTest {

    @Test
    public void get() throws IOException {
        String link = "https://www.google.com";
        HttpClient client = new HttpClient();
        URL url = new URL(link);
        HttpURLConnection connection = client.get(url);
        assertEquals(200, connection.getResponseCode());
    }
}