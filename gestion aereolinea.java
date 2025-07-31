public class AvionPrivado extends Avion {
    private String nombrePropietario;
    private String nacionalidad;

    public AvionPrivado(String matricula, double peso, double aceleracion, String condicion,
                        String nombrePropietario, String nacionalidad) {
        super(matricula, peso, aceleracion, condicion);
        this.nombrePropietario = nombrePropietario;
        this.nacionalidad = nacionalidad.toLowerCase();
    }

    @Override
    public double calcularCostoOperacion() {
        double base = peso * aceleracion;
        if (nacionalidad.equals("estadounidense") && condicion.equals("nuevo")) {
            return base;
        } else if (nacionalidad.equals("estadounidense")) {
            return base * 1.20;
        } else {
            return base * 1.30;
        }
    }
}
