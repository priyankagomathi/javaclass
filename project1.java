import java.awt.*;
import java.awt.event.*;

public class project1 extends Frame implements ItemListener  {
    private TextArea TextArea;
    private Choice c;

    public project1() {
        c = new Choice();
        c.add("BSC IT");
        c.add("BSC CS");
        c.add("BCA");
        TextArea = new TextArea( 10, 30);
        TextArea.setBounds(150,300,200,150);

        Frame f = new Frame("Student Details");
        Label l1, l2, l3, l4, l5,l6,l7;

        l1 = new Label("NAME");
        l1.setBounds(20, 50, 100, 30);
        f.add(l1);
        l2 = new Label("AGE");
        l2.setBounds(20, 90, 100, 30);
        f.add(l2);
        l3 = new Label("FATHER NAME");
        l3.setBounds(20, 130, 100, 30);
        f.add(l3);
        l4 = new Label("MOTHER NAME");
        l4.setBounds(20, 170, 100, 30);
        f.add(l4);
        l5 = new Label("BLOOD GROUP");
        l5.setBounds(20, 210, 100, 30);
        f.add(l5);
        l6 = new Label("DEPARTMENT");
        l6.setBounds(20, 255, 100, 30);
        f.add(l6);
        l7 = new Label("FEES STRUCTURE");
        l7.setBounds(20, 300, 120, 30);
        f.add(l7);
        f.add(TextArea);
        c.setBounds(150, 260, 100, 30);
        f.add(c);
        f.add(TextArea);
        TextField t1 = new TextField();
        t1.setBounds(150, 50, 200, 30);
        TextField t2 = new TextField();
        t2.setBounds(150, 90, 200, 30);
        TextField t3 = new TextField();
        t3.setBounds(150, 130, 200, 30);
        TextField t4 = new TextField();
        t4.setBounds(150, 170, 200, 30);
        TextField t5 = new TextField();
        t5.setBounds(150, 210, 200, 30);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.setSize(400, 500);
        c.addItemListener(this);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        Frame f1 = new Frame("Action Listener Example");
        TextField tf = new TextField();
        tf.setBounds(150, 480, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(20, 470, 60, 30);
        f.add(b);
        f.add(tf);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Successful...");
                new student();
            }
        });
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });}
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == c) {
                String selectedItem = c.getSelectedItem();
                TextArea.append("Details: \n" + selectedItem + "\n" + "\n \t Sem:10500 \n \t Transport:12300 \n \t Hostel:17000\n");

            }
    }
}
