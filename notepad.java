import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class notepad extends Frame {
    public notepad() {
        setTitle("Untitled-Notepad");
        setSize(400, 300);

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        Menu fileMenu = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        Menu fileMenu1=new Menu("Edit");
        MenuItem newItem1 = new MenuItem("Cut");
        MenuItem openItem1 = new MenuItem("Copy");
        MenuItem exitItem1= new MenuItem("paste");
        fileMenu1.add(newItem1);
        fileMenu1.add(openItem1);
        fileMenu1.add(exitItem1);
        menuBar.add(fileMenu1);
        Menu fileMenu2=new Menu("Format");
        MenuItem newItem2 = new MenuItem("Word Wrap");
        MenuItem openItem2 = new MenuItem("Font...");
        fileMenu2.add(newItem2);
        fileMenu2.add(openItem2);
        menuBar.add(fileMenu2);
        Menu fileMenu3=new Menu("View");
        MenuItem newItem3 = new MenuItem("Zoom");
        MenuItem openItem3 = new MenuItem("Status Bar");
        fileMenu3.add(newItem3);
        fileMenu3.add(openItem3);
        menuBar.add(fileMenu3);
        Menu fileMenu4=new Menu("Help");
        MenuItem newItem4 = new MenuItem("View Help");


        MenuItem openItem4 = new MenuItem("Send Feedback");
        MenuItem exitItem4= new MenuItem("About Notepad");
        fileMenu4.add(newItem4);
        fileMenu4.add(openItem4);
        fileMenu4.add(exitItem4);
        menuBar.add(fileMenu4);
        TextField t1 = new TextField();
        t1.setBounds(5, 50, 1370, 1000);
        add(t1);
     
        this.setSize(400, 300);
        Scrollbar scrollbar = new Scrollbar(1);
        scrollbar.setBounds(1360, 50, 10, 1000);
        this.add(scrollbar);
        this.setLayout((LayoutManager)null);
        this.setVisible(true);
        this.add(t1);



        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new notepad();
    }
}


