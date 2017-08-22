package com.mjcr023c.webservice.serviciosRest;

import javax.ejb.Stateless;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import com.mjcr023c.webservice.utilitarios.convierteMinAMay;

@Stateless
@Path("/word/{palabra}")
public class WordRestResource {

    @GET
    public String convertir(@PathParam("palabra") String palabra) {
        convierteMinAMay p = new convierteMinAMay();
        String palabraMayuscula = p.convierteaMayuscula(palabra);
        if (palabraMayuscula.length() <= 4 && palabraMayuscula.length() > 0) {
            return "{'code':'200','description':'OK','data':'" + palabraMayuscula + "'}";
        } else {
            return "{'code':'400','description':'bad-request','data':''}";
        }
    }
}
