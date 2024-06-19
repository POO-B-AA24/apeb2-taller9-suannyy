
import java.util.ArrayList;
import java.util.Arrays;

public class EjecutorPelicula {

    public static void main(String[] args) {
        Dvd soporteDvd = new Dvd(4.5);
        Vhs soporteVhs = new Vhs("Cinta estandar");
        Soporte objSoporte = new Soporte();
        ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>(Arrays.asList(
                new Pelicula(objSoporte, "Intensamente", "Ricardo", "2024", "Espanol"),
                new Pelicula(objSoporte, "JuegoTronos", "Daniel", "2000", "Espanol"),
                new Pelicula(objSoporte, "Matriz", "Steven", "2024", "Espanol")));
        for (Pelicula peli : listaPeliculas) {
            System.out.println(peli);
        }
    }
}

class Pelicula {

    public Soporte soporte;
    public String titulo;
    public String autor;
    public String anioEdicion;
    public String idioma;
    public double costoAlquiler;

    public Pelicula(Soporte soporte, String titulo, String autor, String anioEdicion, String idioma) {
        this.soporte = soporte;
        this.titulo = titulo;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
        this.idioma = idioma;
    }

    public void calcularCostoAlquiler() {
    }

    @Override
    public String toString() {
        return "Pelicula{" + "soporte=" + soporte + ", titulo=" + titulo + ", autor=" + autor + ","
                + " anioEdicion=" + anioEdicion + ", idioma=" + idioma + ", costoAlquiler=" + costoAlquiler + '}';
    }
}

class Soporte {
}

class Dvd extends Soporte {

    public double capacidad;

    public Dvd(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Dvd{" + "capacidad=" + capacidad + '}';
    }
}

class Vhs extends Soporte {

    public String tipoCinta;

    public Vhs(String tipoCinta) {
        this.tipoCinta = tipoCinta;
    }

    @Override
    public String toString() {
        return "Vhs{" + "tipoCinta=" + tipoCinta + '}';
    }

}
