public class Test{

    Test() {}

    public double calculateBMI(final double hight, final double weight) {

        double bmi;
        double tmp;
        tmp = hight*hight;
        bmi=weight/tmp;
        if (bmi<=18.5){
            System.out.println("Te olete alakaaluline");
        }else if (bmi>=18.5 && bmi<=24.9){ 
            System.out.println(" Teil on normaalne kaal");
        }else if(bmi>=25.0 && bmi<=29.9){
            System.out.println("Te olete ülekaaluline"); 
        }else if(bmi>=30.0 && bmi<=34.9){
            System.out.println("Teil on adipositas");
        }
        return bmi;
    }

    public static void main(final String[] args) {
        Test test = new Test();
        System.out.println("BMI on: "+ test.calculateBMI(1.67,39.6));
    }
}
