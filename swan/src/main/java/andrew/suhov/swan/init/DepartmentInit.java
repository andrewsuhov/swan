package andrew.suhov.swan.init;

import andrew.suhov.swan.domain.Department;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
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
public class DepartmentInit
{
    @PersistenceContext
    private EntityManager entityManager;
    private static final Logger LOG = Logger.getLogger(DepartmentInit.class.getName());
    
    
    @PostConstruct
    private void initDepartments()
    {
        LOG.info("Creating Departments...");
        
        String[] departments = {"Web", "Mobile", "Embedded", "Desktop", "Sales", "Administrative"};
        for (String department : departments)
        {
            Department d = new Department();
            d.setName(department);
            entityManager.persist(d);
        }
    }
}
