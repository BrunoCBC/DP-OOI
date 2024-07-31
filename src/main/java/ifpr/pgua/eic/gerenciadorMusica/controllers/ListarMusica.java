package ifpr.pgua.eic.gerenciadorMusica.controllers;

import java.util.ArrayList;
import java.util.Scanner;

import ifpr.pgua.eic.gerenciadorMusica.model.entities.Musica;
import ifpr.pgua.eic.gerenciadorMusica.model.repositories.RepositorioMusica;

public class ListarMusica {
    private RepositorioMusica repositorio;

    public ListarMusica(RepositorioMusica repositorio){
        this.repositorio = repositorio;
    }

    public void listar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        Scanner scanner = new Scanner(System.in);

        ArrayList<Musica> musicas = (ArrayList<Musica>) repositorio.read().comoSucesso().getObj();
        System.out.println(musicas.size()+"\n");
        for (Musica musica: musicas) {
            System.out.println(musica.toString());
        }

        System.out.println("Digite qualquer coisa para continuar: ");
        String a = scanner.nextLine();
    }
}
