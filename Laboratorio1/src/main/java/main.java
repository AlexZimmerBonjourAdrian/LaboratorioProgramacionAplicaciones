
import Clases.*;
import Datatypes.DTUsuario;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public class main {
    public static void main(String args[]){
        Map<String,Usuario> c1;
        c1 = new HashMap();
        Usuario d1 = new Docente("jorge123","Jorge","Hernandez","jorge.hernandez@lol.com.es",new Date());
        Usuario d4 = new Docente("juan223","Juan","Perez","juan.perz@robert.com",new Date());
        Usuario d5 = new Docente("nicoManya","Nicolas","Bataglino","nico.bata@lol.com.es",new Date());
        Usuario e6 = new Estudiante("Pablogb83", "pablo", "gaione", "pablo@gaione", new Date());
        c1.put("jorge",d1);
        c1.put("juan",d4);
        c1.put("nico",d5);
        c1.put("pablo", e6);
        List cur = new LinkedList();
        for(Map.Entry<String,Usuario> entry: c1.entrySet()){
           Usuario d2 = entry.getValue();
           if(d2 instanceof Estudiante){
              System.out.println("El alumno es: " + d2.getNombre()+ " " + d2.getApellido()); 
           }else{
               System.out.println("El profesor es: " + d2.getNombre()+ " " + d2.getApellido());
           }
           //DTUsuario d3 = d2.getDatos();
           //System.out.println("El profesor es: " + d2.getNombre()+ " " + d2.getApellido());
        }
        
    }
    
}
