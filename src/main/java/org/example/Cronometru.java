package org.example;

public class Cronometru extends Thread{

    public void run() {


        for (int i = 0; i <= 60; i++){
            System.out.println(i);
            try{
                sleep(1000);
            }
            catch (InterruptedException e){
                System.err.println("Eroare la somn");
            }
        }

    }
}
