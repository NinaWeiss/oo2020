public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");

        byte minByte = Byte.MIN_VALUE;
        byte maxByte =Byte.MAX_VALUE;
        // byte,short,int,long,float,double,char,boolean
        boolean flag = true;

        System.out.println(1+1); // * / - %
        //i++ ist gelich i=i+1
        int number=5;
        System.out.println(number++);
        System.out.println(++number);

        if(number<10 && number>0){
            System.out.println("Jah");
        }
        for(int i=0;i<10;i++){

        }
        int counter=0;
        while(flag){
            if(!flag){

            }
            counter++;
            if(counter== 10){
                System.out.println("I'm out");
                flag=false;
            }
        }

        int counterTwo=0;
        do{
            counterTwo++;
        } while(counterTwo==10);

        int[]numberArray=new int[]{1,2,3,4,5};

        for(int element : numberArray){
            System.out.println(element);
        }

        for(int i=0;i< numberArray.length;i++){
            System.out.println(numberArray[i]);
        }

        String myName="Nina";
        System.out.println(myName);

        HelloWorld x = new HelloWorld();
        printSomething(10);

        String name=name();
        System.out.println(name());
    }
    static String name(){
        return "Nina";
    }


    static void printSomething(int number){
        for(int i=1; i<10; i++){
            number +=i;
        }
        System.out.println(number);
    }

}