package kr.co.jhta;

import java.util.List;

import kr.co.jhta.dao.UserDao;
import kr.co.jhta.vo.User;

public class Main {
	
	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		
//		System.out.println("새 사용자 등록하기");
//		User user1 = new User("hong3", "홍길상", "zxcv1234", "hong3@naver.com");
//		userDao.insertUser(user1);
//		System.out.println("새 사용자 등록이 완료되었습니다.");
		
		System.out.println("모든 사용자 조회하기");	
		List<User> users1  = userDao.getAllUsers();
		for (User user:users1) {
			System.out.println(user.getId()+ " , " + user.getName());
		}
		System.out.println();
		
		System.out.println("특정 아이디의 사용자 조회하기");
		User user2 = userDao.getUserById("hong");
		System.out.println(user2);
		if (user2 != null) {
			System.out.println(user2.getId() + ", " + user2.getName() + ", " + user2.getEmail());
		}else {
			System.out.println("지정된 아이디의 사용자 정보가 존재하지 않습니다.");
		}
		
		System.out.println("전체 사용자 수 조회하기");
		int userCount = userDao.getUsersCount();
		System.out.println("전체 사용자수: " + userCount);
		System.out.println();
		
		System.out.println("특정 이메일의 사용자 조회하기");
		User user3 = userDao.getUserByEmail("hong3@naver.com");
		System.out.println(user3);
		if (user3 != null) {
			System.out.println(user3.getId() + ", " + user3.getName() + ", " + user3.getEmail());
		}else {
			System.out.println("지정된 이메일의 사용자 정보가 존재하지 않습니다.");
		}

		System.out.println("특정 이름의 사용자 조회하기");	
		List<User> users2  = userDao.getUsersByName("홍길상");
		for (User user:users2) {
			System.out.println(user.getId()+ " , " + user.getName());
		}
		System.out.println();
		
		System.out.println("특정 아이디의 정보 삭제하기");
		 userDao.deleteUserById("aldus209");
		
		System.out.println("특정 아이디의 정보 변경하기");
		User user5 = new User("hong3", "홍길이", "zxcv1234", "hong44@naver.com");
		userDao.updateUser(user5);
	}

}









