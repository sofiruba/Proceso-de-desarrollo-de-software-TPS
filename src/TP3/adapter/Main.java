package TP3.adapter;

public class Main {

        public static void main(String[] args) {
            // Tenemos el sensor viejo
            OldFahrenheitSensor viejo = new OldFahrenheitSensor();

            // Lo envolvemos en el adaptador
            SensorCelsius adaptador = new TempAdapter(viejo);

            // Nuestro sistema ahora lee Celsius felizmente
            System.out.println("Temperatura en Celsius: " + adaptador.leerTemperatura());
        }

}
