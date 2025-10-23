import java.util.Random;
public class Atleta implements Runnable {
    String nome;
    int numero;
    double tempo = 0;
    double metri = 0;
    final double LUNGHEZZAGARA= 40000;
    public Atleta(String pnome, int pnumero) {
        numero=pnumero;
        nome=pnome;
    }
    @Override
    public void run() {
        System.out.println("Sono il corridore " + nome + "il mio numero è " + numero);
        System.out.println("Sono il corridore " + nome + "il mio numero è " + numero);
Random metriPercorsi = new Random();
while(metri <= LUNGHEZZAGARA) {
    metri += metriPercorsi.nextDouble(10);
    try {
        Thread.currentThread().sleep(1000);

    } catch(InterruptedException ex) {
        System.out.println("Errore");
    }
}
    }
}


