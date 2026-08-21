import java.util.*;
public class PrintNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nagaraj");
        names.add("Sachin");
        names.add("Bharath");
        names.add("Madhu");
        System.out.println("Names greater than 5 characters: ");
        for(int i = 0;i<names.size();i++){
            if((names.get(i)).length()>5 ){
                System.out.println(names.get(i));
            }
        }

    }
}
