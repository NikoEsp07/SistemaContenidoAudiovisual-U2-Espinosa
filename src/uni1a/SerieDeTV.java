/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {

    private ArrayList<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos,
                     String genero) {

        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    //Crear una temporada
    public void agregarTemporada(int numero,
                                 int anioEstreno,
                                 int episodios) {

        Temporada temporada = new Temporada(
            numero, anioEstreno, episodios
        );

        temporadas.add(temporada);
    }

    //Consultar temporadas
    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    //Mostrar detalles
    public void mostrarDetalles() {

        System.out.println("Detalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());

        System.out.println("Temporadas:");

        for (Temporada temporada : temporadas) {
            System.out.println("- " + temporada);
        }

        System.out.println();
    }
}
