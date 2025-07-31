// Clase AvionPrivado hereda de Avion (concepto: herencia)
public class AvionPrivado extends Avion {
    private String nombrePropietario;
    private String nacionalidad;

    // Constructor (concepto: constructores)
    public AvionPrivado(
            String matricula,
            double peso,
            double aceleracion,
            String condicion,
            String nombrePropietario,
            String nacionalidad
    ) {
        super(matricula, peso, aceleracion, condicion);

        this.nombrePropietario = nombrePropietario;
        this.nacionalidad = nacionalidad;
    }

    // Método que implementa polimorfismo
    @Override
    public double calcularCostoOperacion() {
        double costo = peso * aceleracion;

        boolean esEstadounidense = nacionalidad.equalsIgnoreCase("Estadounidense");
        boolean esNuevo = condicion.equalsIgnoreCase("nuevo");

        if (!esEstadounidense)
            return costo * 1.20; // No estadounidense y es usado, +10% por impuestos y 10% por mantenimiento

        if (!esNuevo) return costo * 1.10;          // Es estadounidense, pero usado +10% por mantenimiento

        return costo;                               // Es estadounidense y es nuevo, sin impuestos ni mantenimiento
    }
}