package problema_5_venta_entradas;
public class Problema_5_Venta_entradas {
    public static void main(String[] args) {
        System.out.println("Nueva Venta de Entrada:\nZona Principal");
        normal n=new normal("Pepa","Mayon","0001","Central",25,20,200);
        //proceso necesario para validar una entrada
        boolean validar,validar2;
        validar=n.Precio();
        validar2=n.Disponible();
        if(validar!=true){
            if(validar2!=true){
            System.out.println(n.toString());
            }
        }
        
        System.out.println("\nNueva Venta de Entrada:\nZona Lateral");
        abonado a=new abonado("Juana","Castrp","0002","Lateral",25,100,100);
        validar=a.Precio();
        validar2=a.Disponible();
        if(validar!=true){
            if(validar2!=true){
            System.out.println(a.toString());
            }
        }
        System.out.println("\nNueva Venta de Entrada:\nZona Lateral");
        reducido r=new reducido("higo","Lurdes","0003","Central",20,100,400);
        validar=r.Precio();
        validar2=r.Disponible();
        if(validar!=true){
            if(validar2!=true){
            System.out.println(r.toString());
            }
        }
        
    }

}

 class abonado extends entrada{
    private String zona;
    private double precio;
    private int disponible;
    private int localidades;

    public abonado(String nombre, String apellido, String identificador, String zona,double precio, int disponible,int localidades) {
        super(nombre, apellido, identificador);
        this.zona=zona;
        this.precio = precio;
        this.disponible = disponible;
        this.localidades=localidades;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean Precio(){
        if(zona.equals("Principal")){
            precio=17.5;
            return false;
        }else if(zona.equals("PalcoB")){
            precio=40;
            return false;
        }else if(zona.equals("Central")){
            precio=14;
            return false;
        }else if(zona.equals("Lateral")){
            precio=10;
            return false;
        }else{
            System.out.println("Nombre de zona INCORRECTO");
            return true;
        }
    }

    public int getDisponible() {
        return disponible;
    }

    public boolean Disponible() {
        if(disponible>=localidades){
            System.out.println("Esta zona está LLENA\n");
            return true;
        }else{
            return false;
        }
    }

    public int getLocalidades() {
        return localidades;
    }

    public void setLocalidades(int localidades) {
        this.localidades = localidades;
    }
    
    
    
    public String toString(){
        return "\nENTRADA\nNombre: "+nombre+"\nApellido: "+apellido+"\nTipos: Normal"+"\nIdentificador: "+identificador+"\nZona: "+zona+"\nPrecio: $"+precio+"\nDescuento: 15%";
    }
}

 class entrada {
    protected String nombre;
    protected String apellido;
    protected String identificador;

    public entrada(String nombre, String apellido, String identificador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    
}

 class normal extends entrada{
    private String zona;
    private double precio;
    private int disponible;
    private int localidades;

    public normal(String nombre, String apellido, String identificador, String zona,double precio, int disponible, int localidades) {
        super(nombre, apellido, identificador);
        this.zona=zona;
        this.precio = precio;
        this.disponible = disponible;
        this.localidades=localidades;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    public double getPrecio() {
        return precio;
    }

    public boolean Precio() {
        if(zona.equals("Principal")){
            precio=25;
            return false;
        }else if(zona.equals("PalcoB")){
            precio=70;
            return false;
        }else if(zona.equals("Central")){
            precio=20;
            return false;
        }else if(zona.equals("Lateral")){
            precio=15.5;
            return false;
        }else{
            System.out.println("\nNombre de zona INCORRECTO\n");
            return true;
        }
    }

    public int getDisponible() {
        return disponible;
    }

    public boolean Disponible() {
        if(disponible>=localidades){
            System.out.println("\nEsta zona está LLENA\n");
            return true;
        }else{
            return false;
        }
    }

    public int getLocalidades() {
        return localidades;
    }

    public void setLocalidades(int localidades) {
        this.localidades = localidades;
    }
    
    
    
    public String toString(){
        return "\nVENTA DE ENTRADA NORMAL\nNombre: "+nombre+"\nApellido: "+apellido+"\nTipos: Normal"+"\nIdentificador: "+identificador+"\nZona: "+zona+"\nPrecio: $"+precio+"\nDescuento: 0%";
    }
    
    
}


 class reducido extends entrada{
    private String zona;
    private double precio;
    private int disponible;
    private int localidades;

    public reducido(String nombre, String apellido, String identificador, String zona,double precio, int disponible,int localidades) {
        super(nombre, apellido, identificador);
        this.zona=zona;
        this.precio = precio;
        this.disponible = disponible;
        this.localidades=localidades;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean Precio() {
        if(zona.equals("Principal")){
            precio=25-(25*0.15);
            return false;
        }else if(zona.equals("PalcoB")){
            precio=70-(70*0.15);
            return false;
        }else if(zona.equals("Central")){
            precio=20-(20*0.15);
            return false;
        }else if(zona.equals("Lateral")){
            precio=15.5-(15.5*0.15);
            return false;
        }else{
            System.out.println("\nNombre de zona INCORRECTO\n");
            return true;
        }
    }

    public int getDisponible() {
        return disponible;
    }

    public boolean Disponible() {
        if(disponible>=localidades){
            System.out.println("\nEsta zona está LLENA\n");
            return true;
        }else{
            return false;
        }
    }

    public int getLocalidades() {
        return localidades;
    }

    public void setLocalidades(int localidades) {
        this.localidades = localidades;
    }
    
    
    
    public String toString(){
        return "\nENTRADA\nNombre: "+nombre+"\nApellido: "+apellido+"\nTipos: Normal"+"\nIdentificador: "+identificador+"\nZona: "+zona+"\nPrecio: $"+precio+"\nDescuento: 15%";
    }
}