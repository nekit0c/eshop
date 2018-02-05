package io.khasang.eshop.service;

import io.khasang.eshop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * method for receiving all cats from DB
     *
     * @return List of all employees
     *
     */

    List<Employee> getAllCats();

    /**
     *
     * method for receiving specify Employee by Id
     * @param id = employees id
     * @return employee by id
     */
    Employee getById(long id);
}
