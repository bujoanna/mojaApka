package appToEnglish;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static String word;


    public static void keyboardReading() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz słowo: ");
        word = scanner.nextLine();
    }


    public static void writeWordToFile() throws IOException {

        FileWriter appTxt = new FileWriter("app.txt", true);
        appTxt.write(word + "\n");
        System.out.println();
        appTxt.close();

    }


}
