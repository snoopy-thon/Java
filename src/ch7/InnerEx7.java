package ch7;
import java.awt.*;
import java.awt.event.*;
import java.beans.EventHandler;

public class InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler2());
    }
}

class EventHandler2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent ocurred!!!");
    }
}
