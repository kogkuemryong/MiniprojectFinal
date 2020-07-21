package Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	//BasicDataSource ds;
	
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL= "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "scott"; //DB ID  
    private static final String PASS = "tiger"; //DB 패스워드
    ArrayList<DTO_Member> listMember = new ArrayList<DTO_Member>();
	ArrayList<DTO_Movie> listMovie = new ArrayList<DTO_Movie>();
	

	
    public  DAO() {

    	try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    // 출력
    public ArrayList<DTO_Member> selectMember() {
		Connection conn = null;
		String sql = "select * from member";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
       //conn = ds.getConnection();
			conn = DriverManager.getConnection(URL, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DTO_Member dto = new DTO_Member();
				
				dto.setName(rs.getString("name"));
				dto.setTel(rs.getString("tel"));
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				
				listMember.add(dto);
			}
			
			return listMember;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) { pstmt.close(); }
				if(conn != null) { conn.close(); }
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return null;
	}
 
    // 회원가입 
    public void insert(DTO_Member dto) {
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//conn = ds.getConnection();
			conn = DriverManager.getConnection(URL,USER, PASS);
			String sql = "insert into member values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2,dto.getTel());
			pstmt.setString(3,dto.getId());
			pstmt.setString(4,dto.getPw());
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("회원가입 되었습니다.");
			}else {
				System.out.println("회원가입 실패하였습니다. \n 다시 입력해주세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) { pstmt.close(); }
				if(conn != null) { conn.close(); }
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}

    // 예매 확정
    public void insert(DTO_Movie dto) {
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//conn = ds.getConnection();
			conn = DriverManager.getConnection(URL,USER, PASS);
			String sql = "insert into movie values(?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dto.getName());
			pstmt.setString(2,dto.getMname());
			pstmt.setString(3,dto.getMdate());
			pstmt.setString(4,dto.getTime());
			pstmt.setString(5,dto.getTheaternum());
			pstmt.setString(6,dto.getSeatnum());
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("예매 확인");
			}else {
				System.out.println("예매 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) { pstmt.close(); }
				if(conn != null) { conn.close(); }
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
   
    // 로그인 
    public int login(String id, String passwd){
           
    	    Connection conn= null;
    	    PreparedStatement pstmt = null;
    	    ResultSet rs =null;
            String sql="";
            String DBpasswd="";
    	    int x = -1;
    	       
            try{
                conn = DriverManager.getConnection(URL,USER, PASS);
                sql ="select pw from member where id = ?";
    	            pstmt =conn.prepareStatement(sql);
    	            pstmt.setString(1, id);
    	            rs=pstmt.executeQuery();
    	             
                if(rs.next()){
    	          DBpasswd =rs.getString("pw");
    	        if(DBpasswd.equals(passwd))
    	          x=1; //인증성공
               }else
    	           x=-1; //인증 실패
    	       }catch(Exception e){
    	            e.printStackTrace();
    	       }finally{
    				try {
    					if(pstmt != null) { pstmt.close(); }
    					if(conn != null) { conn.close(); }
    				} catch (SQLException e) {
    					System.out.println(e.getMessage());
    				}
    			}
    	       return x;
    	    }
    
    
    // 아이디 중복
    public int idCheak(String id){
        
	    Connection conn= null;
	    PreparedStatement pstmt = null;
	    ResultSet rs =null;
        String sql="";
	    int x = -1;
	       
        try{
            conn = DriverManager.getConnection(URL,USER, PASS);
            sql ="select * from member where id = ?";
	            pstmt =conn.prepareStatement(sql);
	            pstmt.setString(1, id);
	            rs=pstmt.executeQuery();
	             
            if(rs.next()){
	          x=1; // 중복된 아이디
           }else
	          x=-1; //사용 가능한 아이디
	       }catch(Exception e){
	            e.printStackTrace();
	       }finally{
				try {
					if(pstmt != null) { pstmt.close(); }
					if(conn != null) { conn.close(); }
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
	       return x;
	    }
 
    public ArrayList<DTO_Movie> selectMovie() {
		Connection conn = null;
		String sql = "select * from movie";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
            // conn = ds.getConnection();
			conn = DriverManager.getConnection(URL,USER, PASS);
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DTO_Movie dto = new DTO_Movie();
				dto.setName(rs.getString("name"));
				dto.setMname(rs.getString("mname"));
				dto.setMdate(rs.getString("mdate"));
				dto.setTime(rs.getString("time"));
				dto.setTheaternum(rs.getString("theaternum"));
				dto.setSeatnum(rs.getString("seatnum"));
				
				listMovie.add(dto);
			}
			
			return listMovie;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) { pstmt.close(); }
				if(conn != null) { conn.close(); }
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return null;
	}
    
    // 회원탈퇴
    public void deleteMember(String id){
        Connection conn=null;
    	PreparedStatement pstmt =null;
    	String sql = "";
    	
    

    	    try{
    	        conn = DriverManager.getConnection(URL,USER, PASS);
    	        sql = "delete from member where id=?";
    	        pstmt =conn.prepareStatement(sql);
    	        pstmt.setString(1, id);
    	        pstmt.executeUpdate();
 
    	    }catch(Exception e){
    	        e.printStackTrace();
    	    
    	    }finally{
    			try {
    				if(pstmt != null) { pstmt.close(); }
    				if(conn != null) { conn.close(); }
    			} catch (SQLException e) {
    			  System.out.println(e.getMessage());
    			}
    		}
    	   }
    
/*
// 좌석 입력
    public void insertMovieSeat(DTO_Movie dto) {
    	
		Connection conn = null;
		String sql = "insert into Movie(seatnum) values(?)";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			
			conn = DriverManager.getConnection(url, userid, passwd);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getSeatnum());
			
			result = pstmt.executeUpdate();
			
			if(result == 1) {
			}
			else{
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) { pstmt.close(); }
				if(conn != null) { conn.close(); }
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
    
    
	public void deleteMovieSeat(DTO_Movie dto) {
    	
		Connection conn = null;
		String sql = "delete from Movie(seatnum) values(?)";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			
			conn = DriverManager.getConnection(url, userid, passwd);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getSeatnum());
			
			result = pstmt.executeUpdate();
			
			if(result == 1) {
			}
			else{
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) { pstmt.close(); }
				if(conn != null) { conn.close(); }
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
*/
    
    
    
    
    
    
    
}