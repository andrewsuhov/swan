/*
 *    BSUIR Bachelor's Diploma 2016
 */
package andrew.suhov.swan.rest.dto;

import andrew.suhov.swan.domain.Club;
import andrew.suhov.swan.domain.Department;
import andrew.suhov.swan.domain.Employee;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author asuhov
 */
public class EmployeeDTO implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Club> clubs;
    private Department department;
    
    
    public EmployeeDTO()
    {
        
    }
    
    public EmployeeDTO(Employee employee)
    {
        this.id = employee.getId();
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.email = employee.getEmail();
        this.clubs = employee.getClubs();
        this.department = employee.getDepartment();
    }
    

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public List<Club> getClubs()
    {
        return clubs;
    }

    public void setClubs(List<Club> clubs)
    {
        this.clubs = clubs;
    }

    public Department getDepartment()
    {
        return department;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }
    
    
    
}
