//U10416020 ³\´º¯ô

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
	public Calculator(){
		//Create panel p1 and set GridLayout
		JPanel p1 = new JPanel();		
		p1.setLayout(new GridLayout(5,4));
		
		//Add button to the panel p1 line 1
		p1.add(new JButton("C"));
		p1.add(new JButton("+/-"));
		p1.add(new JButton("%"));
		p1.add(new JButton("DEL"));
		
		//Add button to the panel p1 line 2
		for(int i = 7; i <= 9; i++){
			p1.add(new JButton("" + i));
		}
		p1.add(new JButton("¡Ò"));
		
		//Add button to the panel p1 line 3
		for(int i = 4; i <= 6; i++){
			p1.add(new JButton("" + i));
		}
		p1.add(new JButton("¡Ñ"));
		
		//Add button to the panel p1 line 4
		for(int i = 1; i <= 3; i++){
			p1.add(new JButton("" + i));
		}
		p1.add(new JButton("-"));
		
		//Add button to the panel p1 line 5
		p1.add(new JButton("."));
		p1.add(new JButton("" + 0));
		p1.add(new JButton("="));
		p1.add(new JButton("+"));
		
		//Create the panel p2 
		JPanel p2 = new JPanel(new BorderLayout());
		
		//Add a text field to the panel p2 and put to the north		
		TextField textField = new TextField("");
		textField.setEditable(false);
		p2.add(textField, BorderLayout.NORTH);
				
		//Add contents to the frame		
		add(p2, BorderLayout.NORTH);
		add(p1, BorderLayout.CENTER);
	}


	
}