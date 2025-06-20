import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener{
	Panel pnl;
	Button btn1,btn2,btn3,btn4;
	TextField txt1,txt2,result;
	Label lbl1,lbl2,lbl3;
	Calculator(){
		setTitle("Calculator");
		setSize(500,300);
		setVisible(true);
		pnl=new Panel();
		pnl.setLayout(new GridLayout(5, 2, 10, 10));
		pnl.setBackground(Color.green);
		
		lbl1=new Label("FIRST NO > ");
		pnl.add(lbl1);
		txt1=new TextField();
		pnl.add(txt1);


		lbl2=new Label("SECOND NO > ");
		pnl.add(lbl2);
		txt2=new TextField();
		pnl.add(txt2);

		

		btn1=new Button(" + ");
		btn1.addActionListener(this);
		pnl.add(btn1);

		btn2=new Button(" - ");
		btn2.addActionListener(this);
		pnl.add(btn2);

		btn3=new Button(" * ");
		btn3.addActionListener(this);
		pnl.add(btn3);

		btn4=new Button(" / ");
		btn4.addActionListener(this);
		pnl.add(btn4);

		lbl3=new Label("Result:");
		pnl.add(lbl3);
        	result = new TextField();
        	pnl.add(result);

		add(pnl);
		}
		public void actionPerformed(ActionEvent e) {
        		
		try {
          	  double n1 = Double.parseDouble(txt1.getText());
          	  double n2 = Double.parseDouble(txt2.getText());
         	  double res = 0;

            		if (e.getSource() == btn1) {
                	res = n1 + n2;
            		} else if (e.getSource() == btn2) {
                	res = n1 - n2;
            		} else if (e.getSource() == btn3) {
                	res = n1 * n2;
            		} else if (e.getSource() == btn4) {
                	if (n2 == 0) {
                    	result.setText("Cannot divide by 0");
                    	return;
                	}
                	res = n1 / n2;
            		}

            	result.setText(String.valueOf(res));
        	} catch (NumberFormatException ex) {
            	result.setText("Invalid input");
        	}
    	}
    public static void main(String[] args) {
        new Calculator();
    }
}