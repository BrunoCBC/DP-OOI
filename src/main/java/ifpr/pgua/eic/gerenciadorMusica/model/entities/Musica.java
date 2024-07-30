package ifpr.pgua.eic.gerenciadorMusica.model.entities;

import java.util.ArrayList;

public class Musica {
    
    private String titulo;
    private int duracao;
    private ArrayList<Musico> musicos;

    public Musica(String titulo, int duracao, ArrayList<Musico> musicos) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.musicos = musicos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(ArrayList<Musico> musicos) {
        this.musicos = musicos;
    }

    @Override
    public String toString() {
        return "Musica [titulo=" + titulo + ", duracao=" + duracao + ", musicos=" + musicos + "]";
    }

}
