package com.example.ticketmanager;

public class CreateTicketRequest {
    private String name;
    private String content;

    public CreateTicketRequest(){}

    public String getName() {return name;}
    public String getContent() {return content;}
    public void setName(String name) {this.name = name;}
    public void setContent(String content) {this.content = content;}

}
