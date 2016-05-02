/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.swan.service.impl;

import andrew.suhov.swan.domain.Employee;
import andrew.suhov.swan.repository.EmployeeRepository;
import andrew.suhov.swan.service.EmployeeService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author asuhov
 */
@Stateless
public class EmployeeServiceImpl implements EmployeeService
{
    @EJB
    private EmployeeRepository employeeRepository;
    

    @Override
    public void create(Employee employee)
    {
        employeeRepository.create(employee);
    }

    @Override
    public Employee update(Employee employee)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Employee employee)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }
    
}
