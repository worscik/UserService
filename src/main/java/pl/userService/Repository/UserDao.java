package pl.userService.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import pl.userService.Model.UserDto;
import pl.userService.Model.UserEntity;
import pl.userService.Model.UserRequest;

@Repository
public class UserDao implements IUserDao {

    private final EntityManager entityManager;

    public UserDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void addUser(UserEntity UserEntity) {
        entityManager.persist(UserEntity);
    }

    @Override
    public UserDto updateUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserDto deleteUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserDto findUserById(int id) {
        return null;
    }
}
