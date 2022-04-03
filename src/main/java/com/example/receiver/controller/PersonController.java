package com.example.receiver.controller;

import com.example.receiver.dto.Person;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/person")
@AllArgsConstructor
public class PersonController {

    private final RestTemplate restTemplate;


    @GetMapping
    public ResponseEntity<Person> getPerson(){
        ResponseEntity<Person> person = restTemplate.getForEntity("http://localhost:6060/api/person", Person.class);
        return person;
    }

}
