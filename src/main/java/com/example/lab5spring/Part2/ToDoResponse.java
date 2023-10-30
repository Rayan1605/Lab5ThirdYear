package com.example.lab5spring.Part2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ToDoResponse {
    @JsonProperty("userId")
    private int userId;

    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("completed")
    private boolean completed;



}
