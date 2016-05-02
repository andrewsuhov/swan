/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.swan.service;

import andrew.suhov.swan.domain.Employee;
import java.util.List;

/**
 *
 * @author asuhov
 */
public interface EmployeeService
{
    void create(Employee employee);
    
    Employee update(Employee employee);
    
    void delete(Employee employee);
    
    List<Employee> findAll();
}
