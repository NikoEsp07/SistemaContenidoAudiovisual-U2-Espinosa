/**
 * Class Pelicula
 */

package uni1a;

import java.util.ArrayList;

public class Pelicula extends ContenidoAudiovisual {

    private String estudio;
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos,
                    String genero, String estudio) {

        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    //Agregar un actor
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    //Consultar los actores
    public ArrayList<Actor> getActores() {
        return actores;
    }

    //Mostrar detalles
    public void mostrarDetalles() {

        System.out.println("Detalles de la pelicula:");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Estudio: " + estudio);

        System.out.println("Actores:");

        for (Actor actor : actores) {
            System.out.println("- " + actor);
        }

        System.out.println();
    }
}
