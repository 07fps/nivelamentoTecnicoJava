package dto;

public class Viagem {
    private String destino;

    public Viagem(String lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String lugarDeDestino) {
        this.destino = lugarDeDestino;
    }
}
