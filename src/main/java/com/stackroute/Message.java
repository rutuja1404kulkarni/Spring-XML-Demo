package com.stackroute;

import org.springframework.stereotype.Component;


public class Message
{
    private String message ="This is first demo string" ;

    public Message() { }

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void printing()
    {
        System.out.println("gghjumkm");
    }
}
