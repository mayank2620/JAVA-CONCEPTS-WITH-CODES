class father{ //BASE CLASS
    void work(){
        System.out.println("Working.....");
    }
}
class son extends father{//DERIVED CLASS
    void play(){
        System.out.println("playing....");
    }

}
public class inheritance{
    public static void main(String[] args) {
        son s=new son();
        s.work();
        s.play();
    }
}