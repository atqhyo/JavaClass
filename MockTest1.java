import java.util.*;

public class MockTest1{

    public static void main(String[] args) {
        boolean baloon = false;
        do {
            if (!baloon){
                baloon = true;
                System.out.println("inflate-");
            }
        } while(baloon);
        System.out.println("done");
    }
}
