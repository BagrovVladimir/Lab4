
package lab4;

import java.util.Arrays;

public class IntArray implements MassiveOperations{
    private int[] intArray= new int[size/32];

    @Override
    public boolean getElement(int index) {
        if (intArray==null || intArray.length==0) {throw new NullPointerException("Array is emty");}
        if (index<0 || index>=size) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
        
        int arrayIndex=index/32;
        int bitIndex=index%32;
        
        int element=intArray[arrayIndex];
        int mask=1<<bitIndex;
        
        return (element & mask) == mask; 
    }

    @Override
    public void setElement(int index) {
        if (intArray==null || intArray.length==0) {throw new NullPointerException("Array is emty");}
        if (index<0 || index>=size) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
        
        int arrayIndex=index/32;
        int bitIndex=index%32;
        
        int element=intArray[arrayIndex];
        int mask=1<<bitIndex;
        
        intArray[arrayIndex] = element | mask;
    }

    @Override
    public void setElement(int index, boolean value) {
        if (intArray==null || intArray.length==0) {throw new NullPointerException("Array is emty");}
        if (index<0 || index>=size) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
        
        if(value) {setElement(index);}
        else {sbrosFalse(index);}
    }

    @Override
    public void sbrosFalse(int index) {
       if (intArray==null || intArray.length==0) {throw new NullPointerException("Array is emty");}
        if (index<0 || index>=size) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
        
        int arrayIndex=index/32;
        int bitIndex=index%32;
        
        int element=intArray[arrayIndex];
        int mask=1<<bitIndex;
        
        intArray[arrayIndex]=element & (~mask);
    }

    @Override
    public void invert(int index) {
        if (intArray==null || intArray.length==0) {throw new NullPointerException("Array is emty");}
        if (index<0 || index>=size) {throw new ArrayIndexOutOfBoundsException("Index is incorrect");}
        
        int arrayIndex=index/32;
        int bitIndex=index%32;
        
        int element=intArray[arrayIndex];
        int mask=1<<bitIndex;
        
        intArray[arrayIndex]=element ^ mask;
        
    }

    @Override
    public int countTrue() {
      if (intArray==null || intArray.length==0) {throw new NullPointerException("Array is emty");}
      
      int count=0;  
      for (int i = 0; i < size; i++) {
          if(getElement(i)) count++;   
        }
      return count;
    }

    @Override
    public String toString() {
        if (intArray==null || intArray.length==0) {throw new NullPointerException("Array is emty");}
        
        String s=null;
        String [] rez= new String[size];
        for (int i = 0; i <size; i++) {
               if(getElement(i)) {rez[i]="1";}
               else {rez[i]="0";}
        }
        s=Arrays.toString(rez);
        return s;
    }     
}
