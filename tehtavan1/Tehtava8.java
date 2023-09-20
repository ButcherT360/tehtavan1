/*************************************
Tekijä: Tomi Hamm
Jakson numero: 2
Jakson tehtävänumero: 8.1 & 8.2
Päiväys: 01.11.2022
*************************************/
package tehtavan1;
import java.util.Scanner;  // Import the Scanner class
public class Tehtava8 {
    
public static void main(String[] args) {

    // kutsutaan jakolaskua
    double tulos = jakolasku();
     // tulostetaan jakolaskun tulos
     System.out.println("Jakolaskun tulos on " + tulos);
    // kutsutaan kolmen luvun summausta
    int summanTulos = kolmeLukuaSumma(3, 4, 5);

    // tulostetaan kolmen luvun summa
    System.out.println("3 + 4 + 5 summa on " + summanTulos);
    }
public static double jakolasku(){
     //alustetaan skanneri joka kysyy lukuja
    Scanner myObj = new Scanner(System.in);
      
    System.out.println("Syötä kaksi lukua ");
    // kysytään käyttäjältä kahta lukua
    double osamaara = myObj.nextDouble() /  myObj.nextDouble();
    // suljetaan skanneri
    myObj.close();
    // palautetaan tulos
    return osamaara;

}
public static int kolmeLukuaSumma(int x, int y, int c){
    // lasketaan kolme lukua yhteen ja palautetaan tulos
    int summa = x + y + c; 
    return summa;
}
}
