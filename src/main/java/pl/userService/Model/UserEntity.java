package pl.userService.Model;

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
    private String name;
    private LocalDate createdOn;
    private LocalDate modifyOn;
    private int version;
    private Language language;

    private UserEntity() {
    }

    private UserEntity(UUID externalId,
                       String login,
                       String name,
                       LocalDate createdOn,
                       LocalDate modifyOn,
                       int version,
                       Language language) {
        this.externalId = externalId;
        this.login = login;
        this.name = name;
        this.createdOn = createdOn;
        this.modifyOn = modifyOn;
        this.version = version;
        this.language = language;
    }

    public static UserEntity create(UUID externalId,
                                    String login,
                                    String name,
                                    LocalDate createdOn,
                                    LocalDate modifyOn,
                                    int version,
                                    Language language) {
        return new UserEntity(externalId, login, name, createdOn, modifyOn, version, language);
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
}
