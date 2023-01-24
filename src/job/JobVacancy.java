package job;
public class JobVacancy extends JobPosition{
    VacancyStatus status = VacancyStatus.ACCEPTING_APPLICATIONS;
    public JobVacancy(String title){
        super(title);
    }
    public void proceedForward(){
        if(!(status == VacancyStatus.FILLED))
            status = VacancyStatus.values()[status.value + 1];
    }
}