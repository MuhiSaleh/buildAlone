package test3;

public class MAin {
    public static void main(String[] args) {
        TransportContainer<Möbel> box = new TransportContainer<>();

        Auto a1 = new Auto(2400, "BMW");
        a1.setFarbe("BLAU");
        a1.setType(Type.Vorne);

        Fahrrad f1 = new Fahrrad(12, "2Cykle", "XIAMOMI");

        box.add(a1);
        box.add(f1);
        box.printList();

    }
}
