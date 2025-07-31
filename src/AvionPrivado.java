// Clase AvionPrivado hereda de Avion (concepto: herencia)
public class AvionPrivado extends Avion {
    private String nombrePropietario;
    private String nacionalidad;

    // Constructor (concepto: constructores)
    public AvionPrivado(String matricula, double peso, double aceleracion, 
                        String condicion, String nombrePropietario, String nacionalidad) {
        super(matricula, peso, aceleracion, condicion);
        this.nombrePropietario = nombrePropietario;
        this.nacionalidad = nacionalidad;
    }

    // Método que implementa polimorfismo
    
    public double calcularCostoOperacion() {
        double costo = peso * aceleracion;
        if (nacionalidad.equalsIgnoreCase("Estadounidense") && condicion.equalsIgnoreCase("nuevo")) {
            return costo;
        } else if (nacionalidad.equalsIgnoreCase("Estadounidense")) {
            return costo * 1.10; // 10% mantenimiento
        } else {
            return costo * 1.20; // 10% mantenimiento + 10% impuestos
        }
    }
}