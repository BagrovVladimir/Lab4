
package lab4;

import java.util.Arrays;

public class BooleanArray implements MassiveOperations{
    private final boolean [] b= new boolean[Size];

    @Override
    public boolean getElement(int index) {
        if (b==null || b.length==0) {throw new NullPointerException("Array is emty");}
        if (index<0 || index>=b.length) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
      
        return b[index];
    }

    @Override
    public void setElement(int index) {
         if (b==null || b.length==0) {throw new NullPointerException("Array is emty");}
         if (index<0 || index>=b.length) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
         
         b[index]=true;
    }

    @Override
    public void setElement(int index, boolean value) {
        if (b==null || b.length==0) {throw new NullPointerException("Array is emty");}
        if (index<0 || index>=b.length) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
        
        b[index]=value;
    }

    @Override
    public void sbrosFalse(int index) {
        if (b==null || b.length==0) {throw new NullPointerException("Array is emty");}
        if (index<0 || index>=b.length) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
        
        b[index]=false;
    }

    @Override
    public void invert(int index) {
        if (b==null || b.length==0) {throw new NullPointerException("Array is emty");}
        if (index<0 || index>=b.length) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
        
        b[index]=!b[index];
    }

    @Override
    public int countTrue() {
       if (b==null || b.length==0) {throw new NullPointerException("Array is emty");}
       
       int count =0;
       for (int i = 0; i < b.length; i++) {
            boolean value = b[i];
            if (value)
                count++;
       }
        return count;   
    }

    @Override
    public String toString() {
        if (b==null || b.length==0) {throw new NullPointerException("Array is emty");}
        String s;
        
        String [] rez= new String[Size];
        for (int i = 0; i < b.length; i++) {
            boolean value = b[i];
            if(value){rez[i]="1";}
            else {rez[i]="0";}  
        }
        s= Arrays.toString(rez);
        return s;  
    }
    
    
}   
    

