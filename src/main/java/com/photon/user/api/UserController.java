package com.photon.user.api;

import com.photon.user.dto.UserDTO;
import com.photon.user.entity.User;
import com.photon.user.services.UserQueryService;
import com.photon.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
 private UserService userService;

	@Autowired
	private UserQueryService userQueryService;
	
	@PostMapping("/registration")
	public String  userRegistration(@RequestBody User user) {
		return userService.UserRegistration(user);
		
	}
	
	@PostMapping("/login")
	public String  userLogin(@RequestBody User user) {
		return userService.UserLogin(user.getUserEmailId(),user.getPassword());
	
	}
	
	
	@PostMapping("/logout")
	public String  userLogout(@RequestBody User user) {
		return userService.userLogout(user);
		
	}


	@GetMapping("/{id}")
	public UserDTO getUser(@PathVariable(name = "id") int userId) {
		return userQueryService.fetchById(userId);
	}
	
//	@PostMapping("/product")
//	public ResponseEntity<String>  userProduct(@ModelAttribute Product user,@RequestParam("file") MultipartFile file) throws IOException {
//
//
//		String userProduct = userService.userProduct(user,file);
//
//		return ResponseEntity.status(HttpStatus.OK).body(userProduct);
//	}
	

	//@GetMapping(value={"/product", "/download"}) 
//	@GetMapping("/product")
//	public ResponseEntity<Product>  getProduct(@RequestParam int id ) {
//
//				product = userService.getProduct(id);
//
//				return ResponseEntity.status(HttpStatus.OK).body(product);
//
//	}
//
//
//	@GetMapping("/download")
//	public ResponseEntity<?>  getProductdownload(@RequestParam String  filename ) {
//
//				 byte[] downloadImage = userService.downloadImage(filename);
//
//				return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(downloadImage);
//
//	}
	
	
	
}
