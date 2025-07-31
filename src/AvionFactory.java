public class AvionFactory {

    public static AvionPrivado crearAvionPrivado(
            String matricula,
            double peso,
            double aceleracion,
            String condicion,
            String nombrePropietario,
            String nacionalidad
    ) {
        return new AvionPrivado(matricula, peso, aceleracion, condicion, nombrePropietario, nacionalidad);
    }

    public static AvionMercaderia crearAvionMercaderia(
            String matricula,
            double peso,
            double aceleracion,
            String condicion,
            double costoAlmacenamiento
    ) {
        return new AvionMercaderia(matricula, peso, aceleracion, condicion, costoAlmacenamiento);
    }

    public static AvionPasajeros crearAvionPasajeros(
            String matricula,
            double peso,
            double aceleracion,
            String condicion,
            double costoPasaje,
            int cantidadPasajeros
    ) {
        return new AvionPasajeros(matricula, peso, aceleracion, condicion, costoPasaje, cantidadPasajeros);
    }
}
