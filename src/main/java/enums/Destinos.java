package enums;

public enum Destinos {
    FORTALEZA("Fortaleza"),
    RECIFE("Recife"),
    MANAUS("Manaus"),
    CAUCAIA("Caucaia"),
    MARINGA("Maringá"),
    MIAMI("Miami");

    private String cidade;

    Destinos(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
