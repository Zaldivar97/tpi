/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingnieria.tpi.restServices;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.ingnieria.tpi.Modelos.Mantenimiento;
import uesocc.edu.sv.ingnieria.tpi.repository.Repositiorio;

/**
 *
 * @author zaldivar
 */
@Path("csv")
public class CsvService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Mantenimiento> random() {

        return Repositiorio.getAll("src/main/", "test.cv", true, ",");
    }

}
