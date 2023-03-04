package org.campus02.stack;

import org.campus02.stack.exceptions.StackEmptyException;

public class IntStack {

    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) {
        pointer ++; //pointer um 1 erhöhen
        stack[pointer] = value;
    }

    public int pop() throws StackEmptyException {
        // wirft eine StackEmptyException wenn Stack leer ist
        if (pointer == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        int value = stack[pointer];
        stack[pointer--] = 0;
        return value;
    }
}
