
package problema_4;
public class Problema_4 {

    public static void main(String[] args) {

        Jefe jefe = new Jefe("Carlita", "Lopez", "Calle Principal", "1203948576", 3200.0);
        TrabajadorFijoMensual trabajador1 = new TrabajadorFijoMensual("Pepe", "Perez", "Av Central", "1983746512", jefe, 1100.0);
        TrabajadorComisionista trabajador2 = new TrabajadorComisionista("Suanany", "Loak", "Calle Secundaria", "128374956", jefe, 18.0, 5200);
        TrabajadorPorHoras trabajador3 = new TrabajadorPorHoras("Juana", "Castro", "Boulevard y Primera", "1174836524", jefe, 18.0, 25.0, 38);

        System.out.println("Jefe: " + jefe.getNombreCompleto() + ", Sueldo: " + jefe.calcularSueldo());
        System.out.println("Trabajador Fijo Mensual: " + trabajador1.getNombreCompleto() + ", Sueldo: " + trabajador1.calcularSueldo());
        System.out.println("Trabajador Comisionista: " + trabajador2.getNombreCompleto() + ", Sueldo: " + trabajador2.calcularSueldo());
        System.out.println("Trabajador por Horas: " + trabajador3.getNombreCompleto() + ", Sueldo: " + trabajador3.calcularSueldo());
    }
}
class Jefe extends Trabajador {

    private double salarioBase;

    public Jefe(String nombre, String apellidos, String direccion, String dni, double salarioBase) {
        super(nombre, apellidos, direccion, dni, null);
        this.salarioBase = salarioBase;
    }

    public double calcularSueldo() {
        return salarioBase;
    }
}
class Trabajador {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private Trabajador jefe;

    public Trabajador(String nombre, String apellidos, String direccion, String dni, Trabajador jefe) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.jefe = jefe;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }
}
class TrabajadorComisionista extends Trabajador {
    private double comision;
    private double ventasTotales;

    public TrabajadorComisionista(String nombre, String apellidos, String direccion, String dni, Trabajador jefe, double comision, double ventasTotales) {
        super(nombre, apellidos, direccion, dni, jefe);
        this.comision = comision;
        this.ventasTotales = ventasTotales;
    }

    public double calcularSueldo() {
        return (comision / 100) * ventasTotales;
    }
}
class TrabajadorFijoMensual extends Trabajador {
    private double salarioMensual;

    public TrabajadorFijoMensual(String nombre, String apellidos, String direccion, String dni, Trabajador jefe, double salarioMensual) {
        super(nombre, apellidos, direccion, dni, jefe);
        this.salarioMensual = salarioMensual;
    }

    public double calcularSueldo() {
        return salarioMensual;
    }
}
class TrabajadorPorHoras extends Trabajador {

    private double tarifaHora;
    private double tarifaHoraExtra;
    private int horasTotales;

    public TrabajadorPorHoras(String nombre, String apellidos, String direccion, String dni, Trabajador jefe, double tarifaHora, double tarifaHoraExtra, int horasTotales) {
        super(nombre, apellidos, direccion, dni, jefe);
        this.tarifaHora = tarifaHora;
        this.tarifaHoraExtra = tarifaHoraExtra;
        this.horasTotales = horasTotales;
    }

    public double calcularSueldo() {
        if (horasTotales <= 40) {
            return horasTotales * tarifaHora;
        } else {
            return (40 * tarifaHora) + ((horasTotales - 40) * tarifaHoraExtra);
        }
    }
}