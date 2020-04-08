package br.com.alecsandro.carros.repository;

import br.com.alecsandro.carros.modelo.Carro;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import java.util.List;

import static java.util.Arrays.asList;

public class CarroRepository {

    public static List<Carro> carros;

    static {
        getCarros();
    }

    private static void getCarros() {
        carros = asList(new Carro("GM - Chevrolet", "Onix", 2013),
                new Carro("Fiat", "Strada", 2016),
                new Carro("Volkswagen", "Gol", 2011),
                new Carro("GM - Chevrolet", "Montana", 2006),
                new Carro("Volkswagen", "Gol", 1994));
    }

    public String toJson() {
        return new Gson().toJson(carros);
    }

    public String toXml() {
        return new XStream().toXML(carros);
    }

    public String toText() {
        String texto = "=======\n";
        for (Carro carro : carros) {
            texto += String.format("%s %s, ano %d\n", carro.getMarca(), carro.getModelo(), carro.getAno());
        }
        texto = texto + "=======";
        return texto;
    }
}
