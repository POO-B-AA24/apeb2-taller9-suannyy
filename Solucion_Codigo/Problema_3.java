
package problema_3;

public class Problema_3 {
    public static void main(String[] args) {
        SMS sms1 = new SMS("0963521021", "0915487525", "Juana", "Martin", "Holi...");
        MMS mms1 = new MMS("0963524185", "0987456321", "Cubana", "Pepe", "imagen.jpg");

        sms1.enviarMensaje();
        sms1.visualizarMensaje();

        mms1.enviarMensaje();
        mms1.visualizarMensaje();
    }

}
class MMS extends Mensaje {

    private String nombreFicheroImagen;

    public MMS(String remitente, String destinatario, String nombreRemitente, String nombreDestinatario, String nombreFicheroImagen) {
        super(remitente, destinatario, nombreRemitente, nombreDestinatario);
        this.nombreFicheroImagen = nombreFicheroImagen;
    }

    public String getNombreFicheroImagen() {
        return nombreFicheroImagen;
    }

    public void enviarMensaje() {
        System.out.println("Enviando MMS de " + getRemitente() + " a " + getDestinatario() + ": " + nombreFicheroImagen);
    }

    public void visualizarMensaje() {
        System.out.println("MMS de " + (getNombreRemitente() != null ? getNombreRemitente() : getRemitente()) + " a "
                + (getNombreDestinatario() != null ? getNombreDestinatario() : getDestinatario()) + ": " + nombreFicheroImagen);
    }

}

class Mensaje {

    private String remitente;
    private String destinatario;
    private String nombreRemitente;
    private String nombreDestinatario;

    public Mensaje(String remitente, String destinatario, String nombreRemitente, String nombreDestinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.nombreRemitente = nombreRemitente;
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void enviarMensaje() {
    }

    public void visualizarMensaje() {
    }
}

class SMS extends Mensaje {

    private String mensajeTexto;

    public SMS(String remitente, String destinatario, String nombreRemitente, String nombreDestinatario, String mensajeTexto) {
        super(remitente, destinatario, nombreRemitente, nombreDestinatario);
        this.mensajeTexto = mensajeTexto;
    }

    public String getMensajeTexto() {
        return mensajeTexto;
    }

    public void enviarMensaje() {
        System.out.println("Enviando SMS de " + getRemitente() + " a " + getDestinatario() + ": " + mensajeTexto);
    }

    public void visualizarMensaje() {
        System.out.println("SMS de " + (getNombreRemitente() != null ? getNombreRemitente() : getRemitente()) + " a "
                + (getNombreDestinatario() != null ? getNombreDestinatario() : getDestinatario()) + ": " + mensajeTexto);
    }
}