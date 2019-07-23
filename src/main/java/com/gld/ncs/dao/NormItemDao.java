/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *获取定额条目明细
 */

package com.gld.ncs.dao;

import com.gld.ncs.model.NormItem;

import java.util.List;

public interface NormItemDao {
    List<NormItem> selectNormItemBySectionId(int sectionId);
}
