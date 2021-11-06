
package lab4;

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

        
    }
    
}
