public class StringBuilderOne {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        sb.insert(5, " "); // insert comma in position 5
        //sb.delete(5, 6); // delete between 5 and 6 position
        //sb.reverse(); //reverse the word / num

        System.out.println(sb.toString()); // proper way but new java can still compile if just put sb
    }
}
