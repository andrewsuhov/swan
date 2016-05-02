/*
 *    BSUIR Bachelor's Diploma 2016
 */
package andrew.suhov.swan.service.impl;

import andrew.suhov.swan.domain.Department;
import andrew.suhov.swan.repository.DepartmentRepository;
import andrew.suhov.swan.service.DepartmentService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author asuhov
 */
@Stateless
public class DepartmentServiceImpl implements DepartmentService
{
    @EJB
    private DepartmentRepository departmentRepository;
    
    
    @Override
    public void create(Department department)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Department update(Department department)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Department department)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> findAll()
    {
        return departmentRepository.findAll();
    }

    @Override
    public Department find(Long id)
    {
        return departmentRepository.find(id);
    }
    
}
