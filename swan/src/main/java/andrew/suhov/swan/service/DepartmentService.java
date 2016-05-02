/*
 *    BSUIR Bachelor's Diploma 2016
 */
package andrew.suhov.swan.service;

import andrew.suhov.swan.domain.Department;
import java.util.List;

/**
 *
 * @author asuhov
 */
public interface DepartmentService
{
    void create(Department department);
    
    Department update(Department department);
    
    void delete(Department department);
    
    List<Department> findAll();
    
    Department find(Long id);
}
