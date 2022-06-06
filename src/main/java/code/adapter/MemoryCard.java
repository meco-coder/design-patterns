package code.adapter;

public class MemoryCard implements NewUSB{
    @Override
    public void set() {
        System.out.println("Memory card connected");
    }
}
