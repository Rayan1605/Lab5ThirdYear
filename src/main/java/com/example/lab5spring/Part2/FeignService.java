package com.example.lab5spring.Part2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FeignService {

    private final ToDoClient toDoClient;
    public ToDoResponse fetchData() {
    ToDoResponse toDoResponse = toDoClient.fetchData();
        System.out.println(toDoResponse);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return toDoResponse;

    }
}
