package ej1;

public class ConfiguracionRed {
    private static ConfiguracionRed instancia;
    private static int puerto = 1000;
    private static String servidor;

    private ConfiguracionRed() {
    }

    public static ConfiguracionRed getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracionRed();
        }
        return instancia;
    }

    public static String getServidor() {
        return servidor;
    }

    public static void setServidor(String servidor) {
        ConfiguracionRed.servidor = servidor;
    }

    public static int getPuerto() {
        return puerto;
    }

    public static void setPuerto(int puerto) {
        ConfiguracionRed.puerto = puerto;
    }
}

