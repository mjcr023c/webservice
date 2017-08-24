package com.mjcr023c.webservice.serviciosRest;

import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import com.mjcr023c.webservice.utilitarios.convierteUTCISO;
import javax.ws.rs.Produces;

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
