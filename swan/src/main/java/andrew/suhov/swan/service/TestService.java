/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.swan.service;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

/**
 *
 * @author asuhov
 */
@Stateless
public class TestService
{
    @RolesAllowed("Basic")
//    @PermitAll
    public void test()
    {
        System.out.println("andrew.suhov.swan.service.TestService.test()");
    }
}
