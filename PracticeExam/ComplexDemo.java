package PracticeExam;

public class ComplexDemo {
    public static void main(String[] args){
        try {
            Complex cp1 = new Complex(2.0,5.0),
                    add = cp1.add(new Complex(5.0,2.0)),
                    subtract = cp1.subtract(new Complex(2.0,1.0)),
                    multiply= cp1.multiply(new Complex(3.0,4.0)),
                    divide = cp1.divide(new Complex(1.0,4.0));
            System.out.println("Sum: "+add.toString());
            System.out.println("Subtraction: "+subtract.toString());
            System.out.println("Multiplication: "+multiply.toString());
            System.out.println("Division: "+divide.toString()); 
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
