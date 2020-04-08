package br.com.alecsandro.carros.resource;

import br.com.alecsandro.carros.repository.CarroRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("carros")
public class CarroResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        return new CarroRepository().toText();
    }

    @GET()
    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return new CarroRepository().toJson();
    }

    @GET
    @Path("xml")
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        return new CarroRepository().toXml();
    }


}
