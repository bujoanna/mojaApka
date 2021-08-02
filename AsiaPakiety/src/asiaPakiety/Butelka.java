package asiaPakiety;

public class Butelka {


    private double ileLitrow;

    Butelka(double ileLitrow) {
        this.ileLitrow = ileLitrow;
    }

    double getPojemnosc() {
        return ileLitrow;
    }

    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[50];

        for (int x = 0; x < butelka.length; x++) {
            butelka[x] = new Butelka(x + 1);

            System.out.println("Butelka " + x + " ma pojemność " + butelka[x].getPojemnosc() + " litrów.");
        }

    }
}


