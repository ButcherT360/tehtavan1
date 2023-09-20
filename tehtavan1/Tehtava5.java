/*************************************
Tekijä: Tomi Hamm
Jakson numero: 2
Jakson tehtävänumero: 5.8
Päiväys: 31.10.2022
*************************************/
package tehtavan1;
import java.util.Scanner;
public class Tehtava5 {
    public static void main(String[] args) {
    //alustetaan skanneri joka kysyy lukuja
    Scanner myObj = new Scanner(System.in);
    //alustetaan luku muuttujat
    int valinta;
    // do while looppi niin kauan kun syöte on joku muu kuin 0
    do { 
    // Tulostetaan valikko
    System.out.println("Valitse jokin vaihtoehto tai poistu valitsemalla 0 \n Valikko\n 1. Valinta yksi\n 2. Valinta kaksi\n 3. Valinta kolme \n 0. Exit");
    // tallennetaan seuraava syöte int tyyppisenä valinta muuttujaan
    valinta = myObj.nextInt();
    // jos on valinta on yksi, tulosta Valitsit yksi jne 
        if(valinta == 1){
            System.out.println("Valitsit yksi (1)");
        }
        else if(valinta == 2){
            System.out.println("Valitsit kaksi (2)");
        }
        else if(valinta == 3){
            System.out.println("Valitsit kolme (3)");
        }

    }
    while (valinta != 0);
        myObj.close();
    }
}