package com.hazebyte.stock.net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class HttpClient {

    private Map<String, String> requestProperties;

    public HttpClient() {
        requestProperties = new HashMap<>();

        requestProperties.put("accept", "application/json");
    }

    public HttpURLConnection get(URL url) throws IOException {
        URLConnection connection = url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection) connection;

        httpURLConnection.setRequestMethod("GET");

        for (Map.Entry<String, String> entry: requestProperties.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }

        return httpURLConnection;
    }

    /**
     * Sets a default property.
     *
     * @param key the key of the property.
     * @param value the value of the property.
     */
    public void setRequestProperty(String key, String value) {
        requestProperties.put(key, value);
    }

    /**
     * Returns a default property.
     *
     * @param key the key of the property.
     * @return a default property.
     */
    public String getRequestProperty(String key) {
        return requestProperties.get(key);
    }
}
