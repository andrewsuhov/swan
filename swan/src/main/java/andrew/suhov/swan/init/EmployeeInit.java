package andrew.suhov.swan.init;

import andrew.suhov.swan.domain.Department;
import andrew.suhov.swan.domain.Employee;
import andrew.suhov.swan.repository.DepartmentRepository;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author asuhov
 */
@Singleton
@Startup
@DependsOn("DepartmentInit")
public class EmployeeInit
{
    @PersistenceContext
    private EntityManager entityManager;
    
    @EJB
    private DepartmentRepository departmentRepository;
    
    private static final Logger LOG = Logger.getLogger(EmployeeInit.class.getName());
    
    
    @PostConstruct
    private void initEmployees()
    {
        LOG.info("Creating Employees...");
        if ((Long) entityManager.createQuery("select count(e) from Employee e").getSingleResult() > 0)
        {
            LOG.info("Employees are already created!");
            return;
        }
        
        List<Department> departments = departmentRepository.findAll();
        Random random = new Random();
        
        int count = 10;
        LOG.log(Level.INFO, "Creating {0} employees...", count);
        for (int i = 1; i <= count; i++)
        {
            Employee employee = new Employee();
            employee.setEmail("employee" + i + "@softeq.com");
            employee.setFirstName("FirstName" + i);
            employee.setLastName("LastName" + i);
            employee.setDepartment(departments.get(random.nextInt(departments.size())));
            
            entityManager.persist(employee);
            
        }
        LOG.info("Employees created!");
    }
}
