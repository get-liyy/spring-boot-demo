package com.zero.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通用接口
 * Created by liyanyong on 2017/12/28.
 */
@Service
public interface IService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

    //TODO 其他...
}
