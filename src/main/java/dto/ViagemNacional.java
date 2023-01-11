package dto;

import enums.Destinos;
import utils.ArquivosUtils;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class ViagemNacional extends Viagem{

    private String cpf;

    public ViagemNacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception{

        int limitedeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limitedeAcompanhantes){
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens Internacionais não podem ter mais que "+ limitedeAcompanhantes + " acompanhante");
        }
    }
}
