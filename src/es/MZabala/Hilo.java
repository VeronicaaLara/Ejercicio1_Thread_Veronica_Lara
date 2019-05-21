package es.MZabala;

public class Hilo  extends Thread{



    private int  num;
    private long tiempoInicial;


    public Hilo(){

    }

    public Hilo(int num, long tiempoInicial) {

        this.num = num;
        this.tiempoInicial = tiempoInicial;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }
    @Override
    public void run(){
        esperaXsegundos(this.num);
        System.out.println("Hilo" + this.num);
        System.out.println("Hola Mundo");


    }

    private void esperaXsegundos(int seg) {

        try{
            Thread.sleep(seg * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public void start(){
        run();
    }


}
