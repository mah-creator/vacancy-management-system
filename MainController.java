import java.io.File;
import java.net.URL;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart.Data;
import javafx.stage.Stage;

import inventory.InventorySystem;
import job.VacancyStatus;

public class MainController {
    protected Stage primaryStage = Test.primaryStage;
    protected Scene loginScene = Test.loginScene;
    protected Scene signupScene = Test.signupScene;

    protected static InventorySystem inventorySystem = new InventorySystem();

    @FXML
    void goToLogin() throws Exception{
        loginScene.setRoot(FXMLLoader.load(getURL(".\\gui\\login.fxml")));
        primaryStage.setScene(loginScene);
    }
    
    @FXML
    void goToSignup() throws Exception{
        primaryStage.setScene(signupScene);
    }

    private URL getURL(String path) throws Exception{
        return (new File(path)).toURI().toURL();
    }

    protected ObservableList<Data> getChartData(){
        return inventorySystem.getData();
    }
    protected void add(VacancyStatus initialStatus){
        inventorySystem.add(initialStatus);
    }
}