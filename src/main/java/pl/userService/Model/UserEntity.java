package pl.userService.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "externalId", unique = true)
    private UUID externalId;
    @Column(name = "login", unique = true)
    private String login;
    @JsonIgnore
    private String password;
    private String name;
    private LocalDate createdOn;
    private LocalDate modifyOn;
    private int version;
    private Language language;
    private UserRole userRole;

    private UserEntity() {
    }

    private UserEntity(UUID externalId,
                       String login,
                       String password,
                       String name,
                       LocalDate createdOn,
                       LocalDate modifyOn,
                       int version,
                       Language language,
                       UserRole userRole) {
        this.externalId = externalId;
        this.login = login;
        this.password = password;
        this.name = name;
        this.createdOn = createdOn;
        this.modifyOn = modifyOn;
        this.version = version;
        this.language = language;
        this.userRole = userRole;
    }

    public static UserEntity create(UUID externalId,
                                    String login,
                                    String password,
                                    String name,
                                    LocalDate createdOn,
                                    LocalDate modifyOn,
                                    int version,
                                    Language language,
                                    UserRole userRole) {
        return new UserEntity(externalId, login, password, name, createdOn, modifyOn, version, language, userRole);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDate getModifyOn() {
        return modifyOn;
    }

    public void setModifyOn(LocalDate modifyOn) {
        this.modifyOn = modifyOn;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
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
