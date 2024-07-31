package ifpr.pgua.eic.gerenciadorMusica.model.repositories;

import java.util.ArrayList;

import com.github.hugoperlin.results.Resultado;

import ifpr.pgua.eic.gerenciadorMusica.model.entities.Musica;

public class RepositorioMusica {

    private ArrayList<Musica> musicas;

    public RepositorioMusica(){
        musicas = new ArrayList<Musica>();
    };

    public Resultado create(String titulo, int duracao){
        if(titulo.isBlank() || titulo.isBlank()){
            return Resultado.erro("Titulo inválido!");
        }
        if(duracao < 0){
            return Resultado.erro("Duração inválido!");
        }

        Musica musica = new Musica(titulo, duracao, null);
        musicas.add(musica);

        return Resultado.sucesso("Música cadastrada com sucesso!", musicas);
    }

    public Resultado read(){
        return Resultado.sucesso("Músicas listadas!", musicas);
    }

    public Resultado update(String titulo, int duracao, Musica musica){
        if(titulo.isBlank() || titulo.isBlank()){
            return Resultado.erro("Titulo inválido!");
        }
        if(duracao < 0){
            return Resultado.erro("Duração inválido!");
        }

        return Resultado.sucesso("Música cadastrada com sucesso!", musicas);
    }

    public Resultado delete(Musica musica){
        if(musica == null){
            return Resultado.erro("Música não encontrada!");
        }

        return Resultado.sucesso("Música deletada com sucesso!", musicas);
    }
}
