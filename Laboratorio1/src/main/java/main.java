
import Clases.Docente;
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
        Map<String,Docente> c1;
        c1 = new HashMap();
        Docente d1 = new Docente("jorge123","Jorge","Hernandez","jorge.hernandez@lol.com.es",new Date());
        Docente d4 = new Docente("juan223","Juan","Perez","juan.perz@robert.com",new Date());
        Docente d5 = new Docente("nicoManya","Nicolas","Bataglino","nico.bata@lol.com.es",new Date());
        c1.put("jorge",d1);
        c1.put("juan",d4);
        c1.put("nico",d5);
        List cur = new LinkedList();
        for(Map.Entry<String,Docente> entry: c1.entrySet()){
           Docente d2 = (Docente)entry.getValue();
           DTUsuario d3 = d2.getDatos();
           System.out.print("El profesor es: " + d3.getNombre()+ " " + d3.getApellido());
        }
    }
    
}
