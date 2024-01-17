package pl.userService.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.userService.Model.UserDto;
import pl.userService.Model.UserEntity;
import pl.userService.Model.UserRequest;
import pl.userService.Model.UserResponse;
import pl.userService.Service.UserServiceImpl;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class WebController {

    private final UserServiceImpl userService;

    public WebController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public ResponseEntity<UserResponse> addUser(@RequestBody UserRequest userRequest) {
        UserResponse userResponse = userService.addUser(userRequest);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @PostMapping("/updateUser")
    public ResponseEntity<UserResponse> updateUser() {
        return null;
    }

    @GetMapping("/getUserById")
    public UserDto getUserById(@RequestParam int id) {
        System.out.println("Connect from todo list service.");
        UserDto user = userService.getUserById(id);
        return user;
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<UserEntity>> getUsers() {
        return null;
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<UserResponse> deleteUser() {
        return null;
    }


    //TODO SERWIS DO HASEL I RESETOWANIA
}