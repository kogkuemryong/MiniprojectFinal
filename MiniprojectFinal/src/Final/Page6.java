package Final;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class Page6 extends JFrame {
	
	   public Page6(DTO_Movie dto){
	      setLayout(null); 
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      //영화 이미지 삽입
	      ImageIcon ag= new ImageIcon("./images/avengers.png");
	      ImageIcon wt = new ImageIcon("./images/winter.jpg");
	      ImageIcon sd = new ImageIcon("./images/spider.jpg");
	      //줄거리 삽입
	      ImageIcon tx= new ImageIcon("./images/text.jpg");
	      ImageIcon tx1= new ImageIcon("./images/text1.jpg");
	      ImageIcon tx2= new ImageIcon("./images/text2.jpg");
	      
	      
	      //버튼 삽입
	      JButton event = new JButton(ag);
	      event.setRolloverIcon(tx);
	      JButton event1 = new JButton(wt);
	      event1.setRolloverIcon(tx1);
	      JButton event2 = new JButton(sd);
	      event2.setRolloverIcon(tx2);
	      
         
	        JButton btn1 = new JButton("08 : 50");
	        JButton btn2 = new JButton("12 : 00");
	        JButton btn3 = new JButton("15 : 10");
	        JButton btn4 = new JButton("18 : 20");
	        JButton btn5 = new JButton("21 : 30");
	        JButton btn6 = new JButton("09 : 10");
	        JButton btn7 = new JButton("11 : 30");
	        JButton btn8 = new JButton("13 : 50");
	        JButton btn9 = new JButton("16 : 10");
	        JButton btn10 = new JButton("18 : 30");
	        JButton btn11 = new JButton("09 : 00");
	        JButton btn12 = new JButton("11 : 30");
	        JButton btn13 = new JButton("14 : 00");
	        JButton btn14 = new JButton("16 : 30");
	        JButton btn15 = new JButton("19 : 00");
	        JButton btn16 = new JButton("1관");
	        JButton btn17 = new JButton("2관");
	        JButton btn18 = new JButton("3관");
	        JButton btn19 = new JButton("1관");
	        JButton btn20 = new JButton("2관");
	        JButton btn21 = new JButton("3관");
	        JButton btn22 = new JButton("1관");
	        JButton btn23 = new JButton("2관");
	        JButton btn24 = new JButton("3관");
	        
	        
	        btn1.addActionListener(new ActionListener(){ 
	        public void actionPerformed(ActionEvent e){
	        new MovieCheck(dto); 
	         }
	      });
	        btn2.addActionListener(new ActionListener(){ 
		        
		        public void actionPerformed(ActionEvent e){
		           new movieCheck2(dto);     
		         }
		      });
	        btn3.addActionListener(new ActionListener(){ 
		        
		        public void actionPerformed(ActionEvent e){
		           new movieCheck3(dto);     
		         }
		      });
            btn4.addActionListener(new ActionListener(){ 
		        
		        public void actionPerformed(ActionEvent e){
		           new movieCheck4(dto);     
		         }
		      });
            btn5.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck5(dto);     
            	}
            });
            btn6.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck6(dto);     
            	}
            });
            btn7.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck7(dto);     
            	}
            });
            btn8.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck8(dto);     
            	}
            });
            btn9.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck9(dto);     
            	}
            });
            btn10.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck10(dto);     
            	}
            });
            btn11.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck11(dto);     
            	}
            });
            btn12.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck12(dto);     
            	}
            });
            btn13.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck13(dto);     
            		}
            });
            btn14.addActionListener(new ActionListener(){ 
    
            	public void actionPerformed(ActionEvent e){
            		new movieCheck14(dto);     
            	}
            });
            btn15.addActionListener(new ActionListener(){ 
            	public void actionPerformed(ActionEvent e){
            		new movieCheck15(dto);     
            		}
            });
            
	      Container container = getContentPane();
	      container.add(event);
	      container.add(event1);
	      container.add(event2);
	      
	      Container containe = getContentPane();
	      containe.add(btn1);   containe.add(btn2); containe.add(btn3); containe.add(btn4); containe.add(btn5);
	      containe.add(btn6); containe.add(btn7); containe.add(btn8); containe.add(btn9); containe.add(btn10);
	      containe.add(btn11); containe.add(btn12); containe.add(btn13); containe.add(btn14); containe.add(btn15); 
	      containe.add(btn16); containe.add(btn17); containe.add(btn18); containe.add(btn19); containe.add(btn20);
	      containe.add(btn21); containe.add(btn22); containe.add(btn23); containe.add(btn24);
	      
	      
	      //버튼 위치지정
	      event.setBounds(10,10,150,200);
	      event1.setBounds(10,250,150,200);
	      event2.setBounds(10,490,150,200);
	      btn1.setBounds(280, 30, 90, 30); btn2.setBounds(400, 30, 90, 30); btn3.setBounds(280, 80, 90, 30); btn4.setBounds(400, 80, 90, 30); btn5.setBounds(280, 130, 90, 30);
	      btn6.setBounds(280, 270, 90, 30); btn7.setBounds(400, 270, 90, 30); btn8.setBounds(280, 320, 90, 30); btn9.setBounds(400, 320, 90, 30); btn10.setBounds(280, 370, 90, 30);
	      btn11.setBounds(280, 510, 90, 30); btn12.setBounds(400, 510, 90, 30); btn13.setBounds(280, 560, 90, 30); btn14.setBounds(400, 560, 90, 30); btn15.setBounds(280, 610, 90, 30);
	      btn16.setBounds(170, 30, 60, 30);  btn17.setBounds(170, 80, 60, 30);   btn18.setBounds(170, 130, 60, 30);   btn19.setBounds(170, 270, 60, 30);   btn20.setBounds(170, 320, 60, 30);  
	      btn21.setBounds(170, 370, 60, 30);  btn22.setBounds(170, 510, 60, 30);   btn23.setBounds(170, 560, 60, 30);   btn24.setBounds(170, 610, 60, 30);  
	      

	           
	      setTitle("영화예매");
	      setSize(600,750);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.getContentPane().setBackground(Color.white);//배경색 삽입
	      setVisible(true);
	}
}



