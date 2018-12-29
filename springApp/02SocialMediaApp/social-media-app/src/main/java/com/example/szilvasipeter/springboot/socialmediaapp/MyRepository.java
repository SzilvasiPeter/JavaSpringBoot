package com.example.szilvasipeter.springboot.socialmediaapp;

import reactor.core.publisher.Flux;

public interface MyRepository {
    Flux<Image> findall();
}
