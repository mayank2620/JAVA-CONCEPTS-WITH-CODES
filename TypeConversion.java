public class TypeConversion{
    public static void main(String[] args){
       //IMPLICIT:- Conversion by Compiler
        int valueint=10;
        double valuedouble= valueint;
        System.out.println(valueint);
        System.out.println(valuedouble);
        
        //EXPLICIT:- Conversion by Programmer...
        int valuedouble1=3;
        double valueint1=(double) valueint;
        System.out.println(valuedouble1);
        System.out.println(valueint1);
    }
}
