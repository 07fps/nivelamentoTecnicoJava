package dto;

import enums.Destinos;
import interfaces.CalculadoradePrevisao;
import utils.ArquivosUtils;
import java.util.List;

public class ViagemNacional extends Viagem implements CalculadoradePrevisao {

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

    public int calcularPrevisaoDeDiasParaRetorno() {
        int quantidadeDeDias = 0;

        switch (this.getDestino()) {
            case MANAUS: quantidadeDeDias = 4; break;
            case RECIFE: quantidadeDeDias = 3; break;
            case CAUCAIA: quantidadeDeDias = 2; break;
            case MARINGA: quantidadeDeDias = 1; break;
            case FORTALEZA: quantidadeDeDias = 0; break;
        }

        return quantidadeDeDias;
    }
}
