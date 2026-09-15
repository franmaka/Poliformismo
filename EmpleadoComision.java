public class EmpleadoComision extends Empleado {
    
    double sueldoBase;
    double ventasMes;
    double comision;

    public EmpleadoComision(String nombre, String rut, int horasContratadas, double sueldoBase, double ventasMes, double comision) {
        super(nombre, rut, horasContratadas);
        this.sueldoBase = sueldoBase;
        this.ventasMes = ventasMes;
        this.comision = comision;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    @Override
    public String toString() {
        return "EmpleadoComision [Nombre=" + nombre + ", RUT=" + rut + ", Horas Contratadas=" + horasContratadas + ", Sueldo Base=" + sueldoBase + ", Ventas del Mes=" + ventasMes + ", Comisión=" + comision + "]";
    }
    
}
