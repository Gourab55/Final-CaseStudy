package com.user.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.user.entity.User;

@Service
public class UserService implements IUserService{

	
	@Autowired
	IUserRepo iuserRepo;
	
	
	@Override
	public Integer saveUser(User user) {
		
		User saveuser=iuserRepo.save(user);
		return saveuser.getId();
	}


//	@Override
//	public Boolean Signin(String username, String password) {
//		
//		List<User> alluser= iuserRepo.findAll();
//		if(username!=null && password!= null ) {
//			alluser=alluser.stream()
//					.filter(bo ->bo.getUsername().equals(username))
//					.filter(bo -> bo.getClass().equals(password))
//					
//					.collect(Collectors.toList());
//		}
//		
//		
//     }

}
