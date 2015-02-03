package smm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import smm.model.User;
import smm.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {

	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@RequestMapping("/{id}/showUser")
	public String showUser(@PathVariable String id, HttpServletRequest request) {
		User u = userService.getUserById(id);
		request.setAttribute("user", u);
		return "showUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request){
		String username = (String) request.getAttribute("username");
		String password = (String) request.getAttribute("password");
		System.out.println("=========================");
		System.out.println(username);
		System.out.println(password);
		System.out.println("=========================");
		User user = new User();
		user.setName(username);
		user.setPwd(password);
		userService.insert(user);
		return "addUser";
	}

}
