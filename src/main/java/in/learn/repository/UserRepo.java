package in.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.learn.entity.User;


public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByEmail(String email);
	
	public User findByEmailAndPwd(String email, String pwd);

}
