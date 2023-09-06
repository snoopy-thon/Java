package ch7;
import java.awt.*;
import java.awt.event.*;
// 예제 7-37을 익명 클래스로 변환
public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}
