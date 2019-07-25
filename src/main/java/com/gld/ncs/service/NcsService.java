package com.gld.ncs.service;

import com.gld.ncs.entity.LMMDetail;
import com.gld.ncs.entity.NormDB;
import com.gld.ncs.entity.NormItem;
import com.gld.ncs.entity.Section;
import com.gld.ncs.mapper.LMMDetailMapper;
import com.gld.ncs.mapper.NormDBMapper;
import com.gld.ncs.mapper.NormItemMapper;
import com.gld.ncs.mapper.SectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NcsService {

    public List<NormDB> getNormDBs() {
        return normDBMapper.selectNormDBs();
    }

    public List<Section> getSections(int normdbId) {
        return sectionMapper.selectSectionsByNormDBId(normdbId);
    }

    public List<NormItem> getNormItems(int sectionId) {
        List<NormItem> list = new ArrayList<>();
        return getAllSections(list,sectionId);
    }

    public List<NormItem> getAllSections(List<NormItem> list,int sid) {
        List<Section> subList = sectionMapper.selectSectionsBySectionSid(sid);
        if (subList.isEmpty()) {
            list.addAll(normItemMapper.selectNormItemBySectionId(sid));
        }
        else {
            for (Section section : subList) {
                getAllSections(list,section.getId());
            }
        }
        return list;
    }

    public List<LMMDetail> getLMMDetails(int normItemId) {
        return lmmDetailMapper.selectLMMDetailByNormItemId(normItemId);
    }

    @Autowired
    NormDBMapper normDBMapper;

    @Autowired
    SectionMapper sectionMapper;

    @Autowired
    NormItemMapper normItemMapper;

    @Autowired
    LMMDetailMapper lmmDetailMapper;
}
