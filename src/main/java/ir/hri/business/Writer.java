package ir.hri.business;

public class Writer implements IWriter {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void writer(String s) {
        System.out.println(s);
    }

    public void myCustomInit() {
        System.out.println("Init " + getMessage());
    }

    public void myCustomDestroy() {
        System.out.println("Destroy " + getMessage());
    }
}
