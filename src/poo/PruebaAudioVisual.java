package poo;

import uni1a.*;

public class PruebaAudioVisual {

    public static void main(String[] args) {

        System.out.println(" SISTEMA DE CONTENIDO AUDIOVISUAL");


        // Crear una pelicula con sus actores

        Pelicula pelicula = new Pelicula(
            "Avatar", 125, "Ciencia Ficcion", "20th Century Studios"
        );

        Actor actor1 = new Actor(
            "Sam Worthington", 50, "Australiano"
        );

        Actor actor2 = new Actor(
            "Zoe Saldana", 48, "Estadounidense"
        );

        Actor actor3 = new Actor(
            "Sigourney Weaver", 77, "Estadounidense"
        );

        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        pelicula.agregarActor(actor3);


        // Crear una serie con sus temporadas

        SerieDeTV serie = new SerieDeTV(
            "Game of Thrones", 60, "Fantasia"
        );

        serie.agregarTemporada(1, 2011, 10);
        serie.agregarTemporada(2, 2012, 10);
        serie.agregarTemporada(3, 2013, 10);


        // Crear documental e investigadores

        Documental documental = new Documental(
            "Cosmos", 45, "Ciencia", "Astronomia"
        );

        Investigador investigador1 = new Investigador(
            "Carl Sagan", "Astronomia", "Universidad de Cornell"
        );

        Investigador investigador2 = new Investigador(
            "Neil deGrasse Tyson", "Astrofisica", "Museo de Historia Natural"
        );

        documental.agregarInvestigador(investigador1);
        documental.agregarInvestigador(investigador2);

        // Crear Video Musical

		VideoMusical video = new VideoMusical(
		    "Bohemian Rhapsody",
		    6,
		    "Rock",
		    "Queen",
		    "A Night at the Opera",
		    "Trident Studios"
		);
		
		// Crear Clase virtual
		
		ClaseVirtual clase = new ClaseVirtual(
		    "Introducción a Java",
		    90,
		    "Educativo",
		    "Carlos Pérez",
		    "Plataforma UPS",
		    "Principiante"
		);


        // Polimorfismo

		ContenidoAudiovisual[] contenidos = {
			    pelicula,
			    serie,
			    documental,
			    video,
			    clase
			};


        // Mostrar los contenidos

        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }

        System.out.println("--------------------------------");
        System.out.println(" FIN DE LA PRUEBA DEL SISTEMA");

    }
}
