package com.hazebyte.stock.http;

public class Response {

    private Request request;

    private int code;

    private String body;

    public Response(Request request) {
        this.request = request;
    }

    public Request getRequest() {
        return request;
    }

    public int getCode() {
        return code;
    }

    protected void setCode(int code) {
        this.code = code;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Response{" +
                "request=" + request +
                ", code=" + code +
                ", body='" + body + '\'' +
                '}';
    }
}
