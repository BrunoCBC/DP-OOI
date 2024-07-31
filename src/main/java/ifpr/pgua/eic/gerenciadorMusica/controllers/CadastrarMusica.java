package ifpr.pgua.eic.gerenciadorMusica.controllers;

import java.util.Scanner;

import com.github.hugoperlin.results.Resultado;

//import ifpr.pgua.eic.gerenciadorMusica.model.entities.Musica;
import ifpr.pgua.eic.gerenciadorMusica.model.repositories.RepositorioMusica;

public class CadastrarMusica {

    private RepositorioMusica repositorio;
    //private Musica musica;

    public CadastrarMusica(RepositorioMusica repositorio) {
        this.repositorio = repositorio;
    }

    public void cadastrar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        Scanner teclado = new Scanner(System.in);
        String titulo;
        int duracao;
        Resultado res;
        System.out.println("Titulo da música:");
        titulo = teclado.nextLine();
        System.out.println("\nDuração da música:(minutos)");
        duracao = teclado.nextInt();
        res = repositorio.create(titulo, duracao);
        System.out.println("\n\n"+res.getMsg()+"\n\n");
    }
}
