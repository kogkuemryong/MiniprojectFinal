package Final;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



class TicketingController extends JFrame{
	DAO dao = new DAO();
	
	// 회원 비밀번호 찾기
	public void searchPW(String ID, String TEL) {
		ArrayList<DTO_Member> listMember = dao.selectMember();
		Iterator<DTO_Member> itr = listMember.iterator();
		while(itr.hasNext()) {
			DTO_Member tmpMember = itr.next();
			if(ID.equals(tmpMember.getId())) {
				checkPhonenum(tmpMember, TEL);
				return ;
			}
		}
		JOptionPane.showMessageDialog(null, "존재하지 않는 ID입니다.");
		return ;
	}
	
	
	// 핸드폰번호 확인하기
	public void checkPhonenum(DTO_Member member, String TEL){
		String tmpPhoneNum = TEL ;
		if (member.getTel().equals(tmpPhoneNum)) {
			JOptionPane.showMessageDialog(null,"비밀번호: " + member.getPw());
			
		}else {
			JOptionPane.showMessageDialog(null, "일치하는 정보가 없습니다.");
		}
		
		return;
	}
	
}