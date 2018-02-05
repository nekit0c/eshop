package io.khasang.eshop.service;

import io.khasang.eshop.entity.Cat;

import java.util.List;

public interface CatService {

    /**
     * method for receiving all cats from DB
     *
     * @return List of all cats
     *
     */

    List<Cat> getAllCats();

    /**
     *
     * method for receiveng specify Cat by Id
     * @param id = cat's id
     * @return cat by id
     */
    Cat getById(long id);
}
