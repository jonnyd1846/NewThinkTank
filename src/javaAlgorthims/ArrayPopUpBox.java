package javaAlgorthims;

import javax.swing.*;

public class ArrayPopUpBox extends JFrame {

    JTextField field1, field2;
    JFrame frame;
    JButton button1, button2, button3, button;
    JRadioButton radioButton1, radioButton2, radioButton3;
    JLabel lable;

    public static void main(String[] args) {
        new ArrayPopUpBox();
    }

    public ArrayPopUpBox() {

        this.setSize(600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setVisible(true);


    }

}
