package pl.userService.Service;

import org.springframework.stereotype.Service;
import pl.userService.Model.*;
import pl.userService.Repository.UserDao;

import java.time.LocalDate;
import java.util.UUID;

import static pl.userService.Model.Language.*;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserResponse addUser(UserRequest userRequest) {
        UserEntity user = UserEntity.create(UUID.randomUUID(),"worscik","Mateusz", LocalDate.now(),null,0, PL);
        userDao.addUser(user);
        UserDto userDto = UserDto.create(user.getExternalId(), user.getLogin(), user.getName());
        return new UserResponse(userDto);
    }

    @Override
    public UserResponse updateUser() {
        return null;
    }

    @Override
    public UserDto getUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public UserResponse getUsers() {
        return null;
    }

    @Override
    public UserResponse removeUser() {
        return null;
    }
}
