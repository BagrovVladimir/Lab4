
package lab4;

public class MainIntArray {
    
    public static void main(String[] args) {
    
        MassiveOperations moi= new IntArray();
        
        System.out.println("original array: "+moi.showArray());
        
        System.out.println();
        
        System.out.println("check elements: ");
        System.out.println("index 0: "+moi.getElement(0));
        System.out.println("index 5: "+moi.getElement(5));
        System.out.println("count of true: "+moi.countTrue());
        System.out.println("");
       
        System.out.println("set TRUE on indexes 1 and 35. Show array.");
        moi.setElement(1);
        moi.setElement(35);
        System.out.println("array: "+moi.showArray());
        System.out.println("if true=1 and false=0, our array looked: "+moi.toString());
        
        System.out.println();
        
        System.out.println("Invert elemet on index 4; reset element on index 35; set False on index 1. Show array.");
        moi.invert(4);
        moi.sbrosFalse(35);
        moi.setElement(1, false);
        System.out.println("array: "+moi.showArray());
        System.out.println("count of TRUE: "+moi.countTrue());
        System.out.println("if true=1 and false=0, our array looked: "+moi.toString());
    }
    
}
