package com.hobby.hobby_world.controller;

import com.hobby.hobby_world.model1.hobbyList1;
import com.hobby.hobby_world.service.hobbyListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class hobbyListController {

    @Autowired
    private hobbyListService hobbyListService;

    @GetMapping("/get-hobbyList")
    public Iterable<hobbyList1> getHobbyList() {
        return hobbyListService.getHobbyList();
    }
}
