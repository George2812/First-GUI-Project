import javax.swing.*;

public class MyFrame extends JFrame {
	
	private JPanel panel;
	private JTextField textField;
	private JButton button;
	
	
	
	public MyFrame() {
		
		panel=new JPanel(); //���������� ��������
		textField=new JTextField(20);//���������� �������� ����������-�� 10 ��������� �� ������ ��� ���������
		button=new JButton("Press me");
		
		panel.add(textField);//�������� �������� ���������� ��� panel
		panel.add(button);
		
		this.setContentPane(panel);//���� 4-���������� �������� 
		
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("My First Impressive Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
