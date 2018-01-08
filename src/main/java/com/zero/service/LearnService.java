package com.zero.service;


import com.zero.domain.LearnResource;
import com.zero.model.LeanQueryLeanListReq;
import com.zero.util.Page;

import java.util.List;

/**
 * Created by liyanyong on 2017/12/26.
 */

public interface LearnService extends IService<LearnResource> {
    List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page);
    void deleteBatch(Long[] ids);
}
