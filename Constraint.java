public class Constraint {
    public static void main(String[] args) {
        final int a=10;
        a=a+10;/*this line give an error because final keyword freeze the value of a */
        System.out.println(a);
    }
    
}
