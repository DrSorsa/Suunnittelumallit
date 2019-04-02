package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus talkkari = new Talkkari();
        
        opettaja.aterioi();
        System.out.println("");
        oppilas.aterioi();
        System.out.println("");
        talkkari.aterioi();
    }
}
