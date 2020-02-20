package instruments;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *This class +++Class Name+++
 *
 * @author Colin Holman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Guitar fender = new Guitar("brass", "mahongany", "maple", "Stratacaster");
        Guitar gibson = new Guitar("Nylon", "Oak", "Burgandy", "SG");
        Guitar Dingwall = new Guitar();
        Brands b = Brands.MUSICMAN;
        
        ArrayList Guitars = new ArrayList();
        
        Guitars.add("Fender");
        Guitars.add("Dingwall");
        
       //System.out.println(Guitars);
       //System.out.println(Guitars.contains("Sparkfly"));
       //System.out.println(Guitars.contains("Fender"));
        
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
        System.out.println(matrix.length);
        
        
        
        
        
        
        
    }
}


