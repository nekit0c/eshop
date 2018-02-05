package io.khasang.eshop.service.impl;

import io.khasang.eshop.dao.CatDao;
import io.khasang.eshop.entity.Cat;
import io.khasang.eshop.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("catService")
public class CatServiceImpl implements CatService {
    @Autowired
    private CatDao catDao;

    @Override
    public List<Cat> getAllCats() {
        return catDao.getList();
    }

    @Override
    public Cat getById(long id) {
        return catDao.getById(id);
    }
}
