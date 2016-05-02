/*
 *    BSUIR Bachelor's Diploma 2016
 */
package andrew.suhov.swan.repository;

import andrew.suhov.swan.domain.Department;
import javax.ejb.Stateless;

/**
 *
 * @author asuhov
 */
@Stateless
public class DepartmentRepository extends AbstractRepository<Department>
{
    
    public DepartmentRepository()
    {
        super(Department.class);
    }
    
}
