class CloudStorage implements ICloudService {
    private String nazev;
    private double cenaZaGB;
    private int pocetSpusteni;

    public CloudStorage(String nazev, double cenaZaGB) {
        this.nazev = nazev;
        this.cenaZaGB = cenaZaGB;
        this.pocetSpusteni = 0;
    }

    @Override
    public void spustSluzbu() {
        pocetSpusteni++;
        System.out.println("Uložiště " + nazev + " bylo spuštěno. Počet spuštění: " + pocetSpusteni);
    }

    @Override
    public void zastavSluzbu() {
        System.out.println("Uložiště " + nazev + " bylo zastaveno.");
    }

    @Override
    public double vypocitejNaklady(int pocetGB) {
        double cena = pocetGB * cenaZaGB;
        if (pocetSpusteni > 5) {
            cena *= 2; // zdvojnásobení ceny
        } else if (pocetSpusteni < 5) {
            cena -= 10; // sleva 10 Kč
        }
        return cena;
    }

    @Override
    public String toString() {
        return "CloudStorage{" +
                "nazev='" + nazev + '\'' +
                ", cenaZaGB=" + cenaZaGB +
                ", pocetSpusteni=" + pocetSpusteni +
                '}';
    }
}