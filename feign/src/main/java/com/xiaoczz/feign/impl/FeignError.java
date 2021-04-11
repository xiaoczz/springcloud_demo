package com.xiaoczz.feign.impl;

import com.xiaoczz.entity.Student;
import com.xiaoczz.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author xiaoczz
 * @date 2021/4/11 18:37
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中.......";
    }
}
