package pl.userService.Model;

import java.time.LocalDate;

public class UserRequest {

    private LocalDate createdOn;
    private String name;
    private String login;
    private String password;
    private UserRole userRole;

    public UserRequest(LocalDate createdOn, String name, String login, String password,UserRole userRole) {
        this.createdOn = createdOn;
        this.name = name;
        this.login = login;
        this.password = password;
        this.userRole = userRole;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
