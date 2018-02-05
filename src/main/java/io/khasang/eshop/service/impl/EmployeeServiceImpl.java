package io.khasang.eshop.service.impl;

import io.khasang.eshop.dao.EmployeeDao;
import io.khasang.eshop.entity.Employee;
import io.khasang.eshop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllCats() {
        return employeeDao.getList();
    }

    @Override
    public Employee getById(long id) {
        return employeeDao.getById(id);
    }
}
