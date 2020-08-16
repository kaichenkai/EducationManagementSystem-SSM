package com.company.service.base;

/**
 * @author kaichenkai
 * @date 2020-08-15 16:53
 */
public interface IBaseService<T> {
    public T findById(Integer id);
    public T findById(String id);

    public void deleteById(Integer id);
    public void deleteById(String id);

    public void update(T t);

    public void insert(T t);
}
