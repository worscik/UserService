package pl.userService.Model;

import java.time.LocalDate;

public class UserRequest {

    private LocalDate createdOn;
    private String name;
    private String login;

    private UserRequest(LocalDate createdOn, String name, String login) {
        this.createdOn = createdOn;
        this.name = name;
        this.login = login;
    }

    public static UserRequest create(LocalDate createdOn, String name, String login){
        return new UserRequest(createdOn,name,login);
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
