package kodlamaio.northwind.api.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.ErrorDataResult;

import org.springframework.http.HttpStatus;
@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UserService userService;
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	public ResponseEntity<?> add(@Valid @RequestBody User user){
		return ResponseEntity.ok(this.userService.add(user));
	}
	
	
	public ResponseEntity<?> getByEmail(@RequestParam String email){
		return ResponseEntity.ok(this.userService.getByEmail(email));
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(
			MethodArgumentNotValidException exceptions){
		HashMap<String,String> validationErrors = new HashMap<String,String>();
		
		for(FieldError error : exceptions.getBindingResult().getFieldErrors()){
			 validationErrors.put(error.getField(), error.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Dağrulama hataları ");
		
		return errors;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
