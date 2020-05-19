//* Koosta Joogipudelite Kasti jaoks klass. Väljadeks kastityyp, kastihind, 
//kastimass ning pesade arv (mitu pudelit mahub). 
//Loo käsklused kasti ja sinna kuuluvate pudelite ühise massi ja omahinna arvutamiseks. 
//Loo käsklus Joogivaadist Kasti sisse pudelite villimiseks. Koosta automaattestid.


public class Kast {

    private double kasti_hind;
    private Kastityyp kasti_tyyp;
    private double kastimass;
    private static int pesade_arv;

    public Kast(double kastihind, double kastimass, int pesade_arv) {
        this.kasti_hind = kastihind;
        this.kastimass = kastimass;
        this.pesade_arv = pesade_arv;
    }

    public static int getPesadeArv() {
        return pesade_arv;
    }
	double uhineMass;
    public double arvutaUhineMass(Joogipudel pudel1){
        
        uhineMass= (Joogipudel.arvutaMass()*pesade_arv)+kastimass;
        return uhineMass;
    }

    double l6plikHind;
    public double arvutaKastiHind(Joogipudel pudel1){
        l6plikHind=(Joogipudel.arvutaHind()*pesade_arv)+kasti_hind;
        return l6plikHind;
    }

    
}