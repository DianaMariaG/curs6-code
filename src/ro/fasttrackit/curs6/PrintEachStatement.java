package ro.fasttrackit.curs6;
import java.util.*;
/**
 * Scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct).
 * Printati fiecare propozitie pe o linie noua
 */

public class PrintEachStatement {
    public static void main(String[] args) {
        String phrase = "Life is short.Time is fast.No replay.No rewind.";
        printStatementsSeparately(phrase);
    }

    private static void printStatementsSeparately(String phrase){

        String[] statements = phrase.split("\\.");
        for(String statement : statements){
            System.out.println(statement);
        }
    }
}

