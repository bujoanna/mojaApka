package appToEnglish;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("app.txt"); // file - zaczep do pliku ;)
        //boolean success = false;
        //  try {
        //   success = file.createNewFile();
        // } catch (IOException e) {
        //    e.printStackTrace();
        // }
        //System.out.println("Czy udało się utworzyć ? : " + success);

        App app = new App();

while(true)
{
    App.keyboardReading();
    App.writeWordToFile();

}




    }
}
