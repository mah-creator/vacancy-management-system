package inventory;

import java.util.HashMap;

import user.*;
import general.*;

public class UserInventory {
    private static HashMap<String,User> listOfUser=new HashMap<>();

    public UserInventory(){
        // add a test admin account
        Admin admin = new Admin("test", "100");
        listOfUser.put(admin.getEmail(), admin);
    }
    
    private boolean exists(String email){
        if(listOfUser.containsKey(email)){
            return listOfUser.get(email) != null;
        }
        return false;
    }

    private boolean checkValidity(String email,String password){
        return (exists(email) && listOfUser.get(email).getPassword().equals(password))? true:false;
    }

    public void addUser(String email, String password, String name, int id, BirthDate birthDate, Gender gender){

        if(exists(email)) throw new IllegalStateException("This email is already registered");

        User user = new User(email, password, name, id, birthDate, gender);
        listOfUser.put(email, user);
    }

    public User getUser(String email, String password) {
       if(!checkValidity(email, password))throw new WrongUserCredentialsException();

        return listOfUser.get(email);
    }

    public boolean isAdmin(String email , String password){
        User user = getUser(email, password);
        return user instanceof Admin;
    }
}