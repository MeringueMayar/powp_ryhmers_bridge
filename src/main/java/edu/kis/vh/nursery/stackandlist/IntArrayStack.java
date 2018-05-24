package edu.kis.vh.nursery.stackandlist;

public class IntArrayStack implements IntDataStructure {
    private final int CAPACITY = 12;
    private int[] NUMBERS = new int[CAPACITY];    
    private int total = EMPTY_STACK_VALUE;

    @Override
    public void countIn(final int in) {
        if (!isFull()) {
            NUMBERS[++total] = in;
        }
    }
    
    @Override
    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == CAPACITY;
    }

    @Override
    public int peekaboo() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        return NUMBERS[total];
    }

    @Override
    public int countOut() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        return NUMBERS[total--];
    }
    
    @Override
    public int getSize() {
        return total;
    }

}
//[Netbeans] ctrl+left click does the same as navigate -> go to devlaration (ctrl+b)
//[Netbeans] no quick type hierarchy in netbeans