/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ApporteurVehicule;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ApporteurVehiculeFacadeLocal {

    void create(ApporteurVehicule apporteurVehicule);

    void edit(ApporteurVehicule apporteurVehicule);

    void remove(ApporteurVehicule apporteurVehicule);

    ApporteurVehicule find(Object id);

    List<ApporteurVehicule> findAll();

    List<ApporteurVehicule> findRange(int[] range);

    int count();
    
}
