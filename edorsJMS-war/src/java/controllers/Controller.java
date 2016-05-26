/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import JMSproducers.producerClassLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author AcerPC
 */
@Named(value = "controller")
@Dependent
public class Controller {

//    @EJB
//    private producerClassLocal producerClass;

    
    
    /**
     * Creates a new instance of Controller
     */
    public Controller() {
    }
    
    public void aSync(){
        
        
    }
    
    public void syncronous(){
        System.out.println("whatever");
    }
    
}
