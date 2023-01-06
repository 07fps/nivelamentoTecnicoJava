package app;

import dto.Viagem;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem("Fortaleza");

        viagem.setDestino("São Paulo");

        System.out.println(viagem.getDestino());

    }
}
