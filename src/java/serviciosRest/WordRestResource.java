package serviciosRest;

import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import utilitarios.convierteMinAMay;


@Stateless
@Path("/word/{palabra}")
public class WordRestResource {

    @GET
    @Produces("text/html")
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
