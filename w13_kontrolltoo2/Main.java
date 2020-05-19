import java.io.BufferedReader;
import java.io.FileReader;

/*Sõnade lõputähed

Salvesta uurimiseks vähemalt paarileheküljeline tekst.
* Trüki välja sõnade viimased tähed
* Väljasta erinevad sõnalõputähed nende esinemissageduse järjekorras
* Iga lõputähega sõnade jaoks on eraldi fail, kuhu need tekstist kirjutatakse. 
Luuakse HTML-leht viidetega tekstis esinenud lõputähtedega failidele,
 iga viite juures arv, mitu korda vastava lõputähega sõna esines.
 */

 /**
  * Main
  */
 public class Main {

   public static void main(String[] args) throws Exception {

      Counter c=new Counter();
      System.out.println("Sõnalõppude tähed on"); 
      c.count();
      System.out.println("Tähede sagedus on");
      c.howMany1(null);
      c.intoFile();
      c.goToWeb(null);

      
        
    }
 
     
 }