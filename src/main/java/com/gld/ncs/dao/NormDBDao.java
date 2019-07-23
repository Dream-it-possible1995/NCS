/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *获取定额库列表
 */

package com.gld.ncs.dao;

import com.gld.ncs.model.NormDB;

import java.util.List;

public interface NormDBDao {

    List<NormDB> selectNormDBs();
}
