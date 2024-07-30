package ifpr.pgua.eic.gerenciadorMusica.model.entities;

import java.util.ArrayList;

public class Musico {
    
    private String nome;
    private String email;
    private ArrayList<Musica> musicas;
    private ArrayList<Banda> bandas;

    public Musico(String nome, String email, ArrayList<Musica> musicas, ArrayList<Banda> bandas) {
        this.nome = nome;
        this.email = email;
        this.musicas = musicas;
        this.bandas = bandas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public ArrayList<Banda> getBandas() {
        return bandas;
    }

    public void setBandas(ArrayList<Banda> bandas) {
        this.bandas = bandas;
    }

    @Override
    public String toString() {
        return "Musico [nome=" + nome + ", email=" + email + ", musicas=" + musicas + ", bandas=" + bandas + "]";
    }
}
