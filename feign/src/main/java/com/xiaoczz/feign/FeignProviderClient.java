package com.xiaoczz.feign;

import com.xiaoczz.entity.Student;
import com.xiaoczz.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author xiaoczz
 * @date 2021/4/11 12:06
 */
@FeignClient(value = "provider" ,fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}