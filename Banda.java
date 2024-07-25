public class Banda {
    
    private String nome;
    private EnumEstilo enumEstilo;
    
    public Banda(String nome, EnumEstilo enumEstilo) {
        this.nome = nome;
        this.enumEstilo = enumEstilo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumEstilo getEnumEstilo() {
        return enumEstilo;
    }

    public void setEnumEstilo(EnumEstilo enumEstilo) {
        this.enumEstilo = enumEstilo;
    }

    @Override
    public String toString() {
        return "Banda [nome=" + nome + ", enumEstilo=" + enumEstilo + "]";
    }
    
}
