
package problema6;

public class Problema6 {

    public static void main(String[] args) {
        
        CuentaCheques cuenta1 = new CuentaCheques("20994827622", "Pepa Alvarado");
        CuentaAhorros cuenta2 = new CuentaAhorros("29983473601", "Juanana Castro");
        CuentaPlatino cuenta3 = new CuentaPlatino("20878462744", "Berta Ludeña");

        cuenta1.depositar(1000);
        cuenta1.retirar(500);

        cuenta2.depositar(2000);
        cuenta2.calcularInteres(); 

        cuenta3.depositar(3000);
        cuenta3.calcularInteres(); 

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        
    }
    
}

class CuentaPlatino extends CuentaBancaria {
    private static double tasaInteres = 0.10;

    public CuentaPlatino(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    public void calcularInteres() {
        double interes = balance * tasaInteres;
        depositar(interes);
    }
}

class CuentaCheques extends CuentaBancaria {
    public CuentaCheques(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }
}
class CuentaBancaria {
    protected String numeroCuenta;
    protected String nombreCliente;
    protected double balance;

    public CuentaBancaria(String numeroCuenta, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.balance = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            balance -= cantidad;
        } else {
            System.out.println("La cantidad a retirar debe ser mayor a cero.");
        }
    }

    public double getBalance() {
        return balance;
    }
    
    @Override
    public String toString() {
        return "-Cliente: " + nombreCliente + "\nCuenta: " + numeroCuenta + "\nBalance: " + balance;
    }
}
class CuentaAhorros extends CuentaBancaria {
    private static final double tasaInteres = 0.05;

    public CuentaAhorros(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    public void calcularInteres() {
        double interes = balance * tasaInteres;
        depositar(interes);
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (balance >= cantidad) {
                balance -= cantidad;
            } else {
                System.out.println("Fondos insuficientes en la cuenta de ahorros.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor a cero.");
        }
    }
}