package com.southwind.repository;

import com.southwind.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
public interface MenuRepository {
    public List<Menu> findAll(int index,int limit);
    public int count();
    public void save(Menu menu);
    public Menu findById(long id);
    public void update(Menu menu);
    public void deleteById(long id);
}