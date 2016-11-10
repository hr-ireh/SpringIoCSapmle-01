package ir.hri.business;

public class NiceWiter implements IWriter {
    public void writer(String s) {
        System.out.println("The string is, " + s);
    }

    public void myCustomInit() {
        System.out.println("Inti NiceWiter");
    }

    public void myCustomDestroy() {
        System.out.println("Destroy NiceWiter");
    }
}
