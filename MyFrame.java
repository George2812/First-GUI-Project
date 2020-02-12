import javax.swing.*;

public class MyFrame extends JFrame {
	
	private JPanel panel;
	private JTextField textField;
	private JButton button;
	
	
	
	public MyFrame() {
		
		panel=new JPanel(); //Δημιουργία υποδοχέα
		textField=new JTextField(20);//Δημιουργία γραφικών συστατικών-το 10 καθορίζει το πλάτος του παραθύρου
		button=new JButton("Press me");
		
		panel.add(textField);//προσθήκη γραφικών συστατικών στο panel
		panel.add(button);
		
		this.setContentPane(panel);//Βήμα 4-προσαρμογή υποδοχέα 
		
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("My First Impressive Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
