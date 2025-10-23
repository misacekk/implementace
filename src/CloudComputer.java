class CloudComputer implements ICloudService {
    private String nazev;
    private double cenaZaHodinu;

    public CloudComputer(String nazev, double cenaZaHodinu) {
        this.nazev = nazev;
        this.cenaZaHodinu = cenaZaHodinu;
    }

    @Override
    public void spustSluzbu() {
        System.out.println("Výpočetní služba " + nazev + " byla spuštěna.");
    }

    @Override
    public void zastavSluzbu() {
        System.out.println("Výpočetní služba " + nazev + " byla zastavena.");
    }

    @Override
    public double vypocitejNaklady(int hodiny) {
        return hodiny * cenaZaHodinu;
    }

    @Override
    public String toString() {
        return "CloudCompute{" +
                "nazev='" + nazev + '\'' +
                ", cenaZaHodinu=" + cenaZaHodinu +
                '}';
    }
}