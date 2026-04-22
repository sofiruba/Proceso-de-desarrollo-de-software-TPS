package TP4.bridge;

public class Main {
    public static void main(String[] args) {
        FormatoVideo mp4 = new MP4();
        FormatoVideo mkv = new MKV();

        // 2. Creamos los dispositivos y les "pasamos" el formato por el puente
        // Fijate que podés combinar cualquier cosa con cualquier cosa:

        Dispositivo miTv = new SmartTV(mp4);

        // 3. Ejecutamos la acción
        miTv.reproducir();      // Salida: Reproduciendo en SmartTV: procesando mp4...

        // 4. ¡La magia! Podés cambiar el formato en caliente si agregás un setter
        miTv.setFormato(mkv);
        miTv.reproducir();      // Ahora la misma TV reproduce MKV
    }
}