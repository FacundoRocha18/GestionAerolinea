// Clase AvionPasajeros hereda de Avion (concepto: herencia)
public class AvionPasajeros extends Avion {
    private int numPasajeros;
    private double costoPasaje;

    // Constructor (concepto: constructores)
    public AvionPasajeros(
            String matricula,
            double peso,
            double aceleracion,
            String condicion,
            double costoPasaje,
            int cantidadPasajeros
    ) {
        super(matricula, peso, aceleracion, condicion);

        this.costoPasaje = costoPasaje;
        this.numPasajeros = cantidadPasajeros;
    }

    // Método que implementa polimorfismo
    @Override
    public double calcularCostoOperacion() {
        double costo = peso * aceleracion - this.numPasajeros * this.costoPasaje;

        if (!condicion.equalsIgnoreCase("nuevo")) {
            return costo * 1.10; // +10% mantenimiento
        }

        return costo;
    }
}