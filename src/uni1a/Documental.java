/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList;

public class Documental extends ContenidoAudiovisual {

    private String tema;
    private ArrayList<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos,
                      String genero, String tema) {

        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    //Agregar un investigador existente
    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
    }

    //Consultar investigadores
    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }

    //Mostrar detalles
    public void mostrarDetalles() {

        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Tema: " + tema);

        System.out.println("Investigadores:");

        for (Investigador investigador : investigadores) {
            System.out.println("- " + investigador);
        }

        System.out.println();
    }
}
