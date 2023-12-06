public class branching {
    public static void main(String[] args){
        //1. IF
        int a=10;
        if(a==10){
            System.out.println("ten");
        }

        //2. IF-ELSE
        if(a==10){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        //3. ELSE IF
        int b=10;
        if(a==10){
            System.out.println("TRUE");
        }else if(a==b){
            System.out.println("TRUE ALSO");
        }else{
            System.out.println("FALSE");
        }
        
        //4. SWITCH
        int grade='A';
        switch(grade){
            case 'A':
            System.out.println("EXCELLENT");
            break;

            case 'B':
            System.out.println(" GOOD");
            break;

            case 'C':
            System.out.println("AVG");
            break;

            case 'D':
            System.out.println("FAIL");
            break;

            default:
            System.out.println("INVALID");
            break;
        }

        //NESTED BRANCHING IS A CONDITION IN CONDITION FOREXAMPLE:
        int num=12;
        int num1=13;
        if(num%2==0){
            if(num>num1){
                System.out.println("NUM IS GREATER");
            }
            else{
                System.out.println("NUM1 IS GREATER");
            }
        }
        else{
            System.out.println("NOTHING");
        }
    }
    
}
