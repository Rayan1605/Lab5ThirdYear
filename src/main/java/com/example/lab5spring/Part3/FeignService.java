package com.example.lab5spring.Part3;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ToDoResponse fetchData2() {
ToDoResponse toDoResponse = toDoClient.fetchData2();
        System.out.println(toDoResponse);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return toDoResponse;
    }

    public ArrayList<ToDoResponse> FetchAll(){
        ArrayList<ToDoResponse> toDoResponse = toDoClient.fetchAllData();
        System.out.println(toDoResponse);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return toDoResponse;
    }


}
