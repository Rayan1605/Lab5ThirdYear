package com.example.lab5spring.Part3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface ToDoClient {

    @GetMapping("/todos/1")
    ToDoResponse fetchData();

    @GetMapping("/todos/196")
    ToDoResponse fetchData2();

    @GetMapping("/todos")
    ArrayList<ToDoResponse> fetchAllData();
}
