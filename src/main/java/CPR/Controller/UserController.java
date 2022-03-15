package CPR.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import CPR.Boundary.NewUserBoundary;
import CPR.Boundary.UserBoundary;

@RestController
public class UserController {
	
	//POST request, path="/api/users"
	//Accept: NewUserBoundary
	//Return: UserBoundary
	@RequestMapping(
			path = "/api/users",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Object createUser(@RequestBody NewUserBoundary new_User_Boundary) {
		System.out.println("USER_CONTROLLER /api/users CREATE USER TYPE_POST called " + new_User_Boundary.toString());
		return new_User_Boundary;
		
		// TODO: Implement creating user
	}
	
	//POST request, path="/api/users/login"
	//Accept: UserBoundary
	//Return: Object
	@RequestMapping(
			path="/api/users/login",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Object login(@RequestBody UserBoundary user_Boundary) {
		System.out.println("USER_CONTROLLER /api/users/login LOGIN TYPE_POST called LOGIN INFO: " + user_Boundary.toString());
		return user_Boundary;
		// TODO: IMPLEMENT LOGIN
	}
	
	//GET request, path="/api/users/{username}"
	//Accept: Nothing
	//Return: UserBoundary
	@RequestMapping(
			path = "/api/users/{username}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getUser(@PathVariable("username") String username) {
		System.out.println("USER_CONTROLLER /api/users/" + username + " GET USER TYPE_GET called");
		return new NewUserBoundary(username, "passwordstub");
		
		// TODO: Implement get user
	}
	
	//PUT request, path="/api/users"
	//Accept: Updated UserBoundary of existing user
	//Return: Nothing
	@RequestMapping(
			path="/api/users",
			method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateUser(@RequestBody UserBoundary user_Boundary) {
		System.out.println("USER_CONTROLLER /api/users UPDATE USER TYPE_PUT called " + user_Boundary.toString());
		
		//  TODO: Implement update user
	}
}
