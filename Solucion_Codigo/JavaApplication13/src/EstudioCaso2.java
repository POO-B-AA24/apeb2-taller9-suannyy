
public class EstudioCaso2 {

    public static void main(String[] args) {
        ReparacionMecanica trabMecanico = new ReparacionMecanica(0, 0, "Moto de Ricardo", 14);
        ReparacionChapasPintura trabChapas = new ReparacionChapasPintura(0, 1, "Auto de Suanny", 21);
        Revision trabRevision = new Revision(2, "Moto de Pedro", 7);
        trabMecanico.setEstado("Iniciado");
        trabChapas.setEstado("Iniciado");
        trabRevision.setEstado("Iniciado");
        trabMecanico.aumentarHoras(5.5);
        trabMecanico.aumentarPrecio(100);
        trabMecanico.calcularCostoTrabajo();
        System.out.println("trabMecanico");
        System.out.println("trabChapas");
        System.out.println("Revision");

    }
}

class Trabajo {

    public int id;
    public String descripcion;
    public double numeroHoras;
    public String estado;
    public double costoTrabajo;
    public int plazo;

    public Trabajo() {
    }

    public Trabajo(int id, String descripcion, int plazo) {
        this.id = id;
        this.descripcion = descripcion;
        this.plazo = plazo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void aumentarHoras(double numHoraIncr) {
        this.numeroHoras += numHoraIncr; // numeroHoras = numeroHoras + numHorasIncr;
    }

    public double calcularCostoTrabajo() {
        this.costoTrabajo = this.numeroHoras * 30;
        return this.costoTrabajo;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", descripcion=" + descripcion + ", numeroHoras=" + numeroHoras + ", estado=" + estado + ", costoTrabajo=" + costoTrabajo + ", plazo=" + plazo + '}';
    }
}
// Estas todos los atributos y metodos del padre cada cada una de las clases que hereda

class ReparacionMecanica extends Trabajo {

    public double precioMaterial;

    public ReparacionMecanica(double precioMaterial, int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
        this.precioMaterial = precioMaterial;
    }

    @Override
    public double calcularCostoTrabajo() {
        // en los hijos reutilizar los metodos reutilizados del padre
        this.costoTrabajo = super.calcularCostoTrabajo() + (this.precioMaterial * 1.1);
        return this.costoTrabajo;
    }

    public void aumentarPrecio(double precioMaterialExtra) {
        this.precioMaterial += precioMaterialExtra;
    }

    @Override
    public String toString() {
        return "ReparacionMecanica{" + super.toString() + "precioMaterial=" + precioMaterial + '}';
    }

}

class ReparacionChapasPintura extends Trabajo {

    public double precioMaterial;

    public ReparacionChapasPintura(double precioMaterial, int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
        this.precioMaterial = precioMaterial;
    }

    @Override
    public double calcularCostoTrabajo() {
        this.costoTrabajo = super.calcularCostoTrabajo() + (this.precioMaterial * 1.3);
        return this.costoTrabajo;
    }

    public void aumentarPrecio() {
    }

    ;

    @Override
    public String toString() {
        return "ReparacionChapasPintura{" + super.toString() + "precioMaterial=" + precioMaterial + '}';
    }
}

class Revision extends Trabajo {

    public Revision(int id, String descripcion, int plazo) {
        super(id, descripcion, plazo);
    }

    @Override
    public double calcularCostoTrabajo() {
        this.costoTrabajo = super.calcularCostoTrabajo() + 20;
        return this.costoTrabajo;
    }
}
