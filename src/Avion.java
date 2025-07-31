// Clase abstracta para todos los aviones (concepto: clases abstractas)
public abstract class Avion {
    protected String matricula; // Atributo protegido
    protected double peso;
    protected double aceleracion;
    protected String condicion; // "nuevo" o "usado"

    // Constructor (concepto: constructores)
    public Avion(String matricula, double peso, double aceleracion, String condicion) {
        this.matricula = matricula;
        this.peso = peso;
        this.aceleracion = aceleracion;
        this.condicion = condicion;
    }

    // Método abstracto para calcular costo (concepto: polimorfismo)
    public abstract double calcularCostoOperacion();

    // Selector (concepto: selectores/modificadores)
    public String getMatricula() {
        return matricula;
    }
}