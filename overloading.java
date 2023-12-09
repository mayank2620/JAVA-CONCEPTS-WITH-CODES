package JavaCode;
public class overloading {
    static boolean add(double x, double y){
        return x+y;
    }
    static int add(int x, int y ){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(add(2,3));//Give overloading
        System.out.println(add(13.5,12.5));//Give overloading
    }
    
}
