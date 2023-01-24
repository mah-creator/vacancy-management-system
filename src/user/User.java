package user;

import general.*;

public class User extends Person {
    String email;
    String password;    

    public User(String email, String password, String name, int id, BirthDate birthDate, Gender gender){
        super(name, birthDate, gender, id);
        this.email = email;
        this.password = password;
    }
    public User(String email, String password){
        super();
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}