public class Subclass extends Superclass {

    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");

        System.out.println(this.getAVariable());
        this.setAVariable(5);
        System.out.println(this.getAVariable());
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod(); 
        

    }
}