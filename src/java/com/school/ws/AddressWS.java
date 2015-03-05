/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.ws;

//import com.school.application.EMF;
import com.school.domain.Address;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Zeeshan
 */
@WebService(serviceName = "AddressWS")
public class AddressWS {
//    EntityManager em = EMF.createEntityManager();

    @PersistenceContext(unitName = "pu")
    private  EntityManager em;

    public AddressWS() {
    }

    @WebResult(name = "addressId")
    public Long createAddress(@WebParam(name = "address") Address address) {
        em.persist(address);

        return address.getId();
    }
}
