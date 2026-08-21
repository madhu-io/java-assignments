import java.util.Scanner;

public class builtin {
    public static void main(String[] args) {
        String a = "Bharath";
        String b = "Bharath Nagaraj ";
        int c = 9;
        String d = "B";
        System.out.println("Length: "+ a.length());
        System.out.println("A string is empty (true or false): "+a.isEmpty());
        System.out.println("Containing white space: "+a.isBlank());
        System.out.println("Check contains (t/f): "+a.contains(b));
        System.out.println("checks equals (T/F): "+a.equals(b));
        System.out.println("Equal ignore: "+a.equalsIgnoreCase(b));
        System.out.println("Change lower case to upper: "+a.toUpperCase());
        System.out.println("change upper to lower case: "+b.toLowerCase());
        System.out.println("Starting letter: "+b.startsWith("Bharath"));
        System.out.println("Ending letter: "+b.endsWith("Bharath"));
        System.out.println("first letter index: "+a.indexOf("Nagaraj"));
        System.out.println("last letter index: "+a.lastIndexOf("Nagaraj"));
        System.out.println("Joining two strings: "+String.join(a,b));
        System.out.println("Splitting String: "+a.split(" "));
        System.out.println("Sub Sequence: "+ b.subSequence(0,6));
        System.out.println("sub String: "+b.substring(8));
        System.out.println("int into string: "+ c);
        System.out.println("Content Equals: "+a.contentEquals(b));
        System.out.println("Concat: "+(a.concat(b)));
        System.out.println("unique code: "+a.codePointAt(2));
        System.out.println("Codepoint before: "+a.codePointBefore(2));
        System.out.println("Code point count: "+a.codePointCount(0,6));
        System.out.println("Comparing two strings: "+a.compareTo(b));
        System.out.println("Comparing two strings case: "+a.compareToIgnoreCase(b));
        System.out.println("Character: "+a.charAt(1));
        System.out.println("replacing string: "+b.replace("B","G"));
        System.out.println("hashcode: "+a.hashCode());
        System.out.println("Replace of: "+b.replace("Nagaraj","Ganesh"));
        System.out.println("Replace first: "+b.replace("Nagaraj","Ganesh"));
        String.format("Hi %s , you are %d",a,c);
        System.out.println("letter match: "+d.matches(a));
        System.out.println("Trimming: "+b.trim());
        System.out.println("Character to Array: "+d.toCharArray());




    }
}
