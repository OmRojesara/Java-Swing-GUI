import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator 
{
    public static void main(String args[]) 
	{
        
        JFrame f = new JFrame("Calculator");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JTextField result = new JTextField();
		
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
		
        JLabel label1 = new JLabel("Number 1:");
        JLabel label2 = new JLabel("Number 2:");
		
        JLabel labelResult = new JLabel("Result:");

  
        label1.setBounds(30, 30, 100, 30);
		num1.setBounds(130, 30, 100, 30);
		label2.setBounds(30, 80, 100, 30);
		num2.setBounds(130, 80, 100, 30);
		
		add.setBounds(30, 130, 80, 30);
		sub.setBounds(130, 130, 80, 30);

		mul.setBounds(30, 180, 80, 30);
		div.setBounds(130, 180, 80, 30);
		
		labelResult.setBounds(30, 230, 100, 30);
		result.setBounds(130, 230, 100, 30);

        result.setEditable(false);

        add.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                result.setText(String.valueOf(n1 + n2));
            }
        });

        sub.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                result.setText(String.valueOf(n1 - n2));
            }
        });
		
		
		mul.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                result.setText(String.valueOf(n1 * n2));
            }
        });
		
		
		div.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                result.setText(String.valueOf(n1 / n2));
            }
        });

        
        f.add(label1);
        f.add(num1);
        f.add(label2);
        f.add(num2);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(labelResult);
        f.add(result);

        
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}	
