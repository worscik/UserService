package pl.userService.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;
import pl.userService.Model.UserDto;
import pl.userService.Model.UserEntity;
import pl.userService.Model.UserRequest;

import static org.hibernate.type.StandardBasicTypes.UUID;

@Repository
public class UserDao implements IUserDao {

    private final EntityManager entityManager;
    private final SessionFactory sessionFactory;

    public UserDao(EntityManager entityManager, SessionFactory sessionFactory) {
        this.entityManager = entityManager;
        this.sessionFactory = sessionFactory;
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
    public UserEntity findUserById(int id) {
        String sqlQuery = "SELECT * FROM USER_ENTITY WHERE id = :id";
        Session session = sessionFactory.openSession();
        NativeQuery<UserEntity> nativeQuery = session.createNativeQuery(sqlQuery, UserEntity.class);
        nativeQuery.setParameter("id", id);
        UserEntity result = nativeQuery.uniqueResult();
        session.close();
        return result;
    }
}
