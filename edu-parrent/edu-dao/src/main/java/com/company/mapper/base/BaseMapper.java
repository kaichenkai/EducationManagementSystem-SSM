package com.company.mapper.base;

/**
 * @author kaichenkai
 * @date 2020-08-15 16:25
 */
public interface BaseMapper<T> {
    public T findById(Integer id);
    public T findById(String id);

    public void deleteById(Integer id);
    public void deleteById(String id);

    public void update(T t);

    public void insert(T t);
}
