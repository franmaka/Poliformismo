 public abstract class Empleado {

    String nombre;
    String rut;
    int horasContratadas;

    public Empleado(String newnombre, String newrut, int newHorasContratadas) {
        this.nombre = newnombre;
        this.rut = newrut;
        this.horasContratadas = newHorasContratadas;
    }

    // Metodo concreto para calcular el sueldo base
    @Override
    public String toString() {
        return "Empleado [Nombre=" + nombre + ", RUT=" + rut + ", Horas Contratadas=" + horasContratadas + "]";
    }

    // Metodo abstracto para calcular el sueldo
    public abstract double calcularSueldo();








 }

