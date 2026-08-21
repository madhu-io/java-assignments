import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showInputDialog;

public class Input {
    public static void main(String[] args) {
        String name = showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Hello " + name +"!");
        int age = Integer.parseInt(showInputDialog("Hello "+ name +"!, How old are you? "));
        JOptionPane.showMessageDialog(null,name+" You are "+ age + " years old.");
    }
}
