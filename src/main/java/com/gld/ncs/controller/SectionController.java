package com.gld.ncs.controller;

import com.gld.ncs.dao.NormItemDao;
import com.gld.ncs.dao.SectionDao;
import com.gld.ncs.model.NormItem;
import com.gld.ncs.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SectionController {

    @Autowired
    private SectionDao sectionDao;

    private List<Section> lowestList;

    // GET http://localhost:8080/api/v1/sections?normId=
    @RequestMapping(value = "/sections", method = RequestMethod.GET,params = "normdbId")
    public List<Section> getSections(int normdbId) {
        return sectionDao.selectSectionsByNormDBId(normdbId);
    }
}