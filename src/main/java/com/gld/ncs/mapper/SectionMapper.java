/*
 * Copyright 2012-2019 Glodon
 * wangwc
 *获取章节目录
 */

package com.gld.ncs.mapper;

import com.gld.ncs.entity.Section;

import java.util.List;

public interface SectionMapper {
    List<Section> selectSectionsByNormDBId(int normdbId);
    List<Section> selectSectionsBySectionSid(int sid);
}
