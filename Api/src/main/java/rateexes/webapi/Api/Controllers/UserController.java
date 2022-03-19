package rateexes.webapi.Api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rateexes.webapi.Data.Entities.User;
import rateexes.webapi.Data.Repositories.Contracts.IUserRepository;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private IUserRepository userRepo; 
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findUserById(@PathVariable(value = "id") long id){
		var user = userRepo.findById(id);
		
		if(user.isPresent()) 
		{
			return ResponseEntity.ok().body(user.get());
		}
		else 
		{
			return ResponseEntity.notFound().build();
		}
	}
}
