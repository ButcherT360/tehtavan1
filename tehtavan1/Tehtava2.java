/*************************************
Tekijä: Tomi Hamm
Jakson numero: 2
Jakson tehtävänumero: 2.1
Päiväys: 22.10.2022
*************************************/
package tehtavan1;
import java.util.Scanner;  // Import the Scanner class
public class Tehtava2 {
    
    public static void main(String[] args) {
        //alustetaan skanneri joka kysyy lukuja
     Scanner myObj = new Scanner(System.in);
     //alustetaan luku muuttujat
        int luku;
        int luku2;
        // kysytään lukua
        System.out.println("Syötä luku");
        // tallennetaan seuraava syöte int tyyppisenä luku muuttujaan
        luku = myObj.nextInt();
        System.out.println("Syötä toinen luku");
        luku2 = myObj.nextInt();
        // tulostetaan tallennetut arvot ja tulostetaan tekstiä.
        System.out.print(luku + " + " + luku2 + " on ");
        // suoritetaan + lasku
        System.out.println(luku + luku2);

        System.out.print(luku + " - " + luku2 + " on ");
        // suoritetaan - lasku
        System.out.println(luku - luku2);

        System.out.print(luku + " * " + luku2 + " on ");
        // suoritetaan * lasku
        System.out.println(luku * luku2);

        System.out.print(luku + " / " + luku2 + " on ");
        // suoritetaan / lasku
        System.out.println(luku / luku2);  

    // suljetaan skanneri
    myObj.close();
    }
}
