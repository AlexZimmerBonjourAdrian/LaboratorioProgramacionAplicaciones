/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author arena
 */
public class Persistencia {
    
    private static Persistencia instancia = null;
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Laboratorio");
    
    private EntityManager em = emf.createEntityManager();
    
    private void inicializarBaseDeDatos(EntityManager em){
    
        
        
    }
   
    private Persistencia(){
 
    }
    
    public static Persistencia getInstance(){
    
        if (instancia == null){
            
            instancia = new Persistencia();
        }
        
        return instancia;
    }
    
    public EntityManager obtenerEntityManager(){
        return em;
    }     
}
