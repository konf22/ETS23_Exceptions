package org.campus02.stack.exceptions;

public class StackFullException extends Exception {

    public StackFullException(String message) {
        super(message);
    }

    // Wir können eigenen Konstruktur definieren
    // Übernehme die max. größe des stacks und gib sie aus
    public StackFullException(int size) {
        super("error: stack is full - max size is: " + size);
    }
}
