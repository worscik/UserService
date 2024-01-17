package pl.userService.Model;

import java.util.UUID;

public class UserDto {

    private UUID externalId;
    private String login;
    private String name;

    private UserDto(UUID externalId, String login, String name) {
        this.externalId = externalId;
        this.login = login;
        this.name = name;
    }

    public static UserDto create(UUID externalId, String login, String name) {
        return new UserDto(externalId,login,name);
    }

    public UUID getExternalId() {
        return externalId;
    }

    public void setExternalId(UUID externalId) {
        this.externalId = externalId;
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
