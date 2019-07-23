package com.gld.ncs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class NormDBController {

    @RequestMapping(value = "/normDBs/", method = RequestMethod.GET)
    public void getNormDB() {
    }

    // POST http://localhost:8080/api/v1/normDBs
    @RequestMapping(value = "/normDBs/", method = RequestMethod.POST)
    public void addNormDB() {
    }

    @RequestMapping(value = "/normDBs/", method = RequestMethod.DELETE)
    public  void deleteNormDB(@PathVariable("id") String id) {
    }

}