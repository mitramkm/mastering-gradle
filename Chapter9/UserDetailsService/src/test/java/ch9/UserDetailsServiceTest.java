package ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserDetailsServiceTest {

	private String URL = "http://localhost:8080/userdetails";
	private RestTemplate resttemplate;

	@BeforeClass
	public void setup() {
		resttemplate = new RestTemplate();
//		try {
//			populateDB();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		if(System.getProperty("url") != null && System.getProperty("url").length()!= 0){
			URL = System.getProperty("url").trim();
			System.out.println(URL);
		}
	}

/*	private void populateDB() throws SQLException {
		Connection con = null ;
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:~/data/test;AUTO_SERVER=TRUE", "sa", "sa");
			PreparedStatement prep = con
					.prepareStatement("INSERT INTO User (userid, name, email) VALUES (?,?,?)");
			con.setAutoCommit(true);
			prep.setString(1, "User1");
			prep.setString(2, "User user");
			prep.setString(3, "user@abc.com");
			
			prep.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
*/
	@Test(dependsOnMethods="createUser")
	public void getUsers() {
		User[] response = resttemplate.getForObject(URL, User[].class);
		Assert.assertEquals(response.length, 1);
	}
	
	@Test
	public void createUser() {
		User request = new User("User1", "User user", "user@abc.com");
		User response = resttemplate.postForObject(URL, request, User.class);
		Assert.assertEquals(response.getEmail(), "user@abc.com");
	}

}
