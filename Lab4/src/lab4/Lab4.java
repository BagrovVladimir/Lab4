
package lab4;

import java.util.Arrays;

public class Lab4 {

    public static void main(String[] args) {
        MassiveOperations mo= new BooleanArray();
        
        System.out.println(mo.getElement(0));
        System.out.println(mo.countTrue());
        System.out.println("");
        
        mo.setElement(1);
        mo.setElement(4);
        System.out.println(mo.countTrue());
        System.out.println(mo.toString());
        System.out.println("");
        
        mo.invert(3);
        mo.sbrosFalse(4);
        mo.setElement(5, true);
        System.out.println(mo.countTrue());
        System.out.println(mo.toString());
        System.out.println("");
        
        /*MassiveOperations moi= new IntArray();
        
        System.out.println(moi.getElement(0));
        System.out.println(moi.countTrue());
        System.out.println("");
        
        moi.setElement(1);
        moi.setElement(4);
        System.out.println(moi.toString());
        moi.invert(3);
        moi.sbrosFalse(4);
        moi.setElement(5, true);
        System.out.println(moi.countTrue());
        System.out.println(moi.toString());*/
       

        
    }
    
}
