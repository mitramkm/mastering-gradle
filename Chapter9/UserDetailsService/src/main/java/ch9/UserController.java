package ch9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
	
//	@Value("${spring.application.name}")
//	private static String CONTEXT;
	
	public static final String SERVICE_BASE = "/userdetails";
	
	@Autowired
	private UserRepo repo;
	
	@RequestMapping(value=SERVICE_BASE, method=RequestMethod.GET)
	public @ResponseBody List<User> getAllUsers(){
		return (List<User>) repo.findAll();
	}
	
	@RequestMapping(value=SERVICE_BASE+"/{id}", method=RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable("id") String  userId){
		User u = repo.findByUserid(userId);
		System.out.println("User|" + u);
		return u;
	}
	
	@RequestMapping(value=SERVICE_BASE, method=RequestMethod.POST)
	public @ResponseBody User saveUser(@RequestBody User u){
		return repo.save(u);
	}

}
