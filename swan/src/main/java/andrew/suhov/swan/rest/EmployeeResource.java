package andrew.suhov.swan.rest;

import andrew.suhov.swan.domain.Employee;
import andrew.suhov.swan.rest.dto.EmployeeDTO;
import andrew.suhov.swan.service.EmployeeService;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author asuhov
 */
@Path("employees")
public class EmployeeResource extends AbstractResource
{
    @EJB
    private EmployeeService employeeService;
    
    
    @GET
    public List<Employee> findAll()
    {
//        return employeeService.findAll().stream().map(employee -> new EmployeeDTO(employee)).collect(Collectors.toList());
        return employeeService.findAll();
    }
}
