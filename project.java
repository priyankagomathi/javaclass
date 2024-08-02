import java.awt.*;
import java.awt.event.*;


public class project {
    public static void main(String[] arg) {

        Frame f = new Frame("Admin");
        Label l1, l2;
        l1 = new Label("USER:");
        l1.setBounds(500, 260, 100, 30);
        TextField t1 = new TextField();
        t1.setBounds(600, 260, 200, 30);
        l2 = new Label("PASSWORD:");
        l2.setBounds(500, 300, 100, 30);
        TextField t2 = new TextField();
        t2.setBounds(600, 300, 200, 30);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        Frame f1=new Frame("Action Listener Example");
        TextField tf=new TextField();
        tf.setBounds(600,400,150,20);
        Button b=new Button("Click Here");
        b.setBounds(740,350,60,30);
        f.setSize(400, 500);
        f.add(b);
        f.add(tf);
        f.setLayout(null);
        f.setVisible(true);
        String a="Priyanka";
        String c="0504";


            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (a.equals(t1.getText())&& c.equals(t2.getText()))
                    {
                    tf.setText("Login Successfully");
                    System.out.println(tf.getText());
                    new project1();
                }}
            });



        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {

                f.dispose();
            }
        });


    }

}
