public class EmpleadoFijo extends Empleado {

    double sueldoBase;

    public EmpleadoFijo(String nombre, String rut, int horasContratadas, double sueldoBase) {
        super(nombre, rut, horasContratadas);
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }

    @Override
    public String toString() {
        return "EmpleadoFijo [Nombre=" + nombre + ", RUT=" + rut + ", Horas Contratadas=" + horasContratadas + ", Sueldo Base=" + sueldoBase + "]";
    }
    
}
