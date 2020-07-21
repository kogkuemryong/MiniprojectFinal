package Final;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;


// 예매내역 출력 페이지
class Page8 extends JFrame{

	Page8(DTO_Movie dto){
	
	// 영화 포스터 이미지 파일 아이콘화
	// ** 등록한 것 받아오던, 새로 다 만들어주던 해야함.
	// 버튼말고 이미지 자체를 삽입하고 싶은데?
	ImageIcon poster = new ImageIcon("./images/"+dto.mname+".jpg");
	JLabel movieImg = new JLabel(poster);
	JButton endButton = new JButton("예매 확정");
	endButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			DAO dao = new DAO();
			System.out.println(dto.name);
			dao.insert(dto);
			dispose();
			
		}
		
	});
	

	// 예매 정보 테이블
	String[] colHeads = {"영화","날짜","시간", "관/좌석"};
	Object[][] data = {
			{dto.getMname(), dto.getMdate(), dto.getTime() ,dto.getTheaternum() +"/"+ dto.getSeatnum() }
			};
	
	JTable table = new JTable(data, colHeads); 
	JScrollPane scrollpane = new JScrollPane(table);
	scrollpane.setPreferredSize(new Dimension(400,40)); //표 크기 설정
	
	// Panel1 : 영화 포스터 패널
	JPanel panelPoster = new JPanel();
	panelPoster.add(movieImg);
	
	// Panel2 : 예매 정보 패널 + 확인버튼
	JPanel panelInfo = new JPanel();
	panelInfo.add(scrollpane);
	panelInfo.add(endButton);
	
	// 각각 위치설정
//	showmanImg.setBounds(300, 100, 100, 200);
//	scrollpane.setBounds(300, 400, 200, 90);
//	endButton.setBounds();

	// 컨테이너 불러오고 자동레이어, 애드
	Container container = getContentPane();
	container.add(panelPoster, BorderLayout.NORTH);
	container.add(panelInfo, BorderLayout.CENTER);
	
	
	// 컨테이너 제목, 크기, 종료, 보이기
	setTitle("예매 확인");
	setSize(650,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	setVisible(true);  
	
	}


}

