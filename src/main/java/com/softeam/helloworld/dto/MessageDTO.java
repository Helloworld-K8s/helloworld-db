package com.softeam.helloworld.dto;

public class MessageDTO {

    private int id;
    private String body;

    public MessageDTO(int i, String body) {
        this.id = i;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
