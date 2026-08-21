
public class Rectangle {
    public static void main(String[] args) {
        int len = 5;
        int breadh = 4;
        float area = len * breadh;
        float peri = 2 * (len + breadh);
        if (area>peri){
            System.out.println("area is greater than perimeter");
        }else{
            System.out.println("perimeter is greater than area");

        }


    }
}
