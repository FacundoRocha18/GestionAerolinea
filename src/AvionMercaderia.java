// Clase AvionMercaderia hereda de Avion (concepto: herencia)
public class AvionMercaderia extends Avion {
    private double costoAlmacenamiento;

    // Constructor (concepto: constructores)
    public AvionMercaderia(String matricula, double peso, double aceleracion, 
                           String condicion, double costoAlmacenamiento) {
        super(matricula, peso, aceleracion, condicion);
        this.costoAlmacenamiento = costoAlmacenamiento;
    }

    // Método que implementa polimorfismo
    public double calcularCostoOperacion() {
        double costo = peso * aceleracion - (peso * costoAlmacenamiento);
        if (condicion.equalsIgnoreCase("nuevo")) {
            return costo;
        } else {
            return costo * 1.10; // 10% mantenimiento
        }
    }
}