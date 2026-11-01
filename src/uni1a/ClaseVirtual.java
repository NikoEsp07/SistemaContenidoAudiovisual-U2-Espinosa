package uni1a;

public class ClaseVirtual extends ContenidoAudiovisual {

    private String instructor;
    private String plataforma;
    private String nivel;

    public ClaseVirtual(String titulo, int duracionEnMinutos, String genero,
                        String instructor, String plataforma, String nivel) {

        super(titulo, duracionEnMinutos, genero);

        this.instructor = instructor;
        this.plataforma = plataforma;
        this.nivel = nivel;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(" CLASE VIRTUAL ");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Instructor: " + instructor);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Nivel: " + nivel);
        System.out.println();
    }
}
