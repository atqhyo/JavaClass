public class ObjectiveLifeCycle {
    public static void main(String[] args) {
        String obj1 = new String("Object 1");
        
        obj1 = new String("Object 2");

        System.out.println(obj1);
    }
}
