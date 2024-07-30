package ifpr.pgua.eic.gerenciadorMusica.model.entities;

import java.util.ArrayList;

public class Banda {
    
    private String nome;
    private EnumEstilo enumEstilo;
    private ArrayList<Cd> cds;
    private ArrayList<Musico> musicos;

    public Banda(String nome, EnumEstilo enumEstilo, ArrayList<Musico> musicos) {
        this.nome = nome;
        this.enumEstilo = enumEstilo;
        this.musicos = musicos;
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

    public ArrayList<Cd> getCds() {
        return cds;
    }

    public void setCds(ArrayList<Cd> cds) {
        this.cds = cds;
    }

    public ArrayList<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(ArrayList<Musico> musicos) {
        this.musicos = musicos;
    }

    @Override
    public String toString() {
        return "Banda [nome=" + nome + ", enumEstilo=" + enumEstilo + ", cds=" + cds + ", musicos=" + musicos + "]";
    }
    
}
