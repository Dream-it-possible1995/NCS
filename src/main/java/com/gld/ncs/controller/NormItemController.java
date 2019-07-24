package com.gld.ncs.controller;

import com.gld.ncs.dao.NormItemDao;
import com.gld.ncs.dao.SectionDao;
import com.gld.ncs.model.NormItem;
import com.gld.ncs.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1")
public class NormItemController {

    @Autowired
    private NormItemDao normItemDao;

    @Autowired
    private SectionDao sectionDao;

    // GET http://localhost:8080/api/v1/normitems?sectionSid=
    @RequestMapping(value = "/normitems",method = RequestMethod.GET,params = "sectionId")
    public List<NormItem> getNormItems(int sectionId) {
        List<NormItem> list = new ArrayList<>();
        return getAllSections(list,sectionId);
    }
    public List<NormItem> getAllSections(List<NormItem> list,int sectionSid) {
        List<Section> subList = sectionDao.selectSectionsBySectionSid(sectionSid);//select * form section where sectionSid = #{sectionSid}
        if (subList.isEmpty()) {
            list.addAll(normItemDao.selectNormItemBySectionId(sectionSid));
        }
        else {
            for (Section section : subList) {
                getAllSections(list,section.getSectionId());
            }
        }
        return list;
    }
}