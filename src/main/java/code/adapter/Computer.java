package code.adapter;

public class Computer {

    public void connect(OldUSB oldUSB) {
        oldUSB.set();
        System.out.println("connected to computer");
    }
}
