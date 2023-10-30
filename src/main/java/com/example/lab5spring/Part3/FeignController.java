package com.example.lab5spring.Part3;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
public class FeignController {

    private final FeignService feignService;

    @GetMapping("/feign")
    public String getFeignData() throws Exception{
        long startTime = System.currentTimeMillis();

        List<CompletableFuture<ToDoResponse>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            CompletableFuture<ToDoResponse> future = CompletableFuture.supplyAsync(feignService::fetchData);
            futures.add(future);
        }

        CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

        allOf.get();// wait for all futures to complete
        long endTime = System.currentTimeMillis();

        return "Time taken to complete 10 async requests: " + (endTime - startTime) + " milliseconds";

    }

    @GetMapping("/ReturnList")
    ArrayList<ToDoResponse> FetchAll(){
        return feignService.FetchAll();
    }


    @GetMapping("/feign2")
    public ToDoResponse GetTodo() throws Exception {


    }
}
