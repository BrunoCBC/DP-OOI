public class Cd {

    private String titulo;
    private int ano;
    private boolean ehDuplo;

    public Cd() {

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

    @Override
    public String toString() {
        return "Cd [titulo=" + titulo + ", ano=" + ano + ", ehDuplo=" + ehDuplo + "]";
    }

    
}