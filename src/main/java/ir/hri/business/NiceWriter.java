package ir.hri.business;

public class NiceWriter implements IWriter {
    public void writer(String s) {
        System.out.println("The string is, " + s);
    }

    public void myCustomInit() {
        System.out.println("Inti NiceWriter");
    }

    public void myCustomDestroy() {
        System.out.println("Destroy NiceWriter");
    }
}
