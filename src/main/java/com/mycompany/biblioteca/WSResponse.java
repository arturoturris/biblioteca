package com.mycompany.biblioteca;

import java.io.Serializable;

public class WSResponse implements Serializable{
    private String code;
    private String message;
    private String data;
    private String status;

    public WSResponse() {
    }

    public WSResponse(String code, String message, String data, String status) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.status = status;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
