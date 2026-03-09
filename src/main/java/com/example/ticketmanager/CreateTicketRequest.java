package com.example.ticketmanager;

public class CreateTicketRequest {
    private String name;
    private String content;
    private long userId;

    public CreateTicketRequest(){}

    public String getName() {return name;}
    public String getContent() {return content;}
    public void setName(String name) {this.name = name;}
    public void setContent(String content) {this.content = content;}

    public long getUserId() {return userId;}

    public void setUser(long userID) {this.userId = userID;}
}
