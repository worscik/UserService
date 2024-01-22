package pl.userService.Model;

import java.util.UUID;

public class UserDto {

    private long id;
    private String login;
    private String name;

    private UserDto(long id, String login, String name) {
        this.id = id;
        this.login = login;
        this.name = name;
    }

    public static UserDto create(long id, String login, String name) {
        return new UserDto(id,login,name);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
