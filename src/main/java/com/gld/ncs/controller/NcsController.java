package com.gld.ncs.controller;

import com.gld.ncs.entity.*;
import com.gld.ncs.service.NcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Section> list1 = ncsService.getSections(normdbId);
        List<Section> list2 = new ArrayList<>();
        Map<Integer,Section> map = new HashMap<>();
        for (Section section : list1) {
            map.put(section.getId(),section);
            if (section.getPid() == 1) {
                list2.add(section);//加入顶层节点
            }
        }
        for (Section section : list1) {
            Section sectionParent = (Section)map.get(section.getSid());
            if (sectionParent != null) {
                if (sectionParent.getChildList() == null) {
                    sectionParent.setChildList(new ArrayList<Section>());
                }
                sectionParent.getChildList().add(section);
            }
        }
        return list2;
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
