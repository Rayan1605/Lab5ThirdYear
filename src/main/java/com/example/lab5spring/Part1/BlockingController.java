package com.example.lab5spring.Part1;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BlockingController {

    private final BlockingService blockingService;

    @GetMapping("/blocking")
    public String getBlockingData(){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {

            blockingService.fetchData();
        }
        long endTime = System.currentTimeMillis();
        return "Blocking data: " + (endTime - startTime) + " ms";
    }


}
