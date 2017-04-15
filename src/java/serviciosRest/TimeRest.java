/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosRest;

import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import utilitarios.convierteUTCISO;

@Stateless
@Path("/time/{hora}")
public class TimeRest {

    @Context
    private UriInfo context;

    @GET
    @Produces("text/html")
    public String convertir(@PathParam("hora") long hora) {
        convierteUTCISO c = new convierteUTCISO();
        String horaUTCISO = c.convierteHoraMilisegundosAUTCISO(hora);
        return "{'code':'200','description':'OK','data':'" + horaUTCISO + "'}";
    }

}
