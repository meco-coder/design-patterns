package code.adapter;

public class MemoryCardAdapter implements OldUSB{

    private final MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void set() {
        memoryCard.set();
    }
}
