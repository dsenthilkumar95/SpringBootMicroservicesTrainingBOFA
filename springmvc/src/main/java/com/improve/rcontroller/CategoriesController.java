package com.improve.rcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {
    @GetMapping(path = "/categories/{id}", produces = "application/json", consumes = "application/json")
    public int getCategories(@PathVariable int id) {
        return id;
    }
}
