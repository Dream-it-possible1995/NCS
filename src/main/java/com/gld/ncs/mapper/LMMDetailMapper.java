/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *获取定额条目的人料机明细表
 */


package com.gld.ncs.mapper;

import com.gld.ncs.entity.LMMDetail;

import java.util.List;

public interface LMMDetailMapper {
    List<LMMDetail> selectLMMDetailByNormItemId(int normItemId);
}
