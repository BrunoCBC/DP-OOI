package ifpr.pgua.eic.gerenciadorMusica.controllers;

import java.util.ArrayList;

import ifpr.pgua.eic.gerenciadorMusica.model.entities.Musica;
import ifpr.pgua.eic.gerenciadorMusica.model.repositories.RepositorioMusica;

public class ListarMusica {
    private RepositorioMusica repositorio;

    public void listar(){
        ArrayList<Musica> musicas = (ArrayList<Musica>) repositorio.read().comoSucesso().getObj();
        for (Musica musica: musicas) {
            System.out.println(musica.toString());
        }
    }
}
