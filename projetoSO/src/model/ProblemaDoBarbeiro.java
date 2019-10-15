package model;

import java.util.concurrent.Semaphore;
import java.util.Observable;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ProblemaDoBarbeiro extends Observable {

    private static Semaphore cadeiraBarbearia = new Semaphore(5, true);
    private Object lock = new Object();
    private static final ProblemaDoBarbeiro instance = new ProblemaDoBarbeiro();
    private int cadeirasOcupadas;
    private boolean cadeiraBarbeiroOcupada = false;
    private AtomicBoolean executa;

    public ProblemaDoBarbeiro() {
        cadeirasOcupadas = 0;
        lock = new Object();
        executa = new AtomicBoolean(true);
    }

    public static ProblemaDoBarbeiro getInstance() {
        return instance;
    }

    public void connect(JLabel lblMensagemCadeiraLivre, JLabel lblCadeiraBarbeiro) throws InterruptedException {
        while (executa.get()) {
            try {
                JOptionPane.showMessageDialog(null,"Cadeiras cheiras. O cliente foi embora.");
                cadeiraBarbearia.acquire();
                cadeirasOcupadas++;
                setChanged();
                notifyObservers();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Erro ao sentar na cadeira do barbeiro.");
            }

            try {
                lblMensagemCadeiraLivre.setText("Cadeira livre.");
                cadeiraBarbearia.release();
                cadeirasOcupadas--;
                cortar(lblCadeiraBarbeiro);
                setChanged();
                notifyObservers();
                Thread.sleep(500);
            } finally {
                cadeiraBarbeiroOcupada = false;
                lblCadeiraBarbeiro.setIcon(new ImageIcon(getClass().getResource("/icons/barbeiro_dormindo.png")));
            }
        }
    }

    private synchronized void cortar(JLabel lblCadeirabarbeiro) {

        try {
            lblCadeirabarbeiro.setIcon(new ImageIcon(getClass().getResource("/icons/barbeiro_cortando.gif")));
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
     * @return the cadeirasOcupadas
     */
    public int getCadeirasOcupadas() {
        return cadeirasOcupadas;
    }

    /**
     * @return the cadeiraBarbeiroOcupada
     */
    public boolean isCadeiraBarbeiroOcupada() {
        return cadeiraBarbeiroOcupada;
    }

    /**
     * @param executa the executa to set
     */
    public void setExecuta(boolean executa) {
        this.executa.set(executa);
    }

}
