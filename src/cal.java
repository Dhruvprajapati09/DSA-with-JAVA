import javax.swing.*;
import java.awt.event.*;

public class cal implements ActionListener {
    JTextField tf;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    JButton badd, bsub, bmul, bdiv, beq, bclr;
    JFrame f;

    double num1 = 0, num2 = 0, result = 0;
    String operator;

    public cal() {
        f = new JFrame("Calculator");
        tf = new JTextField();
        tf.setBounds(100, 100, 200, 40);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        beq = new JButton("=");
        bclr = new JButton("CE");

        // Set bounds
        tf.setBounds(50, 50, 260, 50);
        b1.setBounds(50, 120, 50, 50);
        b2.setBounds(120, 120, 50, 50);
        b3.setBounds(190, 120, 50, 50);
        b4.setBounds(50, 190, 50, 50);
        b5.setBounds(120, 190, 50, 50);
        b6.setBounds(190, 190, 50, 50);
        b7.setBounds(50, 260, 50, 50);
        b8.setBounds(120, 260, 50, 50);
        b9.setBounds(190, 260, 50, 50);
        b0.setBounds(120, 330, 50, 50);

        badd.setBounds(260, 120, 50, 50);
        bsub.setBounds(260, 190, 50, 50);
        bmul.setBounds(260, 260, 50, 50);
        bdiv.setBounds(260, 330, 50, 50);
        beq.setBounds(190, 330, 50, 50);
        bclr.setBounds(50, 330, 50, 50);

        // Add components
        f.add(tf);
        f.add(b1); f.add(b2); f.add(b3);
        f.add(b4); f.add(b5); f.add(b6);
        f.add(b7); f.add(b8); f.add(b9);
        f.add(b0); f.add(badd); f.add(bsub);
        f.add(bmul); f.add(bdiv); f.add(beq);
        f.add(bclr);

        // Add action listeners
        b1.addActionListener(this); b2.addActionListener(this);
        b3.addActionListener(this); b4.addActionListener(this);
        b5.addActionListener(this); b6.addActionListener(this);
        b7.addActionListener(this); b8.addActionListener(this);
        b9.addActionListener(this); b0.addActionListener(this);

        badd.addActionListener(this); bsub.addActionListener(this);
        bmul.addActionListener(this); bdiv.addActionListener(this);
        beq.addActionListener(this); bclr.addActionListener(this);

        // Frame settings
        f.setLayout(null);
        f.setSize(400, 450);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.matches("[0-9]")) {
            tf.setText(tf.getText() + s);
        } else if (s.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(tf.getText());
            operator = s;
            tf.setText("");
        } else if (s.equals("=")) {
            num2 = Double.parseDouble(tf.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = (num2 == 0) ? 0 : num1 / num2; break;
            }
            tf.setText(String.valueOf(result));
        } else if (s.equals("CE")) {
            tf.setText("");
            num1 = num2 = result = 0;
        }
    }

    public static void main(String[] args) {
        new cal();
    }
}
