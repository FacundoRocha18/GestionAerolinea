public class GestionAerolinea {
    // Funci�n para calcular el costo de un avi�n privado
    public static double calcularCostoPrivado(double peso, double aceleracion, String nacionalidad, String condicion) {
        double costo = peso * aceleracion;
        if (nacionalidad.equalsIgnoreCase("Estadounidense") && condicion.equalsIgnoreCase("nuevo")) {
            return costo;
        } else if (nacionalidad.equalsIgnoreCase("Estadounidense")) {
            return costo * 1.10; // 10% m�s si no es nuevo
        } else {
            return costo * 1.20; // 20% m�s si no es estadounidense
        }
    }

    // Funci�n para calcular el costo de un avi�n de mercader�a
    public static double calcularCostoMercaderia(double peso, double aceleracion, double costoAlmacenamiento, String condicion) {
        double costo = peso * aceleracion - (peso * costoAlmacenamiento);
        if (condicion.equalsIgnoreCase("usado")) {
            return costo * 1.10; // 10% m�s si es usado
        }
        return costo;
    }

    // Funci�n para calcular el costo de un avi�n de pasajeros
    public static double calcularCostoPasajeros(double peso, double aceleracion, double costoPasaje, int numPasajeros, String condicion) {
        double costo = peso * aceleracion - (numPasajeros * costoPasaje);
        if (condicion.equalsIgnoreCase("usado")) {
            return costo * 1.10; // 10% m�s si es usado
        }
        return costo;
    }

    public static void main() {
        // Datos de los aviones de ejemplo
        double costoPrivado = calcularCostoPrivado(5000, 2.5, "Estadounidense", "nuevo");
        double costoMercaderia = calcularCostoMercaderia(10000, 3.0, 100, "usado");
        double costoPasajeros = calcularCostoPasajeros(15000, 2.8, 200, 150, "nuevo");

        // Mostrar costos de los aviones de ejemplo
        System.out.println("Costos de operaci�n:");
        System.out.println("Avi�n Privado: $" + costoPrivado);
        System.out.println("Avi�n Mercader�a: $" + costoMercaderia);
        System.out.println("Avi�n Pasajeros: $" + costoPasajeros);

        // Encontrar mayor y menor costo
        double mayorCosto = costoPrivado;
        double menorCosto = costoPrivado;

        if (costoMercaderia > mayorCosto) {
            mayorCosto = costoMercaderia;
        }
        if (costoPasajeros > mayorCosto) {
            mayorCosto = costoPasajeros;
        }
        if (costoMercaderia < menorCosto) {
            menorCosto = costoMercaderia;
        }
        if (costoPasajeros < menorCosto) {
            menorCosto = costoPasajeros;
        }

        System.out.println("Mayor costo: $" + mayorCosto);
        System.out.println("Menor costo: $" + menorCosto);

        // Calcular costo total de 777 aviones de mercader�a
        double costoTotal = 0;
        for (int i = 1; i <= 777; i++) {
            costoTotal += calcularCostoMercaderia(10000, 3.0, i, "nuevo");
        }
        System.out.println("Costo total de 777 aviones de mercader�a: $" + costoTotal);
    }
}