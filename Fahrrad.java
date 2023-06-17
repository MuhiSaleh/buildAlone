package test3;

public class Fahrrad extends Möbel {

    public String Marke;

    public Fahrrad(int n, String s, String mar) {
        super(n, s);
        this.Marke = mar;
    }

    public String getMarke() {
        return this.Marke;
    }

}
