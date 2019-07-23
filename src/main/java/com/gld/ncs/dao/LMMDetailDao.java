/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *获取定额条目的人料机明细表
 */


package com.gld.ncs.dao;

import com.gld.ncs.model.LMMDetail;

import java.util.List;

public interface LMMDetailDao {
    List<LMMDetail> selectLMMDetailByNormItemId(int normItemId);
}
