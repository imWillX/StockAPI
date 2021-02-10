package com.hazebyte.stock.http;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Request {

    private URL url;

    private String method;

    private Map<String, String> headers;

    private Request() {
        headers = new HashMap<>();
    }

    public String getHeaders(String key) {
        return headers.get(key);
    }

    public Set<Map.Entry<String, String>> getHeaders() {
        return headers.entrySet();
    }

    public URL getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public Request url(URL url) {
        this.url = url;
        return this;
    }

    public Request addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    public Request removeHeader(String key) {
        headers.remove(key);
        return this;
    }

    public Request get() {
        return method("GET");
    }

    public Request post() {
        return method("POST");
    }

    public Request delete() {
        return method("DELETE");
    }

    public Request patch() {
        return method("PATCH");
    }

    public Request method(String method) {
        this.method = method;
        return this;
    }

    public static Request builder() {
        Request request = new Request();
        return request;
    }

    @Override
    public String toString() {
        return "Request{" +
                "url=" + url +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                '}';
    }
}
