package test3;

public class Auto extends Möbel {

    private String Farbe;
    private Type type;

    public Auto(int n, String s) {
        super(n, s);
    }

    public String getFarbe() {
        return this.Farbe;
    }

    public void setFarbe(String Farbe) {
        this.Farbe = Farbe;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
