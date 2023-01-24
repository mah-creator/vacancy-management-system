public class Admin extends User {
    public Admin(String userName, String password){
        super((userName + "@admin.atc.org"), password);
    }
    public Admin(String userName, String password, String name, int id, BirthDate birthDate, Gender gender){
        super((userName + "@admin.atc.org"), password, name, id, birthDate, gender);
    }
}