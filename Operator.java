public class Operator {
    public static void main(String[] args) {
        //1.ARITHEMATIC
        //A. BINARY OPERATOR
        int num1=4;
        int num2=2;
        System.out.println(num1+num2);//6
        System.out.println(num1 -num2);//2
        System.out.println(num1 * num2);//8
        System.out.println(num1/num2);//2
        System.out.println(num1%num2);//0

        //B. UNARY OPERATOR
        System.out.println(num1++);//4(5)
        System.out.println(++num1);//6
        System.out.println(num1--);//6(5)
        System.out.println(--num1);//4

        //2.RELATIONAL OPERATOR
        System.out.println(num1 > num2);//True
        System.out.println(num1 < num2);//False
        System.out.println(num1 >= num2);//True
        System.out.println(num1 <= num2);//False
        System.out.println(num1 == num2);//False
        System.out.println(num1 != num2);//True

        //3. ASIGNMENT OPERATOR
        int a=10;//10
        a+=10;//20
        a-=10;//10
        a*=10;//100
        a/=10;//10
        
        //4.LOGICAL OPERATOR
        System.out.println(true && false);//false
        System.out.println(true || false);//true
        System.out.println(!(true));//false

        //5. TERNARY OPERATOR
        System.out.println((num1>num2)? num1 : num2);
        System.out.println((num1<num2)? num1 :num2);

        //6. SHIFT OPERATOR
        System.out.println(num1<<3);//16
        System.out.println(num1>>2);//4
    }
    
}
