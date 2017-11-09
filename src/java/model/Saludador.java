package model;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("saludador")
@SessionScoped

public class Saludador implements Serializable {

    private String saludo;

    public Saludador() {
        saludo = "Hola caracola!";
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String saluda() {
        System.out.println(saludo);
        return "welcomePrimefraces";
    }

}
