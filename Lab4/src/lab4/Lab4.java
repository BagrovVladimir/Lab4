
package lab4;

import java.util.Arrays;

public class Lab4 {

    public static void main(String[] args) {
        MassiveOperations mo= new BooleanArray();
      
        System.out.println("original array: "+mo.showArray());
        
        System.out.println();
        
        System.out.println("check elements: ");System.out.println("array: "+mo.showArray());
        System.out.println("index 0: "+mo.getElement(0));
        System.out.println("index 5: "+mo.getElement(5));
        
        System.out.println("count of TRUE: "+mo.countTrue());
        System.out.println("");
        
        System.out.println("set TRUE on indexes 1 and 4. Show array.");
        mo.setElement(1);
        mo.setElement(4);
        System.out.println("array: "+mo.showArray());
        System.out.println("count of TRUE: "+mo.countTrue());
        System.out.println("if true=1 and false=0, our array looked: "+mo.toString());
        System.out.println("");
        
        System.out.println("Invert elemet on index 3; reset element on index 4; set False on index 1. Show array.");
        mo.invert(3);
        mo.sbrosFalse(4);
        mo.setElement(1, false);
        System.out.println("array: "+mo.showArray());
        System.out.println("count of TRUE: "+mo.countTrue());
        System.out.println("if true=1 and false=0, our array looked: "+mo.toString());
        System.out.println("");
        
        
       

        
    }
    
}
