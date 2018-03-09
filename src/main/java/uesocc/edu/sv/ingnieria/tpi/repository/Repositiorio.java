/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingnieria.tpi.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import uesocc.edu.sv.ingnieria.tpi.Modelos.Mantenimiento;
import uesocc.edu.sv.ingnieria.tpi.fileprocessormaven.ProcesadorArchivo;

/**
 *
 * @author zaldivar
 */
public class Repositiorio {
    
public static ProcesadorArchivo util= new ProcesadorArchivo();

public static List<Mantenimiento> getAll(String pathCarpeta,String nombreArchivo,boolean saltar,String separador){
    List<Mantenimiento> lista=new ArrayList<>();
    try {
        if(util.hasRequiredExtensions(pathCarpeta)){
            for(List objeto:util.parser(nombreArchivo, saltar, separador)){
                lista.add(new Mantenimiento((String)objeto.get(0),(String)objeto.get(1),Integer.parseInt((String)objeto.get(2))));
            }
        }
    } catch (IOException ex) {
        Logger.getLogger(Repositiorio.class.getName()).log(Level.SEVERE, null, ex);
    }
    return lista;
}

    
}
