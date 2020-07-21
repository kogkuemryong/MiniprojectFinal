package Final;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Page4 extends JFrame  {
	
	DAO dao;
	DTO_Member dto;
	
	Page4(){
		
	
		JPanel p = new JPanel();
		JLabel idLabel= new JLabel("ID :");
		JButton deleteButton = new JButton("삭제");
		JLabel label = new JLabel();
		
		JTextField idTextField = new JTextField();
		Container container = getContentPane();
		
		container.add(idLabel);
		container.add(idTextField);
		container.add(deleteButton);
		container.add(p);

		idLabel.setBounds(30, 10, 100, 30);
		deleteButton.setBounds(270, 10, 80, 30);
		idTextField.setBounds(60, 10, 200, 30);
		label.setBounds(50, 300, 200, 40);
		
		setSize(400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("회원탈퇴");
		setVisible(true);
        
		
		deleteButton.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				
				
				dao = new DAO();
				dto = new DTO_Member();
				
				if(dao.idCheak(idTextField.getText()) == 1) {
				dao.deleteMember(idTextField.getText());
				JOptionPane.showMessageDialog(null, "삭제되었습니다.");
				dispose();
				}else {
					JOptionPane.showMessageDialog(null, "존재 하지 않는 아이디 입니다. 다시 입력해주세요.");
				}
			}
		});
}
}
