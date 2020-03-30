/**
 * FinnishCitizen
 */
public class FinnishCitizen implements PersonalCodeBehaviour {
    public String code= "230181-237J";
    public String month="";
    public String birthYear="";

    public String getGender(){
        return null;
    }
    public int getAge(){
        int fourthNumber= Integer.parseInt(code.substring(3,4));
        int fifthNumber= Integer.parseInt(code.substring(4,5));
        int year1=(fourthNumber*10)+fifthNumber;
        int age= 120-year1;
        return age;
    }
    public String getYear(){
        int fourthNumber= Integer.parseInt(code.substring(3,4));
        int fifthNumber= Integer.parseInt(code.substring(4,5));
        String s1=String.valueOf(fourthNumber);
        String s2=String.valueOf(fifthNumber);
        String year=s1+s2;
        char century= code.charAt(8);

        if(century == 'A'){
            birthYear="20"+year;
        }else if(century == '-'){
            birthYear="19"+year;
        }else if(century == '+'){
            birthYear="18"+year;
        }
        
       return birthYear;
    }
     public String getDay(){
         int firstNumber= Integer.parseInt(code.substring(0,1));
        int secondNumber= Integer.parseInt(code.substring(1,2));
        String s1=String.valueOf(firstNumber);
        String s2=String.valueOf(secondNumber);
        String day=s1+s2;
        return day;
     }
    public String getMonth(){
        int fifthnumber= Integer.parseInt(code.substring(2,3));
        int fourthNumber= Integer.parseInt(code.substring(3,4));
        
            if(fifthnumber==0 && fourthNumber==1){
                month="January";
            }if(fifthnumber==0 && fourthNumber==2){
                month="February";
            }if(fifthnumber==0 && fourthNumber==3){
                month="March";
            }if(fifthnumber==0 && fourthNumber==4){
                month="April";
            }if(fifthnumber==0 && fourthNumber==5){
                month="May";
            }if(fifthnumber==0 && fourthNumber==6){
                month="June";
            }if(fifthnumber==0 && fourthNumber==7){
                month="July";
            }if(fifthnumber==0 && fourthNumber==8){
                month="August";
            }if(fifthnumber==0 && fourthNumber==9){
                month="September";
            }if(fifthnumber==1 && fourthNumber==0){
                month="October";
            }if(fifthnumber==1 && fourthNumber==1){
                month="November";
            }if(fifthnumber==1 && fourthNumber==2){
                month="December";
            }

        return month;
    }
    
}