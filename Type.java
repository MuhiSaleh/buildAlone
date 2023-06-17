package test3;

public enum Type {
    AUTO4X4("AUTO4X4"),
    Vorne("Vorne"),
    Hinter("hinten");

    private String a;

    Type(String s) {
        this.a = s;
    }

    public String str() {
        return this.a.toString();
    }
}
