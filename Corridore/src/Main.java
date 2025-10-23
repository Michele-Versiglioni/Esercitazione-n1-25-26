public class Main {
    public static void main(String[] args) {
        System.out.println("Gara Atletica");
        Atleta a1 = new Atleta("Mario", 23);
        Atleta a2 = new Atleta("Rogo", 22);
        Thread ta2 = new Thread(a2);
        ta2.setPriority(Thread.MAX_PRIORITY);
        Thread ta1 = new Thread(a1);
        for (int i = 3; i > 0; i--) {
            System.out.println("Inizio in: " + i);
        }
        System.out.println("Caratteristiche Main " + Thread.currentThread().getName()
                + "-" + Thread.currentThread().getPriority());
    }
    }