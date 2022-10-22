/*************************************
Tekijä: Tomi Hamm
Jakson numero: 2
Jakson tehtävänumero: 1.1
Päiväys: 22.10.2022
*************************************/
package tehtavan1;
import java.util.Scanner;
public class Tehtava4 {
    public static void main(String[] args) {
    //alustetaan skanneri joka kysyy lukuja
    Scanner myObj = new Scanner(System.in);
    //alustetaan luku muuttujat
    int mikapaiva;
    // kysytään lukua
    System.out.println("Syötä viikonpäivän numero 1-7");
    // tallennetaan seuraava syöte int tyyppisenä luku muuttujaan1
    mikapaiva = myObj.nextInt();
    // jos on keissi 1-7 niin tulostaa viikonpäivän nimen.
    switch (mikapaiva) {
        case 1:
        System.out.print("Maanantai");
        break;
        case 2:
        System.out.print("Tiistai");
        break;
        case 3:
        System.out.print("Keskiviikko");
        break;
        case 4:
        System.out.print("Torstai");
        break;
        case 5:
        System.out.print("Perjantai");
        break;
        case 6:
        System.out.print("Lauantai");
        break;
        case 7:
        System.out.print("Sunnuntai");
        break;

        
        }
        myObj.close();
    }
}