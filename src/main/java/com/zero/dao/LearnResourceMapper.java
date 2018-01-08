package com.zero.dao;

import com.zero.domain.LearnResource;
import com.zero.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface LearnResourceMapper extends MyMapper<LearnResource> {
    List<LearnResource> queryLearnResouceList(Map<String,Object> map);
}