/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *获取定额库列表
 */

package com.gld.ncs.mapper;

import com.gld.ncs.entity.NormDB;

import java.util.List;

public interface NormDBMapper {

    List<NormDB> selectNormDBs();
}
