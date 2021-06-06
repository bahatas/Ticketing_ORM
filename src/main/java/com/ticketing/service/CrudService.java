package com.ticketing.service;

import java.util.List;

public interface CrudService<T,ID> {

    List<T> findAll(); // user DTO, roleDTO or project DTO
    T findById(ID id);
    void delete(T object); // delete
    void deleteById(ID id);
    T save(T object); // save
    void update(T object);




}
