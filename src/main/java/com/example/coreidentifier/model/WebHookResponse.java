package com.example.coreidentifier.model;

public class WebHookResponse {

    private String status;

    public WebHookResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
