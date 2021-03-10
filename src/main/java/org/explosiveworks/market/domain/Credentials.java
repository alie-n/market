package org.explosiveworks.market.domain;

public class Credentials {

    private Long id;
    private String login;
    private String password;

    public Credentials() {
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
