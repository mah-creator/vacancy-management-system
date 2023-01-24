public enum VacancyStatus{ 
    ACCEPTING_APPLICATIONS(0, "Accepting applications"),
    REVIEWING_APPLICATIONS(1, "Reviewing applications"),
    INTERVIEWING(2, "Interviewing"),
    APPLICANT_ASSESMENT(3, "Applicant assesment"),
    JOP_OFFER(4, "Job offer"),
    HIRING(5, "Hiring"),
    FILLED(6, "Position filled");
    
    final int TOTAL_STATUS = 7;

    final int value;
    final String label;
    
    VacancyStatus(int value, String label){
        this.value = value;
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}