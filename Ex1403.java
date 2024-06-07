import javax.swing.*;
import java.awt.*;

public class Ex1403 extends JFrame {

public Ex1403() {
setTitle("계산기");
setSize(300, 250);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel titlePanel = new JPanel() ;
titlePanel.setBounds(0, 0, 300, 40);
add(titlePanel);
JLavel title = new JLabel("계산기", JLabel.CENTER);
title.setFont("함초롬돋움", Font.BOLD, 20);
titlePanel.add(title);

JPanel numPanel = new JPnel();
numPanel.setBounds(0, 40, 300, 40);
add(numPanel);
JTextField num1 = new JTextField(5);
numPanel.add(num1);
JTextField num2 = new JTextField(5);
numPanel.add(num2);
}

JPanel btnPanel1 = new JPnel();
btnPanel1.setBounds(0, 80, 300, 40);
add(btnPanel1);
JButton plus = new JButton("+");
btnPanel1.add(plus);
JButton minus = new JButton("-");
btnPanel1.add(minus);

JPanel btnPanel2 = new JPnel();
btnPanel2.setBounds(0, 80, 300, 40);
add(btnPanel2);
JButton plus = new JButton("*");
btnPanel2.add(mult);
JButton minus = new JButton("/");
btnPanel2.add(div);

JPanel resPanel = new JPnel();
resPanel.setBounds(0, 160, 300, 40);
add(resPanel);
JLabel 1bl1 = new JLabel("결과값: ");
resPanel.add(lbl1);
JLabel lbl2 = new JLabel("");
resPanel.add(lbl2);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
setLayout(null);
setVisible(true);
}
public static void main(String[] args){
new Ex1403();
}