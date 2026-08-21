import java.util.*;

public class StartWithS {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = 3;
        while(s.size()<=size){
            s.add(sc.nextLine());
        }

        for(String S:s){
            if(S.toUpperCase().startsWith("S")){
                System.out.println(S);
            }

        }
    }
}
