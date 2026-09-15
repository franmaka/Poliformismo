public class EmpleadoFreelance extends Empleado {
    
    double valorHora;

    public EmpleadoFreelance(String nombre, String rut, int horasContratadas, double valorHora) {
        super(nombre, rut, horasContratadas);
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasContratadas * valorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoFreelance [Nombre=" + nombre + ", RUT=" + rut + ", Horas Contratadas=" + horasContratadas + ", Valor por Hora=" + valorHora + "]";
    }
}
