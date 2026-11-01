package uni1a;

public class VideoMusical extends ContenidoAudiovisual {

    private String artista;
    private String album;
    private String productora;

    public VideoMusical(String titulo, int duracionEnMinutos, String genero,
                        String artista, String album, String productora) {

        super(titulo, duracionEnMinutos, genero);

        this.artista = artista;
        this.album = album;
        this.productora = productora;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(" VIDEO MUSICAL ");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Productora: " + productora);
        System.out.println();
    }
}
