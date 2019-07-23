package com.gld.ncs.controller;

import com.gld.ncs.dao.NormItemDao;
import com.gld.ncs.model.NormItem;
import com.gld.ncs.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NormItemController {

    @Autowired
    private NormItemDao normItemDao;

    // GET http://localhost:8080/api/v1/normitems?sectionId=
    @RequestMapping(value = "/normitems", method = RequestMethod.GET)
    public List<NormItem> getSections(int sectionId) {
        return normItemDao.selectNormItemBySectionId(sectionId);
    }
}