package com.gld.ncs.controller;

import com.gld.ncs.dao.LMMDetailDao;
import com.gld.ncs.dao.NormItemDao;
import com.gld.ncs.model.LMMDetail;
import com.gld.ncs.model.NormItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LMMDetailController {

    @Autowired
    private LMMDetailDao lmmDetailDao;

    // GET http://localhost:8080/api/v1/lmmdetail?normItemId=
    @RequestMapping(value = "/lmmdetail", method = RequestMethod.GET)
    public List<LMMDetail> getSections(int normItemId) {
        return lmmDetailDao.selectLMMDetailByNormItemId(normItemId);
    }
}