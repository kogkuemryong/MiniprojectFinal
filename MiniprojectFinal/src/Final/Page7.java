package Final;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


// 예매 좌석 선택
class Page7 extends JFrame{
	Font font;
	String result;
	JButton back, seatD;
	JButton[] seat = new JButton[50];
//	int index = 0;
	DAO dao ;
	BookSeat bs;
	int[] cnt = new int[30];
	String index;
	
	
	   Page7(DTO_Movie dto){
		      Container container = getContentPane();
		      container.setLayout(new BorderLayout(5, 10));
		      
		      font = new Font("고딕", Font.BOLD, 30);
		      //패널1 상단 - 스크린 위치
		      JPanel jp1 = new JPanel();
		      jp1.setLayout(new FlowLayout(FlowLayout.CENTER));

		      
		      JLabel screen = new JLabel("SCREEN");
		      jp1.add(screen);
		      screen.setFont(font);
		      
		      jp1.setBackground(Color.white);
		      
		      //패널2 중간 - 좌석
		      JPanel jp2 = new JPanel();
		      jp2.setLayout(new GridLayout(3,10,10,10)); // 5행10열

		       for(int i=0;i<30;i++) {
		         seat[i] = new JButton(""+(i+1));
		         jp2.add(seat[i]);
		       }
		       jp2.setBackground(Color.white);

		      
		      

		      //패널3 왼쪽  A~E열 표시 라벨
		      JPanel jp3 = new JPanel();
		   
		      jp3.setLayout(new GridLayout(3,1,10,10));
		      JButton s0 = new JButton("0");
		      jp3.add(s0);
		      s0.setBackground(Color.white);
		      s0.setForeground(Color.gray);
		      
		      
		      JButton s1 = new JButton("10");
		      jp3.add(s1);
		      s1.setBackground(Color.white);
		      s1.setForeground(Color.gray);
		      
		      JButton s2 = new JButton("20");
		      jp3.add(s2);
		      s2.setBackground(Color.white);
		      s2.setForeground(Color.gray);
		      
		      jp3.setBackground(Color.white);
		      
		      //패널4 오른쪽 안내표시
		      JPanel jp4 = new JPanel();
		      jp4.setLayout(new FlowLayout());
		      
		      jp4.setBackground(Color.white);
		      
		      JPanel jp5 = new JPanel();
		      jp5.setLayout(new FlowLayout());
		      
		      jp5.setBackground(Color.white);
		      
		      back = new JButton("뒤로 가기");
		      jp5.add(back);
		      back.setBackground(Color.white);
		      
		      jp5.add(new JLabel("                                       "));
		      
		      seatD = new JButton("좌석 확정");
		      jp5.add(seatD);
		      seatD.setBackground(Color.white);

		      
		      


		      //패널 위치 조정
		         container.setBackground(Color.WHITE);
		         container.add(jp1, BorderLayout.NORTH);
		         container.add(jp2, BorderLayout.CENTER);
		         container.add(jp3, BorderLayout.WEST);
		         container.add(jp4, BorderLayout.EAST);
		         container.add(jp5, BorderLayout.SOUTH);
		         
		      // 리스너
		         seatD.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					         new BookSeat();
					         dispose();
					         new Page8(dto);
					}
		         });
		         
		         back.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
						     dispose();
						     new Page6(dto);
						}
			     });
		         
		         
		          for(int i = 0; i < 30; i++) {
		            seat[i].addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {

						      dao = new DAO();
						      index = e.getActionCommand();
						         
						       switch (index) {
						       
						       case "1": 
						            if (cnt[0] % 2 == 0) {
						               seat[0].setBackground(Color.RED);
						               System.out.println(0);                  
						            }               
						            else {
						               seat[0].setBackground(Color.LIGHT_GRAY);
						               System.out.println(1);
						            }
						            System.out.println(index);
						            dto.setSeatnum(index);
						            cnt[0] ++ ;
						            break;
						         
						      case "2":
						         if (cnt[1] % 2 == 0) {
						            seat[1].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[1].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[1] ++ ;
						         break;
						         
						   
						         
						      case "3":
						         if (cnt[2] % 2 == 0) {
						            seat[2].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[2].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[2] ++ ;
						         break;
						   
						      case "4":
						         if (cnt[3] % 2 == 0) {
						            seat[3].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[3].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[3] ++ ;
						         break;
						      
						      case "5":
						         if (cnt[4] % 2 == 0) {
						            seat[4].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[4].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[4] ++ ;
						         break;
						      
						      case "6":
						         if (cnt[5] % 2 == 0) {
						            seat[5].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[5].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[5] ++ ;
						         break;
						      
						      case "7":
						         if (cnt[6] % 2 == 0) {
						            seat[6].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[6].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[6] ++ ;
						         break;
						      
						      case "8":
						         if (cnt[7] % 2 == 0) {
						            seat[7].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[7].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[7] ++ ;
						         break;
						      
						      case "9":
						         if (cnt[8] % 2 == 0) {
						            seat[8].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[8].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[8] ++ ;
						         break;
						      
						      case "10":
						         if (cnt[9] % 2 == 0) {
						            seat[9].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[9].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[9] ++ ;
						         break;
						      
						      case "11":
						         if (cnt[10] % 2 == 0) {
						            seat[10].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[10].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[10] ++ ;
						         break;
						      
						      case "12":
						         if (cnt[11] % 2 == 0) {
						            seat[11].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[11].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[11] ++ ;
						         break;
						      
						      case "13":
						         if (cnt[12] % 2 == 0) {
						            seat[12].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[12].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[12] ++ ;
						         break;
						      
						      case "14":
						         if (cnt[13] % 2 == 0) {
						            seat[13].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[13].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[13] ++ ;
						         break;
						      
						      case "15":
						         if (cnt[14] % 2 == 0) {
						            seat[14].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[14].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[14] ++ ;
						         break;
						      
						      case "16":
						         if (cnt[15] % 2 == 0) {
						            seat[15].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[15].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[15] ++ ;
						         break;
						      
						      case "17":
						         if (cnt[16] % 2 == 0) {
						            seat[16].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[16].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[16] ++ ;
						         break;
						      
						      case "18":
						         if (cnt[17] % 2 == 0) {
						            seat[17].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[17].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[17] ++ ;
						         break;
						      
						      case "19":
						         if (cnt[18] % 2 == 0) {
						            seat[18].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[18].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[18] ++ ;
						         break;
						      
						      case "20":
						         if (cnt[19] % 2 == 0) {
						            seat[19].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[19].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[19] ++ ;
						         break;
						      
						      case "21":
						         if (cnt[20] % 2 == 0) {
						            seat[20].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[20].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[20] ++ ;
						         break;
						      
						      case "22":
						         if (cnt[21] % 2 == 0) {
						            seat[21].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[21].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[21] ++ ;
						         break;
						      
						      case "23":
						         if (cnt[22] % 2 == 0) {
						            seat[22].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[22].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[22] ++ ;
						         break;
						      
						      case "24":
						         if (cnt[23] % 2 == 0) {
						            seat[23].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[23].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[23] ++ ;
						         break;
						      
						      case "25":
						         if (cnt[24] % 2 == 0) {
						            seat[24].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[24].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[24] ++ ;
						         break;
						      
						      case "26":
						         if (cnt[25] % 2 == 0) {
						            seat[25].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[25].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[25] ++ ;
						         break;
						      
						      case "27":
						         if (cnt[26] % 2 == 0) {
						            seat[26].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[26].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[26] ++ ;
						         break;
						      
						      case "28":
						         if (cnt[27] % 2 == 0) {
						            seat[27].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[27].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[27] ++ ;
						         break;
						      
						      case "29":
						         if (cnt[28] % 2 == 0) {
						            seat[28].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[28].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[28] ++ ;
						         break;
						      
						      case "30":
						         if (cnt[29] % 2 == 0) {
						            seat[29].setBackground(Color.RED);
						            System.out.println(0);
						         }else {
						            seat[29].setBackground(Color.LIGHT_GRAY);
						            System.out.println(1);
						         }
						         dto.setSeatnum(index);
						         cnt[29] ++ ;
						         break;
						      
						       
						      }   
						}
		            	
		            });
		         }
		         
		      //컨테이너박스
		         setTitle("SCREEN"); 
		         setSize(800,400);
		         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		         setVisible(true);
		         
		 }
}
