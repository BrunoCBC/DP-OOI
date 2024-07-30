package ifpr.pgua.eic.gerenciadorMusica.model.entities;

import java.util.ArrayList;

public class Cd {

    private String titulo;
    private int ano;
    private boolean ehDuplo;
    private Banda banda;
    private ArrayList<Musica> musicas;

    public Cd(String titulo, int ano, boolean ehDuplo, Banda banda, ArrayList<Musica> musicas) {
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;
        this.banda = banda;
        this.musicas = musicas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEhDuplo() {
        return ehDuplo;
    }

    public void setEhDuplo(boolean ehDuplo) {
        this.ehDuplo = ehDuplo;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Cd [titulo=" + titulo + ", ano=" + ano + ", ehDuplo=" + ehDuplo + ", banda=" + banda + ", musicas="
                + musicas + "]";
    }

}