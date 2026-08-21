public class ReverseString {
    public static void main(String[] args) {
        String name = "attop adop";
        String reversed = "";
        for(int i =0;i<name.length();i++){
            reversed = name.charAt(i)+reversed;
        }
        System.out.println(reversed);
    }
}
