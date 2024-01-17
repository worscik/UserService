package pl.userService.Service;

import pl.userService.Model.UserDto;
import pl.userService.Model.UserRequest;
import pl.userService.Model.UserResponse;

public interface UserService {

    UserResponse addUser(UserRequest userRequest);
    UserResponse updateUser();
    UserDto getUserById(int id);
    UserResponse getUsers();
    UserResponse removeUser();


}
