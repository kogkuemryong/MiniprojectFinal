package Final;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// 회원가입 페이지
public class Page2 extends JFrame {
	
	
	JTextField name;
	JTextField tel;
	JTextField id;
	JPasswordField pw;
	
	JButton insert;
	JButton cancle;
	JButton overlap;
	
	DAO dao = new DAO();
	DTO_Member dto;
	Font font;

	
	Page2(){

		font = new Font("고딕", Font.BOLD, 12);
	  	
		JPanel p = new JPanel();
		Color b= new Color(196,211,253); 
		p.setBackground(b);
		
	  	JLabel nameLabel = new JLabel("NAME : ");	
	  	
		JLabel telLabel= new JLabel("TEL : ");
		
        JLabel idLabel = new JLabel("ID : ");
     
        JLabel pwLabel= new JLabel("PW : ");
    
        
    	Container container = getContentPane();
		
		container.add(nameLabel);
		container.add(telLabel);
		container.add(idLabel);
		container.add(pwLabel);
   
		name = new JTextField();
		tel = new JTextField();
		id = new JTextField();
		pw = new JPasswordField();

        container.add(name);
        container.add(tel);
        container.add(id);
        container.add(pw);
  
        insert = new JButton("저장");
        insert.setFont(font);
        
        cancle = new JButton("취소");
        cancle.setFont(font);
        
        overlap = new JButton("중복확인");
        overlap.setFont(font);
        
        container.add(insert);
        container.add(cancle);
        container.add(overlap);
        container.add(p);
    
        
        nameLabel.setBounds(30, 10, 50, 40);
        telLabel.setBounds(30, 50, 50, 40);
        idLabel.setBounds(30, 90, 50, 40);
        pwLabel.setBounds(30, 130, 50, 40);
    
        name.setBounds(100, 10, 200, 30);
        tel.setBounds(100, 50, 200, 30);
        id.setBounds(100, 90, 200, 30);
        pw.setBounds(100, 130, 200, 30);
      
        insert.setBounds(220, 170, 80, 30);
        cancle.setBounds(100, 170, 80, 30); ; 
        overlap.setBounds(310, 90, 90, 30);
        
        setSize(450,250);
	    setTitle("회원가입");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
        
        // 아이디 중복 체크 
        overlap.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) { 
    			dao = new DAO();
				dto = new DTO_Member();

				if(dao.idCheak(id.getText()) == 1) {
					JOptionPane.showMessageDialog(null, "아이디가 중복되었습니다.  다시 입력하여주세요.");
			
				}else {
					JOptionPane.showMessageDialog(null, "사용 가능한 아이디입니다.");
				}
    		}
    	});;

    	
        // 취소 main으로 복귀
    	cancle.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) { 
    			
    			dispose();
    		}
    	});;
    	 
    	
    	//회원가입 
    	insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
              
                  // null 체크
                  if (name.getText().equals("") || tel.getText().equals("") 
                		                         || id.getText().equals("") || pw.getText().equals("")) {
                     JOptionPane.showMessageDialog(null, "저장할 내용을 입력하세요.");
                     // JOptionPane 팝업창을 보여주는 메소드 입니다.
                  } else {
						  dto = new DTO_Member(); 
						  dto.setName(name.getText());
						  dto.setTel(tel.getText()); 
						  dto.setId(id.getText());
						  dto.setPw(pw.getText()); 
						  dao.insert(dto);
						  JOptionPane.showMessageDialog(null, "회원가입 되셨습니다.");
						  dispose();
                	       // System.out.println(name1.getText());
                		}
                     }
                catch (Exception e2) {
                  e2.printStackTrace();
               }
            }

         });
	}

}		