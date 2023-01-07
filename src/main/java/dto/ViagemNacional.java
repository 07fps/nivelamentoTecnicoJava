package dto;

import enums.Destinos;

import java.util.List;

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
        if (acompanhantes.size() <= 1){
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens Internacionais não podem ter mais que 1 acompanhante");
        }

    }
}
