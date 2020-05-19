
public class Joogipudel {

    private static double maht;
    private static double mass;
    private static double taara_maksumus;
    private PudeliTyyp pudeli_tyyp;
    private static Jook jook;

    public Joogipudel(double maht, double taara_maksumus, PudeliTyyp pudeliTyyp, Jook jook) {
        this.maht = maht;
        this.taara_maksumus = taara_maksumus;
        this.pudeli_tyyp = pudeliTyyp;
        this.jook = jook;
    }

    public static double arvutaMass() {
        if (jook != null) {
            mass = jook.getErikaal() * maht;

        } else {
            System.out.println("Joogipudel on tühi");
        }
        return mass;

    }

    static double hind = 0;

    public static double arvutaHind() {
        if (jook != null) {
            mass = maht * jook.getErikaal();
            hind = (mass * jook.getHind() / 1000)+taara_maksumus;
        } else {
            System.out.println("Joogipudel on tühi");
            hind = taara_maksumus;
        }
        return hind;

    }

    public static double getMaht() {
        return maht;
	}
}