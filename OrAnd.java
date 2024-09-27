public class OrAnd {
    public static void main(String[] args) {
        int age = 16;
        boolean hasParentalConsent = true;

        if(age >= 18 || hasParentalConsent && age > 25){
            System.out.println("Khalif is allowed");
        }else{
            System.out.println("Khalis is not allowed");
        }
    }
}
