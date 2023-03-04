package org.campus02;

public class ExceptionSyntax {

    public static void main(String[] args) {

        try {
            // TRY BLOCK:
            // hier ist kritischer Programmcode
            // Exceptions könnten auftretten
            doSomething();
        } catch (Exception e) {
            // CATCH BLOCK:
            // Fehlerbehandlung
            // auf Exception reagieren

        } finally {
            // wird auf jeden Fall ausgeführt

        }

    }

    public static void doSomething() throws Exception {
        // programmcode der exception werfen könnte
        doSomethingElse();
    }

    public static void doSomethingElse() throws Exception {
        // Code
        // wirft exception

        // mittels throw kann exception geworfen
        throw new Exception();
    }
}
