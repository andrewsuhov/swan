/*
 *    BSUIR Bachelor's Diploma 2016
 */
package andrew.suhov.swan.rest;

import andrew.suhov.swan.domain.Department;
import andrew.suhov.swan.service.DepartmentService;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author asuhov
 */
@Path("departments")
public class DepartmentResource extends AbstractResource
{
    @EJB
    private DepartmentService departmentService;
    
    
    @GET
    public List<Department> findAll()
    {
        return departmentService.findAll();
    }
    
    @GET
    @Path("{id}")
    public Department getDepartmentById(@PathParam("id") Long id)
    {
        return departmentService.find(id);
    }
}
