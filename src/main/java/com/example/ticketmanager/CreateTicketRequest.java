package com.example.ticketmanager;

public class CreateTicketRequest {
    private String name;
    private String content;
    private long userID;

    public CreateTicketRequest(){}

    public String getName() {return name;}
    public String getContent() {return content;}
    public void setName(String name) {this.name = name;}
    public void setContent(String content) {this.content = content;}

    public long getUserID() {return userID;}

    public void setUser(long userID) {this.userID = userID;}
}
