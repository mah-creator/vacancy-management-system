public class Person {
    private static int arbitraryID = 1000;
    BirthDate arbitrartBirthDate = new BirthDate(Month.JAN, 1997);
    Gender arbitraryGender = Gender.MALE;

    protected String name;
    protected BirthDate birthDate = arbitrartBirthDate;
    protected Gender gender = arbitraryGender;
    protected int id;


    public Person(String name, BirthDate birthDate, Gender gender, int id) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.id = id;
    }

    public Person(){
        this.id = arbitraryID;
        arbitraryID++;
    }
}