public class Main {
    public static void main(String[] args) {
        AvionPrivado avionPrivado = AvionFactory.crearAvionPrivado("A1", 1000, 3, "nuevo", "Juan Pérez", "estadounidense");
        AvionMercaderia avionMercaderia = AvionFactory.crearAvionMercaderia("B1", 1500, 2, "usado", 1.5);
        AvionPasajeros avionPasajeros = AvionFactory.crearAvionPasajeros("C1", 20000, 2.5, "usado", 150, 100);

        double costoPrivado = avionPrivado.calcularCostoOperacion();
        double costoMercaderia = avionMercaderia.calcularCostoOperacion();
        double costoPasajeros = avionPasajeros.calcularCostoOperacion();

        System.out.println("Costo operación privado: $" + costoPrivado);
        System.out.println("Costo operación mercadería: $" + costoMercaderia);
        System.out.println("Costo operación pasajeros: $" + costoPasajeros);

        double max = Math.max(costoPrivado, Math.max(costoMercaderia, costoPasajeros));
        double min = Math.min(costoPrivado, Math.min(costoMercaderia, costoPasajeros));

        if (max == costoPrivado) {
            System.out.println("El avión más costoso es el privado.");
        } else if (max == costoMercaderia) {
            System.out.println("El avión más costoso es el de mercadería.");
        } else {
            System.out.println("El avión más costoso es el de pasajeros.");
        }

        if (min == costoPrivado) {
            System.out.println("El avión menos costoso es el privado.");
        } else if (min == costoMercaderia) {
            System.out.println("El avión menos costoso es el de mercadería.");
        } else {
            System.out.println("El avión menos costoso es el de pasajeros.");
        }

        double sumaTotal = 0;

        for (int i = 1; i <= 777; i++) {
            AvionMercaderia avion = new AvionMercaderia("M" + i, 1000, 2, "nuevo", i);
            sumaTotal += avion.calcularCostoOperacion();
        }

        System.out.println("Costo total de operación de 777 aviones de mercadería: $" + sumaTotal);
    }
}
