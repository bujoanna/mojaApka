package superKonstruktor;

public class KlasaRozszerzona extends KlasaPodstawowa{

    KlasaRozszerzona()  {

        super(101); //żeby nie tworzyć obiektu klasy podstawowej wystarczy super a w nim parametr z konstruktora z klasy podstawowej
        System.out.println(" napis z konstruktora z klasy rozszerzonej");
    }
}
