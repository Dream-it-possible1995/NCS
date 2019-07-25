package com.gld.ncs.controller;

import com.gld.ncs.entity.LMMDetail;
import com.gld.ncs.entity.NormDB;
import com.gld.ncs.entity.NormItem;
import com.gld.ncs.entity.Section;
import com.gld.ncs.service.NcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NcsController {

    // GET http://localhost:8080/api/v1/normDBs
    @RequestMapping(value = "/normDBs", method = RequestMethod.GET)
    public List<NormDB> getNormDBs() {
        return ncsService.getNormDBs();
    }

    // GET http://localhost:8080/api/v1/sections?normdbId=
    @RequestMapping(value = "/sections", method = RequestMethod.GET,params = "normdbId")
    public List<Section> getSections(int normdbId) {
        return ncsService.getSections(normdbId);
    }

    // GET http://localhost:8080/api/v1/normitems?sectionSid=
    @RequestMapping(value = "/normitems",method = RequestMethod.GET,params = "sectionId")
    public List<NormItem> getNormItems(int sectionId) {
        return ncsService.getNormItems(sectionId);
    }

    // GET http://localhost:8080/api/v1/lmmdetails?normItemId=
    @RequestMapping(value = "/lmmdetails", method = RequestMethod.GET,params = "normItemId")
    public List<LMMDetail> getLMMDetails(int normItemId) {
        return ncsService.getLMMDetails(normItemId);
    }

    @Autowired
    private NcsService ncsService;
}
