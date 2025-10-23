import java.util.ArrayList;
import java.util.List;

class CloudManager {
    private List<ICloudService> sluzby;

    public CloudManager() {
        sluzby = new ArrayList<>();
    }

    public void pridejSluzbu(ICloudService sluzba) {
        sluzby.add(sluzba);
    }

    public void spustVsechnySluzby() {
        for (ICloudService s : sluzby) {
            s.spustSluzbu();
        }
    }

    public void zastavVsechnySluzby() {
        for (ICloudService s : sluzby) {
            s.zastavSluzbu();
        }
    }

    public void vypisNaklady(int jednotky) {
        for (ICloudService s : sluzby) {
            System.out.println("Náklady: " + s.vypocitejNaklady(jednotky));
        }
    }

    public void vypisInformace() {
        for (ICloudService s : sluzby) {
            System.out.println(s.toString());
        }
    }
}