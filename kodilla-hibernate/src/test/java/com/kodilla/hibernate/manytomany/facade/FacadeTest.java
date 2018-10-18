package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTest {
    @Autowired
    CompanyFacade companyFacade;
    @Autowired
    EmployeeFacade employeeFacade;

    @Test
    public void testSearchByAnyWord() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyFacade.saveToDb(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyFacade.saveToDb(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyFacade.saveToDb(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Employee> employeesByAnyWord = employeeFacade.searchEmployeeByWord("o");
        List<Company> companiesByAnyWord = companyFacade.searchCompaniesByWord("er");

        //Then
        Assert.assertEquals(2, employeesByAnyWord.size());
        Assert.assertEquals(2, companiesByAnyWord.size());

        //CleanUp
        try {
            companyFacade.deleteFromDb(softwareMachineId);
            companyFacade.deleteFromDb(dataMaestersId);
            companyFacade.deleteFromDb(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
