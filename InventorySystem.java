import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart.Data;

public class InventorySystem {
    private UserInventory userInventory = new UserInventory();
    private JobInventory jobInventory = new JobInventory();
    private User activeUser;
    private boolean adminisActive;
    
    boolean adminIsActive(){
        return adminisActive;
    }

    void logUserIn(String email, String password){
        User user = userInventory.getUser(email, password);
        activeUser = user;
        if(userInventory.isAdmin(email, password)) adminisActive = true;
    }

    void createAccount(String email, String password, String name, int id, BirthDate birthDate, Gender gender){
        userInventory.addUser(email, password, name, id, birthDate, gender);
    }

    ObservableList<Data> getData(){
        return jobInventory.getData();
    }

    void add(VacancyStatus initialStatus){
        jobInventory.getHashMap().get(initialStatus).add(new JobVacancy("null"));
    }
}