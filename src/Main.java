import java.util.ArrayList;
import java.util.List;

public class Main {public static int function1(List Mylist){

    for(int i = 0; i < 10; i++) {
        Mylist.add(Math.random());
        Double element0 = (Double) Mylist.get(i);
    }
    for(int i = 0; i < 10; i++) {
        System.out.println(i + 1 + ") " + Mylist.get(i));
    }
    return 0;
}
    public static int function2(List Mylist){
        for(int i = 9; i > -1; i--) {
            System.out.println(i+1 + ") " + Mylist.get(i));
        }
        return 0;
    }
    public static void main(String[] args) {
        List Mylist = new ArrayList<>();
        System.out.println("list:");
        function1(Mylist);
        System.out.println("\nПеревернутый list:");
        function2(Mylist);
    }
}