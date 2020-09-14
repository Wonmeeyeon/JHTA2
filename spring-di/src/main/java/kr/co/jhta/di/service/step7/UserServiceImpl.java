package kr.co.jhta.di.service.step7;

import java.util.ArrayList;
import java.util.List;

import kr.co.jhta.di.service.vo.User;

public class UserServiceImpl implements UserService{
	
	
	@Override
	public List<User> getAllUser() {
		
		List<User> users = new ArrayList<>();
		User user1 = new User("1", "홍길동", "010-1111-2222", "sms");
		User user2 = new User("2", "김길동", "010-5541-2222", "katalk");
		User user3 = new User("3", "오길동", "010-1551-2222","sms");
		User user4 = new User("4", "박길동", "010-5651-2222","sms");
		User user5 = new User("5", "박금동", "010-9874-2222","katalk");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		
		return users;
	}

}
