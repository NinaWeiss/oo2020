/**
 * EstonianCitizen
 */
public class EstonianCitizen implements PersonalCodeBehaviour {

    public String code= "49511047020";
    public String month="";
    public String birthYear="";
    public String getGender(){
        int firstNumber= Integer.parseInt(code.substring(0,1));
        String gender;

        if (firstNumber % 2 == 0){
            gender="female";
        }else{
            gender="male";
        }
    
        return gender;
    }
   
    public int getAge(){
        int secondNumber= Integer.parseInt(code.substring(1,2));
        //System.out.println(secondNumber);
        int thirdNumber= Integer.parseInt(code.substring(2,3));
        int year1=(secondNumber*10)+thirdNumber;
        //System.out.println(year1);
        int age= 120-year1;
        return age;
    }
    public String getDay(){
        int sixthNumber= Integer.parseInt(code.substring(5,6));
        int seventhNumber= Integer.parseInt(code.substring(6,7));
        String s1=String.valueOf(sixthNumber);
        String s2=String.valueOf(seventhNumber);
        String day=s1+s2;
        return day;
    }
    public String getMonth(){
        int fourthNumber= Integer.parseInt(code.substring(3,4));
        int fifthNumber= Integer.parseInt(code.substring(4,5));
        if(fourthNumber==0 && fifthNumber==1){
            month="January";
        }if(fourthNumber==0 && fifthNumber==2){
            month="February";
        }if(fourthNumber==0 && fifthNumber==3){
            month="March";
        }if(fourthNumber==0 && fifthNumber==4){
            month="April";
        }if(fourthNumber==0 && fifthNumber==5){
            month="May";
        }if(fourthNumber==0 && fifthNumber==6){
            month="June";
        }if(fourthNumber==0 && fifthNumber==7){
            month="July";
        }if(fourthNumber==0 && fifthNumber==8){
            month="August";
        }if(fourthNumber==0 && fifthNumber==9){
            month="September";
        }if(fourthNumber==1 && fifthNumber==0){
            month="October";
        }if(fourthNumber==1 && fifthNumber==1){
            month="November";
        }if(fourthNumber==1 && fifthNumber==2){
            month="December";
        }

        return month;
    }
    public String getYear(){
        int firstNumber= Integer.parseInt(code.substring(0,1));
        int secondNumber= Integer.parseInt(code.substring(1,2));
        int thirdNumber= Integer.parseInt(code.substring(2,3));
        String s1=String.valueOf(secondNumber);
        String s2=String.valueOf(thirdNumber);
        String year=s1+s2;
        
        if(firstNumber == 1||firstNumber== 2){
            
            birthYear="18"+year;
        }else if(firstNumber == 2||firstNumber== 4){
            
            birthYear="19"+year;
        }else if(firstNumber == 5|firstNumber== 6){
            
            birthYear="20"+year;
        }
       return birthYear;
    }
    
}