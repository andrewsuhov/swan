/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.swan.repository;

import andrew.suhov.swan.domain.Employee;
import javax.ejb.Stateless;

/**
 *
 * @author asuhov
 */
@Stateless
public class EmployeeRepository extends AbstractRepository<Employee>
{
    
    public EmployeeRepository()
    {
        super(Employee.class);
    }
}
