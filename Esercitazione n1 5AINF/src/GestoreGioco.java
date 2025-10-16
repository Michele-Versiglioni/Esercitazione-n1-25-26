public class GestoreGioco {
    private int numeroVincente;


    public GestoreGioco() {
        numeroVincente = 7;
    }

    public GestoreGioco(GestoreGioco gg) {
        numeroVincente = gg.numeroVincente;
    }

    public void verifica(int num) {
        System.out.println("Sono dentro verifica");
        if (num == numeroVincente) {
            //verifica num
            System.out.println("Il numero è giusto, bravo!!");
        } else {
            System.out.println("Il numero è sbagliato, peccato!!");
        }
    }
}

