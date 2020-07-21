package Final;


	
	import java.awt.Container;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

	class BookSeat extends JFrame implements ActionListener{
		JButton ok;
		public BookSeat() {
			JLabel label = new JLabel("예약이 완료되었습니다.");
			 ok = new JButton("확인");
			
			Container container = getContentPane();
			
			container.setLayout(new FlowLayout(FlowLayout.CENTER));
			
			container.add(label);
			container.add(ok);
			
			ok.addActionListener(this);
			
			setTitle("");
			setSize(300,100); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			e.getActionCommand();
			dispose();

		}

	}

	class AlreadySeat extends JFrame implements ActionListener{
		JButton error;
		AlreadySeat(){
			
			JLabel label = new JLabel("이미 예약된 자석입니다.");
			 error = new JButton("확인");
			
			Container container = getContentPane();
			
			container.setLayout(new FlowLayout(FlowLayout.CENTER));
			
			container.add(label);
			container.add(error);
			
			error.addActionListener(this);
			
			setTitle("");
			setSize(300,100); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			e.getActionCommand();
			dispose();

		}

	}



