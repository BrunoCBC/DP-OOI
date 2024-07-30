import java.util.Scanner;

import ifpr.pgua.eic.gerenciadorMusica.controllers.CadastrarMusica;
import ifpr.pgua.eic.gerenciadorMusica.model.repositories.RepositorioMusica;;

public class App {

    private static RepositorioMusica musica = new RepositorioMusica();

    private static CadastrarMusica cadastrarMusica = new CadastrarMusica(musica);

    public static void main(String[] args) {
        boolean c = true;
        Scanner teclado = new Scanner(System.in);
        int escolha;

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.println("Bem vindo a agenda de musical!\n");
        do{
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Editar");
            System.out.println("3 - Listar");
            System.out.println("4 - Excluir");

            escolha = teclado.nextInt();
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
            if(escolha == 0){
                c = false;
            }else if(escolha == 1){
                menuCadastrar();
            }
        }while(c == true);
        teclado.close();
    }

    public static void menuCadastrar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 

        Scanner teclado = new Scanner(System.in);
        int escolha;
        
        do{
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar Música");
            System.out.println("2 - Cadastrar Músico");
            System.out.println("3 - Cadastrar CD");
            System.out.println("4 - Cadastrar Banda");

            escolha = teclado.nextInt();
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
            if(escolha == 1){
                cadastrarMusica.cadastrar();;
            }else if(escolha == 2){
                //cadastrarMusico(musico); 
            }else if(escolha == 3){
                //cadastrarCd(cd);
            }else if(escolha == 4){
                //cadastrarBanda(banda);
            }
        }while(escolha < 0 && escolha > 4);
        teclado.close();
    }
}
