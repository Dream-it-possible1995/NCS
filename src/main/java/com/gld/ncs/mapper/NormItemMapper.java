/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *获取定额条目明细
 */

package com.gld.ncs.mapper;

import com.gld.ncs.entity.NormItem;

import java.util.List;

public interface NormItemMapper {
    List<NormItem> selectNormItemBySectionId(int sectionId);
}
