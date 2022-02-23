package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.jwt.util.JwtUtil;
import app.core.jwt.util.JwtUtil.ClientDetails;
import app.core.login.ClientType;
import app.core.login.LoginManager;

@RestController
public class LoginController {
	
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private LoginManager loginManager;
	
	@PutMapping("/login")
	public String login(@RequestParam String email , @RequestParam String password, @RequestParam ClientType clientType, @RequestParam int clientId) {
		if(loginManager.login(email,password,clientType, clientId) != null ){
			ClientDetails details = new ClientDetails(email,clientType,clientId); 
			return jwtUtil.generateToken(details);
		}else {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED,"login failed -bad credentials wrong email or password");
		}
	}
}
