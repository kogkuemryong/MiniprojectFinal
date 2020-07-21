package Final;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class MovieCheck extends JFrame {
	
	MovieCheck(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);
     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"어벤져스 앤드게임","1관","08:50"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
	// 정보 저장 및 다음페이지
	btn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dto.setMname("어벤져스");
			dto.setTime("08:50");
			dto.setTheaternum("1관");
			dispose();
 			new Page7(dto);
		}
	});
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}

class movieCheck2 extends JFrame {
	
	movieCheck2(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"어벤져스 앤드게임","1관","12:00"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
 	// 정보 저장 및 다음페이지
 	btn.addActionListener(new ActionListener() {
 		@Override
 		public void actionPerformed(ActionEvent e) {
 			dto.setMname("어벤져스 앤드게임");
 			dto.setTime("12:00");
 			dto.setTheaternum("1관");
 			dispose();
 			new Page7(dto);
 		}
 	});
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}
class movieCheck3 extends JFrame {
	
	movieCheck3(DTO_Movie dto) {
		setTitle("영화저장");
		 JPanel NewWindowContainer = new JPanel();
	     setContentPane(NewWindowContainer);
	
	     JButton btn = new JButton("확인");
	     Container containe = getContentPane();
	      
	     containe.add(btn);
	     
	     String []a = {"영화제목","영화관","영화시간"};
	     String [][]b = {{"어벤져스 앤드게임","2관","15:10"}};
	     DefaultTableModel model = new DefaultTableModel(b,a);
	     JTable table = new JTable(model);
	     JScrollPane sc = new JScrollPane(table);
	     add(sc);
	     
	 	// 정보 저장 및 다음페이지
	 	btn.addActionListener(new ActionListener() {
	 		@Override
	 		public void actionPerformed(ActionEvent e) {
	 			dto.setMname("어벤져스 앤드게임");
	 			dto.setTime("15:10");
	 			dto.setTheaternum("2관");
	 			dispose();
	 			new Page7(dto);
	 		}
	 	});
	 
	     setSize(480,110);
	     setResizable(false);
	     setVisible(true);
	     
		}

}

class movieCheck4 extends JFrame {
	
	movieCheck4(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"어벤져스 앤드게임","2관","18:20"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
	 	// 정보 저장 및 다음페이지
	 	btn.addActionListener(new ActionListener() {
	 		@Override
	 		public void actionPerformed(ActionEvent e) {
	 			dto.setMname("어벤져스 앤드게임");
	 			dto.setTime("18:20");
	 			dto.setTheaternum("2관");
	 			dispose();
	 			new Page7(dto);
	 		}
	 	});   
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}
class movieCheck5 extends JFrame {
	
	movieCheck5(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"어벤져스 앤드게임","3관","21:30"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
	 	// 정보 저장 및 다음페이지
	 	btn.addActionListener(new ActionListener() {
	 		@Override
	 		public void actionPerformed(ActionEvent e) {
	 			dto.setMname("어벤져스 앤드게임");
	 			dto.setTime("21:30");
	 			dto.setTheaternum("3관");
	 			dispose();
	 			new Page7(dto);
	 		}
	 	});
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}
class movieCheck6 extends JFrame {
	
	movieCheck6(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"겨울왕국2","1관","09:10"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
     // 정보 저장 및 다음페이지
     btn.addActionListener(new ActionListener() {
    	 @Override
    	 public void actionPerformed(ActionEvent e) {
    		 dto.setMname("겨울왕국2");
    		 dto.setTime("09:10");
    		 dto.setTheaternum("1관");
    		 dispose();
    		 new Page7(dto);
    	 }
      });
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}
class movieCheck7 extends JFrame {
	
	movieCheck7(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"겨울왕국2","1관","11:30"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
     // 정보 저장 및 다음페이지
     btn.addActionListener(new ActionListener() {
    	 @Override
    	 public void actionPerformed(ActionEvent e) {
    		 dto.setMname("겨울왕국2");
    		 dto.setTime("11:30");
    		 dto.setTheaternum("1관");
    		 dispose();
    		 new Page7(dto);
    	 }
      });
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}
}

class movieCheck8 extends JFrame {
	
