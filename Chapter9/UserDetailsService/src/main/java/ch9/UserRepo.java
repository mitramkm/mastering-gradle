package ch9;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
	
	public User findByUserid(String userid);
}
