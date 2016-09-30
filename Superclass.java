public class Superclass {
    private int aVariable = 4;
    
    public int getAVariable()
    {
        return this.aVariable;
    }
    public void setAVariable(int aVal)
    {
        this.aVariable = aVal;
    }
    
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}
