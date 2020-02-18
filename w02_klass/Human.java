public class Human{
    
    private String name;
    private String gender;
    private int age;
    private String haircolor;
    private String eyecolor;
    private double height;
    private String skincolor;

    public Human(String name,String gender,int age,String haircolor,String eyecolor,double height,String skincolor){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.haircolor=haircolor;
        this.eyecolor=eyecolor;
        this.height=height;
        this.skincolor=skincolor;
    }
  /*  public String getGeneration(){

    }*/

    @Override
    public String toString(){

        return "My name is "+name+" and I'm a "+age+" years old "+skincolor+" "+gender+". My haircolor is "+haircolor+" and I have "+eyecolor+" eyes. I'm "+height+"m tall.";

    }
}
