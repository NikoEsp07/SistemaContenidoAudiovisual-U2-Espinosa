package uni1a;

public class Temporada {

    private int numero;
    private int anioEstreno;
    private int episodios;

    public Temporada(int numero, int anioEstreno, int episodios) {
        this.numero = numero;
        this.anioEstreno = anioEstreno;
        this.episodios = episodios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }


    public String toString() {
        return "Temporada " + numero
                + " | Año: " + anioEstreno
                + " | Episodios: " + episodios;
    }
}