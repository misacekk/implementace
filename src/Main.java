public class Main {
    public static void main(String[] args) {

        CloudStorage storage1 = new CloudStorage("Storage1", 5.0);
        CloudStorage storage2 = new CloudStorage("Storage2", 10.0);

        CloudComputer computer1 = new CloudComputer("Computer1", 20.0);
        CloudComputer computer2 = new CloudComputer("Computer2", 15.0);

        CloudManager manager = new CloudManager();

        manager.pridejSluzbu(storage1);
        manager.pridejSluzbu(storage2);
        manager.pridejSluzbu(computer1);
        manager.pridejSluzbu(computer2);

        manager.spustVsechnySluzby();

        System.out.println("--- Výpis nákladů pro 10 jednotek ---");
        manager.vypisNaklady(10);

        manager.zastavVsechnySluzby();

        System.out.println("--- Informace o všech službách ---");
        manager.vypisInformace();
    }
}