	movieCheck8(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
    setContentPane(NewWindowContainer);

    JButton btn = new JButton("확인");
    Container containe = getContentPane();
     
    containe.add(btn);
    
    String []a = {"영화제목","영화관","영화시간"};
    String [][]b = {{"겨울왕국2","2관","13:50"}};
    DefaultTableModel model = new DefaultTableModel(b,a);
    JTable table = new JTable(model);
    JScrollPane sc = new JScrollPane(table);
    add(sc);
    
    // 정보 저장 및 다음페이지
    btn.addActionListener(new ActionListener() {
   	 @Override
   	 public void actionPerformed(ActionEvent e) {
   		 dto.setMname("겨울왕국2");
   		 dto.setTime("13:50");
   		 dto.setTheaternum("2관");
   		 dispose();
   		 new Page7(dto);
   	 }
     });

    setSize(480,110);
    setResizable(false);
    setVisible(true);
    
	}

}

class movieCheck9 extends JFrame {
	
	movieCheck9(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"겨울왕국2","2관","16:10"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
     // 정보 저장 및 다음페이지
     btn.addActionListener(new ActionListener() {
    	 @Override
    	 public void actionPerformed(ActionEvent e) {
    		 dto.setMname("겨울왕국2");
    		 dto.setTime("16:10");
    		 dto.setTheaternum("2관");
    		 dispose();
    		 new Page7(dto);
    	 }
      });
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}

class movieCheck10 extends JFrame {
	
	movieCheck10(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"겨울왕국2","3관","18:30"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
     // 정보 저장 및 다음페이지
     btn.addActionListener(new ActionListener() {
    	 @Override
    	 public void actionPerformed(ActionEvent e) {
    		 dto.setMname("겨울왕국2");
    		 dto.setTime("18:30");
    		 dto.setTheaternum("3관");
    		 dispose();
    		 new Page7(dto);
    	 }
      });
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}

class movieCheck11 extends JFrame {
	
	movieCheck11(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"스파이더맨 홈커밍","1관","09:00"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
     // 정보 저장 및 다음페이지
     btn.addActionListener(new ActionListener() {
    	 @Override
    	 public void actionPerformed(ActionEvent e) {
    		 dto.setMname("스파이더맨 홈커밍");
    		 dto.setTime("09:00");
    		 dto.setTheaternum("1관");
    		 dispose();
    		 new Page7(dto);
    	 }
      });
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}

class movieCheck12 extends JFrame {
	
	movieCheck12(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"스파이더맨 홈커밍","1관","11:30"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
     // 정보 저장 및 다음페이지
     btn.addActionListener(new ActionListener() {
    	 @Override
    	 public void actionPerformed(ActionEvent e) {
    		 dto.setMname("스파이더맨 홈커밍");
    		 dto.setTime("11:30");
    		 dto.setTheaternum("1관");
    		 dispose();
    		 new Page7(dto);
    	 }
      });
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}

class movieCheck13 extends JFrame {
	
	movieCheck13(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"스파이더맨 홈커밍","2관","14:00"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
     // 정보 저장 및 다음페이지
     btn.addActionListener(new ActionListener() {
    	 @Override
    	 public void actionPerformed(ActionEvent e) {
    		 dto.setMname("스파이더맨 홈커밍");
    		 dto.setTime("14:00");
    		 dto.setTheaternum("2관");
    		 dispose();
    		 new Page7(dto);
    	 }
      });
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}

class movieCheck14 extends JFrame {
	
	movieCheck14(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"스파이더맨 홈커밍","2관","16:30"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
     // 정보 저장 및 다음페이지
     btn.addActionListener(new ActionListener() {
    	 @Override
    	 public void actionPerformed(ActionEvent e) {
    		 dto.setMname("스파이더맨 홈커밍");
    		 dto.setTime("16:30");
    		 dto.setTheaternum("2관");
    		 dispose();
    		 new Page7(dto);
    	 }
      });
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}
class movieCheck15 extends JFrame {
	
	movieCheck15(DTO_Movie dto) {
	setTitle("영화저장");
	 JPanel NewWindowContainer = new JPanel();
     setContentPane(NewWindowContainer);

     JButton btn = new JButton("확인");
     Container containe = getContentPane();
      
     containe.add(btn);
     
     String []a = {"영화제목","영화관","영화시간"};
     String [][]b = {{"스파이더맨 홈커밍","3관","19:00"}};
     DefaultTableModel model = new DefaultTableModel(b,a);
     JTable table = new JTable(model);
     JScrollPane sc = new JScrollPane(table);
     add(sc);
     
     // 정보 저장 및 다음페이지
     btn.addActionListener(new ActionListener() {
    	 @Override
    	 public void actionPerformed(ActionEvent e) {
    		 dto.setMname("스파이더맨 홈커밍");
    		 dto.setTime("19:00");
    		 dto.setTheaternum("3관");
    		 dispose();
    		 new Page7(dto);
    	 }
      });
 
     setSize(480,110);
     setResizable(false);
     setVisible(true);
     
	}

}


