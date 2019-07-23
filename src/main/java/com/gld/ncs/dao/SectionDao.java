/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *获取章节目录
 */

package com.gld.ncs.dao;

import com.gld.ncs.model.Section;

import java.util.List;

public interface SectionDao {
    List<Section> selectSectionsByNormDBId(int normdbId);
}
