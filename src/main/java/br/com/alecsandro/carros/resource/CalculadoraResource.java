package br.com.alecsandro.carros.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("calculadora")
public class CalculadoraResource {

    @GET
    @Path("somar/{n1}/{n2}")
    public String somar(@PathParam("n1") Double n1, @PathParam("n2") Double n2) {
        return String.format("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
    }

    @GET
    @Path("subtrair/{n1}/{n2}")
    public String subtrair(@PathParam("n1") Double n1, @PathParam("n2") Double n2) {
        return String.format("%.2f - %.2f = %.2f", n1, n2, n1 - n2);
    }

    @GET
    @Path("multiplicar/{n1}/{n2}")
    public String multiplicar(@PathParam("n1") Double n1, @PathParam("n2") Double n2) {
        return String.format("%.2f * %.2f = %.2f", n1, n2, n1 * n2);
    }

    @GET
    @Path("dividir/{n1}/{n2}")
    public String dividir(@PathParam("n1") Double n1, @PathParam("n2") Double n2) {
        String mensagem = null;
        if (n2 == 0) {
            return String.format("Impossível dividir por zero (%.2f / %.2f)", n1, n2);
        }
        return String.format("%.2f / %.2f = %.2f", n1, n2, n1 / n2);
    }
}
