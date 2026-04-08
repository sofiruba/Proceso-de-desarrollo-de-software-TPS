package TP3.ej2;
public class Main {
    public static void main(String[] args) {
        IInternet internet = new ProxyInternet();
        internet.conectarA("www.google.com"); // permitido
        internet.conectarA("www.facebook.com"); // bloqueado
        }
    }
