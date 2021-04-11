package com.xiaoczz.repository;

import com.xiaoczz.entity.Student;

import java.util.Collection;

/**
 * @author xiaoczz
 * @date 2021/4/9 20:24
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
