/**
 * @author Joanna Bujnowska
 */

public class Agregacja {

    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Joanna", new Adres("Warszawska",18) );
        Pracownik pracownik2 = new Pracownik("Jan", new Adres("Krakowska",32) );
        Pracownik pracownik3 = new Pracownik("Malwina", new Adres("lodzka",5) );


        System.out.println(pracownik);
        System.out.println(pracownik2);
        System.out.println(pracownik3);




    }

}


class Pracownik {

    /**
     * Klasa pracownik do czegoś tam bla bla bla
     */
    String imie;
    Adres adres;  // to jest agregacja - czyli łączenie się w całości.. c
    // czyli klasa pracownik łączy się z klasą adress.

    // Praca praca; takie coś nazywamy kompozycją. Bo praca nie może istnieć bez pracownika ! :)

  public Pracownik(String imie, Adres adres)  {
      this.imie = imie;
      this.adres = adres;
  }

    @Override
    public String toString() {
        return "Pracownik: " + imie  + ", adres: " + adres.ulica + " " + adres.nrDomu;
    }
}
class  Adres  {

    String ulica;
    int nrDomu;



    public Adres( String ulica, int nrDomu)  {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }

}