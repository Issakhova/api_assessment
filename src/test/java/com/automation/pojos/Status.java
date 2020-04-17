package com.automation.pojos;

public class Status {
    private String status;

    public String getStatus() {
        return status;
    }

    public Status(String status) {
        this.status = status;
    }
    public Status(){

    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + status + '\'' +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
