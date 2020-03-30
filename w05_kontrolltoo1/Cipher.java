/**
 * Cipher
 */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Cipher {

    public Cipher(){

    }
    public String cipher(String word, int key){

        String alphabet="abcdefghijklmnopqrstuvwxyz";
        int tmp;
        String newWord="";
        int charPosition=0;
        if(word.length()!=0) {                                      //kui sõna pikkus ei ole null
            for (int i=0; i<word.length(); i++)                     //käiakse ükshaaval sõna läbi, kuni sõna lõpeb
            {
                charPosition = alphabet.indexOf(word.charAt(i));    //tehakse kindlalt kus positsioonis sõna täht on alphabetis
                tmp = (charPosition+key)%26;                        //võetakse ennem kindlalt tehtud positsioon ja liidakse number(key mille väärtus antakse hiljem metoodi välja kutsumise ajal)
                                                                    //modulo on vajalik et peale z tuleks a
                newWord = newWord+alphabet.charAt(tmp);             //šifreeritud sõna(ehk siis newWord)saaab vääärtuse  
            }
        }
        return newWord;                                             //väärtus mida meetod tagasi annab on šifreeritud sõna
    }

    public String decipher(String text,int key){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int tmp=0;
        String c="";
        int charPosition = 0;
        if(text.length()!=0) {                                      //kui sõna pikkus ei ole null
            for (int i=0; i<text.length(); i++){                    //käiakse ükshaaval sõna läbi, kuni sõna lõpeb
                charPosition = alphabet.indexOf(text.charAt(i));    //tehakse kindlalt kus positsioonis sõna täht on alphabetis
                tmp=(charPosition-key)%26;                          //võetakse ennem kindlalt tehtud positsioon ja lahutatakse number(key mille väärtus antakse hiljem metoodi välja kutsumise ajal)
                                                                    //modulo on vajalik et peale z tuleks a
                if(tmp < 0){                                        //kui tmp on väiksem kui 0
                    tmp=alphabet.length()+tmp;                      //siis tmp võtab  
                }
                c = c+alphabet.charAt(tmp);                         //dešifreeritud sõna(ehk siis c)saaab vääärtuse
            }
            
        }
        return c;                                                   //väärtus mida meetod tagasi annab on dešifreeritud sõna
    }

    public static void main(String[] args)throws IOException{
        Cipher x=new Cipher();                                                  //uus objekti loomine
        System.out.println("ciphered:" + x.cipher("today is exam day",3));      //metood kutsutakse välja ja pannakse väärtused paika,printitakse siis meetodi tagastatud väärtus,ehk šifreeritud sõna
        System.out.println("deciphered:"+ x.decipher("wrgdbclvchadpcgdb",3));   //metood kutsutakse välja ja pannakse väärtused paika,printitakse siis meetodi tagastatud väärtus,ehk dešifreeritud sõna  
        
        File file = new File("text.txt");
        File file2= new File("text2.txt");
        //System.out.println(file);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
    
        String line= br.readLine();
        while(line!=null){
            //System.out.println(line);
            line= br.readLine();
        }
        br.close();
        fr.close();

        if(!file2.exists()){
            file2.createNewFile();
        }
        PrintWriter pw=new PrintWriter(file2);
        Scanner scanner= new Scanner(file);

        String line2 = scanner.nextLine();
        String[]lineData = line2.split(",");
        pw.println(
            lineData[1]+" is ciphered:" + x.cipher(lineData[1],Integer.valueOf(lineData[0]))+
            "\r\n"+ lineData[2]+ " is ciphered:" + x.cipher(lineData[2],Integer.valueOf(lineData[0]))+
            "\r\n"+ lineData[3]+ " is ciphered:" + x.cipher(lineData[3],Integer.valueOf(lineData[0]))

        );
        scanner.close();
        pw.close();
    }
}