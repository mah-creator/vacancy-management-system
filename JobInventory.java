import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart.Data;

public class JobInventory {
    private HashMap<VacancyStatus,ObservableList<JobVacancy>> hashMap = new HashMap();
    /*private*/ ObservableList<Data> data = FXCollections.observableArrayList();

    JobInventory(){
        for (VacancyStatus status : VacancyStatus.values()) {
            ObservableList<JobVacancy> list = FXCollections.observableArrayList();
            hashMap.put(status, list);
            Data d = new Data(status.label, list.size());
            data.add(d);
            list.addListener(new ListChangeListener<JobVacancy>() {
                @Override
                public void onChanged(Change<? extends JobVacancy> c) {
                    data.remove(d);
                    d.setPieValue(d.getPieValue()+1);
                    data.add(d);
                }
                
            });
        }
    }
    public ObservableList<Data> getData() {
        return data;
    }

    public HashMap<VacancyStatus, ObservableList<JobVacancy>> getHashMap() {
        return hashMap;
    }
}