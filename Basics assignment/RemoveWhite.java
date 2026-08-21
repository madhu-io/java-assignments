public class RemoveWhite {
    public static void main(String[] args) {
        String str = "Java is Fun";

        String result = str.replaceAll("\\s", "");

        System.out.println(result);
    }
}
