package Day_three;

public class this_class_01 {

    class A {
        // Constructor of class A
        public A() {
         // super();
        	this(0);
            System.out.println("Happy in A");
        }

        // Another Constructor of class A with parameter
        public A(int n) {
            super();
       //   this(0);
            System.out.println("Happy in A int n");
        }
    }

    class B extends A {
        // Constructor of class B
        public B() {
        //  this(0); // Calls the parameterized constructor of B with default value
            System.out.println("Happy in B");
        }

        // Another Constructor of class B with parameter
        public B(int n) {
        	this();
       //super(n); // Call the superclass constructor with parameter
            System.out.println("Happy in B int n");
        }
    }

    public static void main(String[] args) {
        this_class_01 outerObj = new this_class_01();
        B obj = outerObj.new B(5);	 // Creates an instance of B without parameter
    }
}
