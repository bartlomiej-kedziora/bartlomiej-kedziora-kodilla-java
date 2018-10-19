package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {
    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> searchEmployeeByWord(String anyWord) {
        return employeeDao.retrieveEmployeeByAnyWord(anyWord);
    }

    public void saveToDb(Employee employee) {
        employeeDao.save(employee);
    }

    public void deleteFromDb(int employeeId) {
        employeeDao.delete(employeeId);
    }
}
