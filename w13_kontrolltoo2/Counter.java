import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Counter {
    
    public static String textFile;
    public static String[] words = new String[0];
    private List<Character>list=new ArrayList<Character>();

    public void count() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
        while ((textFile = br.readLine()) != null) {
            words = textFile.split(" ");
            for (int i = 0; i <= words.length - 1; i++) {
                if(words[i].charAt(words[i].length()-1)=='.'||words[i].charAt(words[i].length()-1)==','||words[i].charAt(words[i].length()-1)==';'||words[i].charAt(words[i].length()-1)==':'||words[i].charAt(words[i].length()-1)=='?'||words[i].charAt(words[i].length()-1)=='!'||words[i].charAt(words[i].length()-1)=='-'||words[i].charAt(words[i].length()-1)==')'||words[i].charAt(words[i].length()-1)=='"'){
                    char c = words[i].charAt(words[i].length() - 2);    
                    list.add(c);
                    //System.out.println(list);
                }else{
                    char s = words[i].charAt(words[i].length() - 1);
                    list.add(s);
                }
            }
        
        }
        System.out.println(list);
        //System.out.println(words1);
        //System.out.println(final_words);
        
        br.close();
       
    }

    public void howMany1(TreeMapDemo demo){
        
        Character[] lastLetter = new Character [list.size()];
        lastLetter = list.toArray(lastLetter);

        Map<Character, Integer> m = new TreeMap<Character, Integer>();

        for(int i = 0; i< lastLetter.length; i++){
    
            if(m.containsKey(lastLetter[i])){
    
                m.put(lastLetter[i], m.get(lastLetter[i]) + 1);
            }
            else {
                m.put(lastLetter[i], 1);
            }
        }
        Map sortedMap = demo.sortByValues(m);
        Set set = sortedMap.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
        Map.Entry me = (Map.Entry)i.next();
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());
        }
    }
 
    public void intoFile(){
        Set<Character> set = new HashSet<Character>(list);
        List<Character> list2 = new ArrayList<Character>(set);

        try {
            for(int j=0;j<list2.size();j++){
                final FileWriter fileWriter = new FileWriter("files/" + list2.get(j) + ".txt", true);
                BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
                while ((textFile = br.readLine()) != null) {
                    words = textFile.split(" ");
                    for (int i = 0; i <= words.length - 1; i++) {
                        if(words[i].charAt(words[i].length()-1)=='.'||words[i].charAt(words[i].length()-1)==','||words[i].charAt(words[i].length()-1)==';'||words[i].charAt(words[i].length()-1)==':'||words[i].charAt(words[i].length()-1)=='?'||words[i].charAt(words[i].length()-1)=='!'||words[i].charAt(words[i].length()-1)=='-'||words[i].charAt(words[i].length()-1)==')'||words[i].charAt(words[i].length()-1)=='"'){
                            char c = words[i].charAt(words[i].length() - 2);   
                            if(c==list2.get(j)){
                                
                                fileWriter.write(words[i].replaceAll("[^a-zA-Z0-9]", "")+ "\n");
                            }
                        }else{
                            char s = words[i].charAt(words[i].length() - 1);
                            if(s==list2.get(j)){
                                fileWriter.write(words[i] + "\n");
                            }
                        }
                    }
                  
                }
                
                fileWriter.close();
                br.close();  
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void goToWeb(TreeMapDemo demo) throws IOException {
        String header = "<!DOCTYPE html>" + "\n" +
        "<html>" + "\n" +
        "<head>" + "\n" +
        "<title>Lõpputähed koos sageldusega</title>" + "\n" +
        "<meta name='viewport' content='width=device-width, initial-scale=1'>" + "\n" +
        "</head>" + "\n" +
        "<body>" + "\n";
        
        String footer = "</body>" + "\n" +
        "</html>";
        
        FileWriter fileWriter = new FileWriter("index.html", true);
        fileWriter.write(header);
        Character[] lastLetter = new Character [list.size()];
        lastLetter = list.toArray(lastLetter);

        Map<Character, Integer> m = new TreeMap<Character, Integer>();

        for(int i = 0; i< lastLetter.length; i++){
    
            if(m.containsKey(lastLetter[i])){
    
                m.put(lastLetter[i], m.get(lastLetter[i]) + 1);
            }
            else {
                m.put(lastLetter[i], 1);
            }
        }
        Map sortedMap = demo.sortByValues(m);
        Set set = sortedMap.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
        fileWriter.write("<a href='files/" + me.getKey() + ".txt'>" + me.getKey() + " | " + me.getValue() +"</a>" + "\n" + "<br>" + "\n");
        }
        fileWriter.write(footer);
        fileWriter.close();
    }

    public void  howMany3(){
        Character[] lastLetter = new Character [list.size()];
        lastLetter = list.toArray(lastLetter);

        int position = 0;
        int occurrences = 1;
        int occurrences_final = 0;
        Arrays.sort(lastLetter);
 
        for (int i = 0; i < lastLetter.length - 1; ++i) {
 
            if (lastLetter[i] == lastLetter[i + 1]) {
 
                ++occurrences;
            }
 
            if (occurrences_final < occurrences) {
                occurrences_final = occurrences;
                position = i;
 
            }
            if(lastLetter[i] != lastLetter[i + 1]) {
                occurrences = 1;
            }
 
        }
 
        System.out.println("Letter: " + lastLetter[position] + ", Occurenes: "
                + occurrences_final+ "times");
 
    }
/*
    private Set<String>set=new HashSet<String>();
    public void howMany(){
        int counter=1;
        Character[] lastLetter = new Character [list.size()];
        lastLetter = list.toArray(lastLetter);
        //array sorteerimine
        for(int i=0;i<lastLetter.length;i++){
            for(int j=i+1;j<lastLetter.length;j++){
               if (lastLetter[i]>lastLetter[j]) {
                   char temp = lastLetter[i];
                   lastLetter[i]=lastLetter[j];
                   lastLetter[j]=temp;
               }
            }
        }
        //sagelduse leidmine
        
        for(int i=0;i<lastLetter.length;i++){
            
            for (int j=1;j<lastLetter.length;j++){
                if (lastLetter[i]==lastLetter[j]){
                    counter++;
                }
            }
            String s=lastLetter[i]+":"+ counter;
            set.add(s);
            counter=0;
        }
        //System.out.println(set);

        //sagelduse sorteerimine
        String [] array=new String[set.size()];
        array=set.toArray(array);
        System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            System.out.println(array[i].length());
            for(int j=i+1;j<array.length;j++){
                
                if(array[i].charAt(2)==':'){
                   if (Integer.parseInt(array[i].substring(array[i].length()-2),array[i].length()) > Integer.parseInt(array[i].substring(array[j].length()-2,array[j].length()))) {
                        
                        String temp1 = array[i];
                        array[i]=array[j];
                        array[j]=temp1;
                    }
                
                }else if(array[i].charAt(1)==':'){
                    if (Integer.parseInt(array[i].substring(array[i].length()-1)) > Integer.parseInt(array[i].substring(array[j].length()-1))){
                        String temp1 = array[i];
                        array[i]=array[j];
                        array[j]=temp1;
                    }
                }

            }
            System.out.println(Arrays.toString(array));
        }
    }
  */  
    

}