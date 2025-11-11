public class Persona {

    private String nombre;      // Solo accesible dentro de esta clase
    protected int edad;         // Accesible en subclases y mismo paquete
    String correo;              // Acceso por paquete (default)
    public String ocupacion;    // Accesible desde cualquier parte

    public Persona(String nombre, int edad, String correo, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.ocupacion = ocupacion;
    }

    private void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    protected void mostrarEdad() {
        System.out.println("Edad: " + edad);
    }

    void mostrarCorreo() {
        System.out.println("Correo: " + correo);
    }

    public void mostrarOcupacion() {
        System.out.println("Ocupación: " + ocupacion);
    }
}

