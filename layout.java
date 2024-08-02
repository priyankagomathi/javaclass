import javax.swing.*;
import java.awt.*;

public class layout {
    public layout(){

    }
    public static void main(String[] args) {
//        JFrame jframe;
//        jframe = new JFrame();
//       // jframe = new JFrame();
//        //create buttons
//        JButton btn1 = new JButton("NORTH");
//        JButton btn2 = new JButton("SOUTH");
//        JButton btn3 = new JButton("EAST");
//        JButton btn4 = new JButton("WEST");
//        JButton btn5 = new JButton("CENTER");
//
//        jframe.setLayout(new BorderLayout(20, 15));
//        jframe.add(btn1, BorderLayout.NORTH);
//        jframe.add(btn2, BorderLayout.SOUTH);
//        jframe.add(btn3, BorderLayout.EAST);
//        jframe.add(btn4, BorderLayout.WEST);
//        jframe.add(btn5, BorderLayout.CENTER);
//        jframe.setSize(300,300);
//        jframe.setVisible(true);


//        JFrame frameObj = new JFrame();
//        JButton btn1 = new JButton("1");
//        JButton btn2 = new JButton("2");
//        JButton btn3 = new JButton("3");
//        JButton btn4 = new JButton("4");
//        JButton btn5 = new JButton("5");
//        JButton btn6 = new JButton("6");
//        JButton btn7 = new JButton("7");
//        JButton btn8 = new JButton("8");
//        JButton btn9 = new JButton("9");
//        frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);
//        frameObj.add(btn4); frameObj.add(btn5); frameObj.add(btn6);
//        frameObj.add(btn7); frameObj.add(btn8); frameObj.add(btn9);
//        frameObj.setLayout(new GridLayout());
//        frameObj.setSize(300, 300);
//        frameObj.setVisible(true);


        JFrame frameObj = new JFrame();


        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");



        frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);
        frameObj.add(b5); frameObj.add(b6);  frameObj.add(b7);  frameObj.add(b8);
        frameObj.add(b9);  frameObj.add(b10);


        frameObj.setLayout(new FlowLayout());

        frameObj.setSize(300, 300);
        frameObj.setVisible(true);


    }
}
