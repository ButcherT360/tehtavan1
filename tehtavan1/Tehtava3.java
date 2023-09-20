/*************************************
Tekijä: Tomi Hamm
Jakson numero: 2
Jakson tehtävänumero: 3.4
Päiväys: 22.10.2022
*************************************/
package tehtavan1;

import java.util.Scanner;

public class Tehtava3 {
    public static void main(String[] args) {
        //alustetaan skanneri joka kysyy lukuja
     Scanner myObj = new Scanner(System.in);
     //alustetaan luku muuttujat
        int luku;
        // kysytään lukua
        System.out.println("Syötä luku");
        // tallennetaan seuraava syöte int tyyppisenä luku muuttujaan
        luku = myObj.nextInt();
        // Tarkistetaan onko syötetty luku pienempi tai yhtäsuuri kuin 50 ja suurempi tai yhtäsuuri kuin 1
        if  (luku <= 50 && luku >= 1){
            System.out.print("Luku on välillä 1-50");
        }
            else{
                System.out.print("Luku ei ole välillä 1-50");

        // suljetaan skanneri
        myObj.close();
        }
    }
}
