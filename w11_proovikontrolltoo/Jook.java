//* Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal. 
//Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. 
//Samuti sees olev Jook, mis võib ka puududa. Koosta Joogipudeli jaoks käsklus, 
//mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), 
//samuti käsklus sellise komplekti omahinna leidmiseks. Koosta tööks automaattestid.

/**
 * Jook
 */
public class Jook {

    private String nimetus;
    private double erikaal;
    private double liitri_hind;

    public Jook(String nimetus,double erikaal,double liitri_hind){
        this.nimetus=nimetus;
        this.erikaal=erikaal;
        this.liitri_hind=liitri_hind;
    }

    public double getErikaal() {
        return erikaal;
    }

    public double getHind(){
        return liitri_hind;
    }
}