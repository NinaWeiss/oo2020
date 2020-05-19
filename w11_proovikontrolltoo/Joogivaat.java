//Koosta klass Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites. 
//Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub). 
//Koosta käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse.
//Koosta töö kontrolliks automaattestid.
public class Joogivaat {

    private static double ruumala;
    private double joogikogus;

    public Joogivaat(double ruumala, double joogikogus) {
        this.ruumala = ruumala;
        this.joogikogus = joogikogus;

    }

    public static double getRuumala() {
        return ruumala;
    }
    double uusJoogikogus;
    public double taidaPudeli(Joogipudel pudel1){
        if(joogikogus!=0 && joogikogus>Joogipudel.getMaht()){
            uusJoogikogus=joogikogus-Joogipudel.getMaht();
            System.out.println("Joogipudel sai täidetud.");
        }
        else{
            System.out.println("Joogivaadis ei ole piisavalt jooki et pudeli saaks täita.Joogipudelisse sai ainult "+joogikogus+" liitrid lisada.");
        }
        return uusJoogikogus;
    }

    int pudeliLoendur=0;
    double uuedliitrid;
    public int tuhjendaVaat(Joogipudel pudel1){
        double liitrid=ruumala*1000;
        while(liitrid!=0){
            liitrid=liitrid-Joogipudel.getMaht();
            pudeliLoendur+=1;
            
        }
        return pudeliLoendur;
    }

    int kastiLoendur=0;
    double uuedliitrid2;
    public double vaadistPudeslisse(Joogipudel pudel1,Kast kast){
        double liitrid=ruumala*1000;
        while(liitrid!=0){
            liitrid=liitrid-Joogipudel.getMaht();
            kastiLoendur+=1;
            
        }
        double kogus= kastiLoendur/Kast.getPesadeArv();
        return kogus;
    }
}