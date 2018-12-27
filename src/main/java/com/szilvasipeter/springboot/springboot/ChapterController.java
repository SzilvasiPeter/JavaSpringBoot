package com.szilvasipeter.springboot.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

    private final ChapterRepository repository;

    public ChapterController(ChapterRepository repository){
        this.repository = repository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> listing(@RequestParam(required = false, defaultValue = "")String name){
        return repository.findAll();
    }

}
