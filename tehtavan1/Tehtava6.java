/*************************************
Tekijä: Tomi Hamm
Jakson numero: 2
Jakson tehtävänumero: 6.1
Päiväys: 01.11.2022
*************************************/
package tehtavan1;
public class Tehtava6 {
    public static void main(String[] args) {

    //alustetaan luku muuttujat
    int laskuri = 0;
    int lukuParillinen = 0;
    int lukuPariton = 0;
    do {
        // generoidaan randomi lukuja väliltä 1-300
        double lukuR = Math.random();
        // pyöristetään kokonaisluvuksi
        double lukuRandom = Math.floor(lukuR*300+1);
        laskuri = laskuri + 1;
        // tarkistetaan onko luku pariton vai parillinen ja jos on jompikumpi niin lisätään +1 luvun laskuriin
        if(lukuRandom % 2 == 0){
            lukuParillinen = lukuParillinen + 1;
        }
        else {
            lukuPariton = lukuPariton + 1;
            } 
        }
        while (laskuri != 20);
        System.out.println("Parillisia lukuja on " + lukuParillinen);
        System.out.println("Parittomia lukuja on " + lukuPariton);
    }
}