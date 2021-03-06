/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.EtatC5;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface EtatC5FacadeLocal {

    void create(EtatC5 etatC5);

    void edit(EtatC5 etatC5);

    void remove(EtatC5 etatC5);

    EtatC5 find(Object id);

    List<EtatC5> findAll();

    List<EtatC5> findRange(int[] range);

    int count();
    
}
