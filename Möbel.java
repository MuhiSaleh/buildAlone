package test3;

abstract class Möbel {
    private String Name;
    private int Große;

    public Möbel(int n, String s) {
        this.Große = n;
        this.Name = s;
    }

    public int Getgroße() {
        return this.Große;
    }

    public String GetName() {
        return this.Name;
    }

}
