
package lab4;

public interface MassiveOperations {
    int Size=1024;
    
    boolean getElement(int index);
    void setElement(int index);
    void setElement(int index, boolean value);
    void sbrosFalse(int index);
    void invert(int index);
    int countTrue();
    String toString();
    
    
}
