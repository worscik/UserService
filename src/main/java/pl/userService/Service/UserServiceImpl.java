package pl.userService.Service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import pl.userService.Model.*;
import pl.userService.Repository.UserDao;

import java.time.LocalDate;
import java.util.UUID;

import static pl.userService.Model.Language.PL;
import static pl.userService.Model.UserRole.ADMIN;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserResponse addUser(UserRequest userRequest) {
        UserEntity user = UserEntity.create(UUID.randomUUID(), userRequest.getLogin(), userRequest.getPassword(),
                userRequest.getName(), LocalDate.now(), null, 0, PL, ADMIN);
        userDao.addUser(user);
        UserDto userDto = UserDto.create(user.getId(), user.getLogin(), user.getName());
        return new UserResponse(userDto);
    }

    @Override
    public UserResponse updateUser() {
        return null;
    }

    @Override
    public UserDto getUserById(int id) {
        UserEntity user = userDao.findUserById(id);
        UserDto userDto = UserDto.create(user.getId(), user.getName(), user.getLogin());
        return userDto;
    }

    @Override
    public UserResponse getUsers() {
        return null;
    }

    @Override
    public UserResponse removeUser() {
        return null;
    }

    @PostConstruct
    public void basicAdmin() {
        UserEntity user = UserEntity.create(UUID.fromString("b201002f-555e-4224-88bb-2ef6a10d0515"),
                "admin", "admin","Konto Administratora", LocalDate.now(), null, 0, PL, ADMIN);
        userDao.addUser(user);
    }

}
