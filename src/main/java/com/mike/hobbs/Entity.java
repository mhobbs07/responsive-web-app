package com.mike.hobbs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entity {

    private String status;
    private String[] messages;
    private List<String> stringsList;

    public Entity() {
    }

    public String[] getMessage() {
        return messages;
    }

    public void setMessage(String[] messages) {
        this.messages = messages;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private void generateString() {
        stringsList = new ArrayList<>(messages.length);
        stringsList.addAll(Arrays.asList(messages));
    }

    @Override
    public String toString() {
        generateString();
        return "Entity{" +
                "status=" + status +
                ", message=" +
                stringsList +
                "}";
    }
}
