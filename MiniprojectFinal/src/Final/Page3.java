package Final;


import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// 비밀번호 찾기 페이지
public class Page3 extends JFrame {
	TicketingController controller = new TicketingController();
	
	
	Page3(){
		JPanel p = new JPanel();
		Color b= new Color(196,211,253); 
		p.setBackground(b);

		JLabel idLabel= new JLabel("ID :");
		JLabel phoneNumLabel= new JLabel("PHONENUM :");
		JButton ok = new JButton("입력");
		JLabel label = new JLabel();
		
		JTextField idTextField = new JTextField();
		JTextField phoneNumTextField = new  JTextField();
		
		Container container = getContentPane();
		
		container.add(idLabel);
		container.add(idTextField);
		container.add(ok);
		container.add(phoneNumLabel);
		container.add(phoneNumTextField);
//		container.add(label);
//		container.add(label);
		container.add(p);
		
	
		idLabel.setBounds(30, 10, 100, 30);
		phoneNumLabel.setBounds(30, 50, 100, 30);
		ok.setBounds(370, 10, 80, 70);
		
		idTextField.setBounds(110, 10, 240, 30);
		phoneNumTextField.setBounds(110, 50, 240, 30);

		label.setBounds(50, 300, 200, 40);
	
		
		setSize(500, 130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("비밀번호 찾기");
		setVisible(true);
		
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		        try {
		            // null 체크
		            if (idTextField.getText().equals("")||phoneNumTextField.getText().equals("")) {
		               JOptionPane.showMessageDialog(null, "정보를 입력하세요.");
		               dispose();

		            } else{
		            	controller.searchPW(idTextField.getText(), phoneNumTextField.getText());
		            	dispose();
		            }
		          }  
		          catch (Exception e2) {
		            e2.printStackTrace();
		         }
			}
		});
		
		
	}
	
}
