package es.MZabala;

public class Main {

    public static void main(String[] args) {
	// write your code here

        long tiempoInicial = System.currentTimeMillis();

        Hilo hilo1 = new Hilo (1, tiempoInicial);
        Hilo hilo2 = new Hilo (2, tiempoInicial);
        Hilo hilo3 = new Hilo (3, tiempoInicial);
        Hilo hilo4 = new Hilo (4, tiempoInicial);
        Hilo hilo5 = new Hilo (5, tiempoInicial);
        Hilo hilo6 = new Hilo (6, tiempoInicial);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();


    }
}
