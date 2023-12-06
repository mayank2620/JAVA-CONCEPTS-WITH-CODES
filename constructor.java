public class constructor {
    int mil;
    constructor(){
        mil=80;//making our own constructor...
    }
    constructor(int m){
        mil=m;//other way to make your own constructor.....
    }
    public static void main(String[] args) {
        constructor obj= new constructor();
        System.out.println(obj.mil);//because mil has not asign any value yet constructor asign certain value to object automatically...
        constructor ob= new constructor(50);
        System.out.println(ob.mil);
    }
    
}
