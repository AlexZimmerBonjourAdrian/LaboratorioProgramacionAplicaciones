/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import java.util.HashMap;
import java.util.Map;
import Clases.*;

/**
 *
 * @author arena
 */
public class Singleton {
    
    private Map<String,Usuario> usuarios;
    
    private Map institutos;
    
    private Map<String,Programa> programas;
    
    private static Sistema instancia = null;
    
    private Singleton(){ 
        
        usuarios = new HashMap();
        
        institutos = new HashMap();
        
        programas = new HashMap();
        
    }
    
    public static Sistema getInstance(){
    
        if (instancia == null){
            
            instancia = new Sistema();
        }
        
        return instancia;
    }
    
}
