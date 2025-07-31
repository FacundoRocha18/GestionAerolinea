// Clase AvionMercaderia hereda de Avion (concepto: herencia)
public class AvionMercaderia extends Avion {
    private double costoAlmacenamiento;

    // Constructor (concepto: constructores)
    public AvionMercaderia(String matricula, double peso, double aceleracion, 
                           String condicion, double costoAlmacenamiento) {
        super(matricula, peso, aceleracion, condicion);
        this.costoAlmacenamiento = costoAlmacenamiento;
    }

    // M�todo que implementa polimorfismo
    @Override
    public double calcularCostoOperacion() {
        double costo = peso * aceleracion - (peso * costoAlmacenamiento);

        boolean esNuevo = this.condicion.equalsIgnoreCase("nuevo");

        if (!esNuevo) return costo * 1.10; // No es nuevo, +10% mantenimiento

        return costo;
    }
}