/*************************************
Tekijä: Tomi Hamm
Jakson numero: 2
Jakson tehtävänumero: 7.1
Päiväys: 01.11.2022
*************************************/
package tehtavan1;

public class Tehtava7 {

    public static void main(String[] args) {

    //alustetaan 50 alkioinen taulukko
    int arvot[] = new int[50];
        // loopataan 50 kertaa ja tallennetaan random luku taulukkoon.
        for(int luku = 0; luku < 50; luku++) {
        // generoidaan randomi lukuja taulukkoon väliltä 1-100
        arvot[luku] = (int)(Math.random()*100);
        // tulostetaan taulukko
        System.out.println(arvot[luku]);
    }
        // alustetaan max arvo
        int max = arvot[0];
       // loopataan taulukon koon mukaan ja etsitään suurin arvo
        for(int luku = 0; luku < arvot.length; luku++) 
        if (max < arvot[luku]) max = arvot[luku]; {
         System.out.println("Taulukon maksimiarvo on " + max);   
        }

    }
}
