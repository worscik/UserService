package pl.userService.Repository;

import pl.userService.Model.UserDto;
import pl.userService.Model.UserEntity;
import pl.userService.Model.UserRequest;

public interface IUserDao {

    void addUser(UserEntity UserEntity);

    UserDto updateUser(UserRequest userRequest);

    UserDto deleteUser(UserRequest userRequest);

    UserDto findUserById(int id);


}
