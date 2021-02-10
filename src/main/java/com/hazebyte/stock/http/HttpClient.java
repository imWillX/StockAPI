package com.hazebyte.stock.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpClient {

    public HttpClient() {}

    public Response call(Request request) throws IOException {
        URLConnection connection = request.getUrl().openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection) connection;

        httpURLConnection.setRequestMethod(request.getMethod());

        for (Map.Entry<String, String> headers: request.getHeaders()) {
            httpURLConnection.addRequestProperty(headers.getKey(), headers.getValue());
        }

        InputStream stream = httpURLConnection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String body = reader.lines().collect(Collectors.joining());

        Response response = new Response(request);
        response.setCode(httpURLConnection.getResponseCode());
        response.setBody(body);
        return response;
    }

}
