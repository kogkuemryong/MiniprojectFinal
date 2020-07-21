package Final;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Page1 extends JFrame {
	
	Page2 f2;
	DAO dao;
	DTO_Member dto;
	Font font;
	
	public Page1(){
		
        ImageIcon cgvIcon = new ImageIcon("./images/cgv1.jpg");
        
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                // Approach 1: Dispaly image at at full size
                g.drawImage(cgvIcon.getImage(), 0, 0, null);
                // Approach 2: Scale image to size of component
                // Dimension d = getSize();
                // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                // Approach 3: Fix the image position in the scroll pane
                // Point p = scrollPane.getViewport().getViewPosition();
                // g.drawImage(icon.getImage(), p.x, p.y, null);
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };
     
		font = new Font("고딕", Font.BOLD, 15);
		
        // 글자 컬러
        JLabel idLabel= new JLabel("ID :");
        idLabel.setFont(font);
        idLabel.setForeground(Color.darkGray);
		JLabel pwLabel= new JLabel("PW :");
		pwLabel.setFont(font);
		pwLabel.setForeground(Color.darkGray);
		
		
		JTextField idTextField = new JTextField();
		JPasswordField passwordField = new  JPasswordField();
		
		JButton loginButton = new JButton("로그인");
		JButton signInButton = new JButton("회원가입");
		JButton loginThButton = new JButton("비회원 로그인");
		JButton searchPW = new JButton("비밀번호 찾기");
		JButton deleteButton = new JButton("회원 탈퇴");
		Container container = getContentPane();
	
		
		container.add(loginThButton);
		container.add(idLabel);
		container.add(pwLabel);
		container.add(idTextField);
		container.add(passwordField);
		container.add(loginButton);
		container.add(signInButton);
		container.add(searchPW);
		container.add(deleteButton);
		container.add(background);
		
		
		idLabel.setBounds(90, 58, 40, 40);
		pwLabel.setBounds(90, 100, 60, 40);
		
		idTextField.setBounds(150, 65, 240, 30);
		passwordField.setBounds(150, 105, 240, 30);
		loginButton.setBounds(407, 65, 115, 70);
		signInButton.setBounds(150, 150, 115, 30);
		searchPW.setBounds(280, 150, 115, 30);
		loginThButton.setBounds(407, 150, 115, 30);
		deleteButton.setBounds(407,180,115,30);
		
		setSize(650, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("로그인 화면 ");
		setVisible(true);
		
		loginButton.addActionListener(new ActionListener() { // 로그인
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 dao = new DAO();
				 dto = new DTO_Member();
				 
				
				if(dao.login(idTextField.getText(),passwordField.getText()) == 1) {
					JOptionPane.showMessageDialog(null, "로그인에 성공하셨습니다.");
					new Page5();
					dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "다시 입력해주세요.");
				}
		
			}
				
		});		

		// 회원가입 버튼
		signInButton.addActionListener(new ActionListener() { // 회원가입창으로 이동 (회원가입)
			@Override
			public void actionPerformed(ActionEvent e) {
				f2 = new Page2();
			}
		});
		;
	
	
		// 비회원 로그인 
		loginThButton.addActionListener(new ActionListener() { // 비회원 로그인
		
			
		@Override
		public void actionPerformed(ActionEvent e) {
		
			
			JOptionPane.showMessageDialog(null, "비회원 로그인에 성공하셨습니다.");
			new Page5();
			dispose();
			//table 123 = new table();
		}
	});
		
		// 비밀번호 찾기 
		searchPW.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Page3();
			}
		});
		
		
		 // 회원 삭제 (추가)  - Page4 추가 
		deleteButton.addActionListener(new ActionListener() {
		@Override
		
		public void actionPerformed(ActionEvent e) {
			
		new Page4();
			
		}
	});
	
}}

