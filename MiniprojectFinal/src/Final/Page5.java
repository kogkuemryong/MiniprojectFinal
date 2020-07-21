package Final;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// 날짜 선택 페이지
class Page5 extends JFrame implements ActionListener
{
	private Calendar today;												// 현재 날짜/시간
	private Font font;														// 폰트

	private String [] days = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
	private JButton[] calBtn = new JButton[49];					// 버튼 개수
	
	private JLabel lbTitle;													// JLabel 타이틀
	private JTextField tfYear, tfMonth;									// TextField 연도, 월

	private JPanel  plNorth, plCenter;									// 패널 두 개로 구성
	
	private int nYear, nMonth, nDate =0 ;								// 현재 연도, 월, 날짜 

/* 생성자 *///////////////////////////////////////////////////////////////////////////////////////////////////////
	public Page5()
	{
		today = Calendar.getInstance();
		showCalendarFrame();
	}
	
/* 캘린더 Swing *///////////////////////////////////////////////////////////////////////////////////////////////
	public void showCalendarFrame()
	{
/* 첫 번째 패널 2개 - 날짜와 년, 월 */
		lbTitle = new JLabel("날짜를 선택하세요", SwingConstants.CENTER);
		
		nYear = today.get(Calendar.YEAR);
        nMonth = today.get(Calendar.MONTH)+1;					// 1월인 경우 0의 값으로 반환한다. 따라서 +1을 해줘야 한다.
		
        font = new Font("Sherif", Font.BOLD, 15);
		
        tfYear = new JTextField(nYear + " 년 ", 5);
 		tfMonth = new JTextField(nMonth + " 월 ", 3);
		
		// 년,월 콤포넌트 담을 패널 생성
		JPanel ymNorth = new JPanel();
		
		ymNorth.add(tfYear);
		tfYear.setFont(font);
		tfYear.setEnabled(false);											// 선택 비활성화하여 숫자 수정을 불가피한다.
		
		ymNorth.add(tfMonth);
		tfMonth.setFont(font);
		tfMonth.setEnabled(false);										// 선택 비활성화하여 숫자 수정을 불가피한다.

		// 패널로 구성하는 이유: lbTitle을 패널 영역 위에 정렬(출력) 시키기 위해...
		plNorth = new JPanel(new GridLayout(2, 1));
		plNorth.add(lbTitle);
		plNorth.add(ymNorth);
		
		plNorth.setBackground(Color.WHITE);
		ymNorth.setBackground(Color.WHITE);
		
/* 두 번째 패널 */
		plCenter = new JPanel(new GridLayout(7,7));
        font = new Font("바탕체",Font.BOLD,12);
        plCenter.setBackground(Color.WHITE);
        
        gridInit();
        calSet();
        hideInit();
		
/* 컨테이너에 두개의 패널 담기 */
		Container container = getContentPane();
		container.add(plNorth , BorderLayout.NORTH);
		container.add(plCenter , BorderLayout.CENTER);
	
/* 컨태이너 제목, 크기 */
		setSize(800, 500);
		setLocation(300, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{	
		DTO_Movie dto = new DTO_Movie();
		dto.setMdate("6월"+ e.getActionCommand()+"일");
		System.out.println("6월"+ e.getActionCommand()+"일");
		new Page6(dto);
		dispose();
			
	}

/* plCenter에 버튼 붙이기 *///////////////////////////////////////////////////////////////////////////////////////
	public void gridInit()
	{
		plCenter.setBackground(Color.WHITE);
	        
		for(int i = 0 ; i < days.length; i++)	
		{
			plCenter.add(calBtn[i] = new JButton(days[i]));
//			calBtn[i].setEnabled(false);
		}
		for(int i = days.length; i < 49; i++)
		{
			plCenter.add(calBtn[i] = new JButton(" "));
	        calBtn[i].addActionListener(this);
		}              
	}
	
/* 달력 세팅 */////////////////////////////////////////////////////////////////////////////////////////////////////
	 public void calSet()
	 {
		 // 년, 월, 일 구하기
		 nYear = today.get(Calendar.YEAR);
		 nMonth = today.get(Calendar.MONTH)+1;	
		 nDate = today.get(Calendar.DATE);
		 int dayOfWeek = today.get(Calendar.DAY_OF_WEEK)-1;		// 요일을 나타냅니다. 값은, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY 및 SATURDAY가 됩니다.
        
		 today.set(Calendar.YEAR, nYear);										// 해를 나타냅니다.
		 today.set(Calendar.MONTH, (nMonth-1));							// 달을 나타냅니다.
		 today.set(Calendar.DATE, 1);											// 달의 날을 나타냅니다. 이것은 DAY_OF_MONTH와 같게 됩니다. 달의 최초의 날에는 값 1 이 사용됩니다. 	        
		
         calBtn[0].setForeground(new Color(255,0,0));						// 일요일 "일"  RGB의 색 넣는다.
         calBtn[6].setForeground(new Color(0,0,255));						// 토요일 "토"
         
         int cntday=0;
         int cntweek=0;
         
         for(int a = today.getFirstDayOfWeek(); a < dayOfWeek; a++)// 주의 최초의 날이 무엇으로 있는지를 취득합니다. 예를 들어 미국에서는 SUNDAY, 프랑스에서는 MONDAY 입니다.
         {
        	 cntday++; 
         }  			
         
     	// 일요일부터 그 달의 첫 시작 요일까지 빈칸으로 세팅
         cntweek=cntday;

         for(int b = 0; b < cntweek; b++)
         {
                calBtn[b+7].setText(" ");
         }
         
         // 달의 날을 나타냅니다. 이것은 DATE와 같게 됩니다. 달의 최초의 날에는 값 1 이 사용됩니다.
         // 1일부터 마지막 날까지 반복
         for(int c=today.getMinimum(Calendar.DAY_OF_MONTH);
        		 c<=today.getMaximum(Calendar.DAY_OF_MONTH);
        		 c++)
         {
        	 if(( c != 1) && (c < nDate+5))	
        	 {
        		 calBtn[c+6+cntweek].setForeground(new Color(0,0,0));
        		 
        	 	 if((c+cntweek-1)%7==0)  												// 일요일
        	 	 {
        	 		 calBtn[c+6+cntweek].setForeground(new Color(255,0,0));
                 }
        	 	 if((c+cntweek)%7==0)  													// 토요일
                 {
        	 		 calBtn[c+6+cntweek].setForeground(new Color(0,0,255));
                 }
             }
             else
             {
            	 calBtn[c+6+cntweek].setForeground(new Color(211,211,211));
             }
                /*
                 * 요일을 찍은 다음부터 계산해야 하니 요일을 찍은 버튼의 갯수를 더하고
                 * 인덱스가 0부터 시작이니 -1을 해준 값으로 연산을 해주고
                 * 버튼의 색깔을 변경해준다. 
                 */
                calBtn[c+6+cntweek].setText((c)+" ");
         }
   }

/* 비활성화 *///////////////////////////////////////////////////////////////////////////////////////////////////// 
	 public void hideInit()
	 {
         for(int i = 0 ; i < calBtn.length; i++)		 									// 날짜가 찍히지 않은 나머지 버튼을 비활성화 시킨다. 
         {
                if((calBtn[i].getText()).equals(" "))
                {
                       calBtn[i].setEnabled(false);
//                     calBtn[i].setBackground(Color.WHITE);
                }
                calBtn[i].setBackground(Color.WHITE);								// 버튼 색상
                calBtn[i].setBorderPainted(false);										// 버튼 테두리 없앰
         }
	 }
}
