public enum Gender{
    MALE(0, "Male") , 
    FEMALE(1, "Female") ;

    final int value;
    final String label;

    Gender(int value, String label){
        this.value = value;
        this.label = label;
    }
}