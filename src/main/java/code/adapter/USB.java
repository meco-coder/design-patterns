package code.adapter;

public class USB implements OldUSB{
    @Override
    public void set() {
        System.out.println("USB connected");
    }
}
