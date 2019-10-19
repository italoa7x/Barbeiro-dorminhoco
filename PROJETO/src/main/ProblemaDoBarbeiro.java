package main;

import java.util.concurrent.Semaphore;
import java.util.Observable;
import java.util.concurrent.atomic.AtomicBoolean;

public class ProblemaDoBarbeiro extends Observable {

    private static Semaphore cadeiraBarbearia = new Semaphore(5, true);
    private static final ProblemaDoBarbeiro instance = new ProblemaDoBarbeiro();
    private int cadeirasOcupadas;
    private boolean cadeiraBarbeiroOcupada = false;
    private AtomicBoolean executa;

    public ProblemaDoBarbeiro() {
        cadeirasOcupadas = 0;
        executa = new AtomicBoolean(true);
    }

    public static ProblemaDoBarbeiro getInstance() {
        return instance;
    }

    public void connect() throws InterruptedException {
        while (executa.get()) {
            try {
                cadeiraBarbearia.acquire();
                cadeirasOcupadas++;
                setChanged();
                notifyObservers();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }

            try {
                cadeiraBarbearia.release();
                cadeirasOcupadas--;
                cortar();
                setChanged();
                notifyObservers();
                Thread.sleep(500);
            } finally {
                cadeiraBarbeiroOcupada = false;
            }
        }
    }
    /**
     * Método que realização a ação de cortar o cabelo.
     */
    private synchronized void cortar() {
        try {
            cadeiraBarbeiroOcupada = true;
            Thread.sleep(500);
            setChanged();
            notifyObservers();
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println("Não foi possível fazer a thread dormir.");
        }

    }

    /**
     * returna quantas cadeiras estão ocupadas atualmente.
     */
    public int getCadeirasOcupadas() {
        return cadeirasOcupadas;
    }

    /**
     * retorna um boolean para saber se a cadeira do barbeiro está ocupada.
     */
    public boolean getCadeiraBarbeiroOcupada() {
        return cadeiraBarbeiroOcupada;
    }

    /**
     * 
     * Método responsável por iniciar a execução
     */
    public void setExecuta(boolean executa) {
        this.executa.set(executa);
    }

}
