public class Main {
    
    public static void main(String[] args) {
        // Crear instancias de los empleados
        EmpleadoFijo ef1 = new EmpleadoFijo("Juan Pérez", "12345678-9", 40, 1500.0);
        EmpleadoComision ec1 = new EmpleadoComision("María López", "98765432-1", 30, 1000.0, 5000.0, 0.1);
        EmpleadoFreelance efr1 = new EmpleadoFreelance("Carlos González", "11223344-5", 20, 20.0);

        Empleado[] sueldos =  new Empleado[] {ef1, ec1, efr1}; //array de 3 objetos de tipo Empleado

        double total = 0;
        
        /*
        for (Empleado e : sueldos) {
            System.out.println(e); //toString() de cada empleado
            total = total + e.calcularSueldo();
            //total += e.calcularSueldo(); //otra forma de escribir la suma
        }
        */
        
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println(sueldos[i]); //toString() de cada empleado
            total += sueldos[i].calcularSueldo(); //otra forma de escribir la suma
        }
        
        System.out.println("Total sueldos: " + total);
    }
}
