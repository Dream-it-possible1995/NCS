package com.gld.ncs.controller;

import com.gld.ncs.dao.NormDBDao;
import com.gld.ncs.model.NormDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NormDBController {

    @Autowired
    private NormDBDao normDBDao;

    // GET http://localhost:8080/api/v1/normDBs
    @RequestMapping(value = "/normDBs", method = RequestMethod.GET)
    public List<NormDB> getNormDBs() {
            return normDBDao.selectNormDBs();
        }
}