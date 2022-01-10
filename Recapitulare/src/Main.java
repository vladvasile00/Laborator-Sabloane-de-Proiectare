import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box cutieMare = new Box("Cutie mare");

        ArrayList<Element> elements = new ArrayList<Element>();
        Box cutieMica = new Box("Cutie mica");

        Phone androidPhone = new Phone("Samsung S10+", 500, new Android());
        Phone iOSPhone = new Phone("iPhone 12", 1500, new iOS());
        Phone wpPhone = new Phone("Nokia Lum", 200, new WindowsPhone());
        Phone oldPhone = new Phone("Sony Xperia", 50);

        Headphones castiClasice = new Headphones("Casti EarBuds", 20, false);
        Charger newCharger = new Charger("SuperFast", 30, 40);

        cutieMica.add(androidPhone);
        cutieMica.add(iOSPhone);
        cutieMica.add(wpPhone);
        cutieMica.add(castiClasice);
        cutieMica.add(newCharger);
        cutieMica.add(oldPhone);

        cutieMare.add(cutieMica);

        cutieMare.print();

        CalculatePricesVisitor visitor = new CalculatePricesVisitor();
        cutieMare.accept(visitor);

        visitor.printPrices();
    }
}
