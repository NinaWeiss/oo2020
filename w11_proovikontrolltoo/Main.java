/*Joogid

* Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal. 
Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. 
Samuti sees olev Jook, mis võib ka puududa. Koosta Joogipudeli jaoks käsklus, 
mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), samuti käsklus 
sellise komplekti omahinna leidmiseks.
* Koosta klass Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites.
 Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub). 
 Koosta käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse. 
* Koosta Joogipudelite Kasti jaoks klass. Väljadeks kastityyp, kastihind, 
kastimass ning pesade arv (mitu pudelit mahub). Loo käsklused kasti ja sinna 
kuuluvate pudelite ühise massi ja omahinna arvutamiseks. Loo käsklus Joogivaadist 
Kasti sisse pudelite villimiseks. Koosta automaattestid.

*/

public class Main {
    public static void main(String[] args) {
        Jook vesi=new Jook("vesi",1000.0,0.20);
        Joogipudel pudel1=new Joogipudel(2.0,0.08,PudeliTyyp.PLASTIK,vesi);
        System.out.println("Pudelimass on " +pudel1.arvutaMass()+" grammi. Ja joogi hind on "+pudel1.arvutaHind()+" eurot.");
        Joogivaat vaat1=new Joogivaat(1.0,4.0);
        System.out.println("Joogivaadis on veel "+ vaat1.taidaPudeli(pudel1)+" liitrid."); 
        System.out.println(vaat1.tuhjendaVaat(pudel1)+" pudelid said täidetud.");
        Kast kast=new Kast(6.95,1500.0,6);
        System.out.println("Kastimass koos pudelitega on "+kast.arvutaUhineMass(pudel1)+" grammi. Kastihind koos pudelitega on "+kast.arvutaKastiHind(pudel1)+" eurot.");
        System.out.println(vaat1.vaadistPudeslisse(pudel1,kast)+" kastid said täidetud");
    }

}