package org.campus02.stack.exceptions;

/**
 * benutzerdefinierte Exception wenn der Stack leer ist
 * leitet von der Basisklasse "Exception" ab
 */
public class StackEmptyException extends Exception {

    // Überladung der Konstruktoren
    public StackEmptyException(String message) {
        super(message);
    }
}
