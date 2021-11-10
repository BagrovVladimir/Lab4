
package lab4;

public interface MassiveOperations {
    int size=1024;
    
    String showArray();
    boolean getElement(int index);
    void setElement(int index);
    void setElement(int index, boolean value);
    void sbrosFalse(int index);
    void invert(int index);
    int countTrue();
    String toString();
    
    
}
