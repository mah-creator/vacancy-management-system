package general;

public enum Month{
    JAN(0, "January"), 
    FEB(1, "February"), 
    MAR(2, "March"), 
    ABR(3, "April"), 
    MAY(4, "May"), 
    JUN(5, "June"), 
    JUL(6, "July"), 
    AUG(7, "Augest"), 
    SEP(8, "Septemper"), 
    OCT(9, "October"), 
    NOV(10, "November"), 
    DEC(11, "December");

    final int value;
    final String label;

    Month(int value, String label){
        this.value = value;
        this.label = label;
    }
}