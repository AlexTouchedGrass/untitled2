public class Thrower extends Player {
    //Attributes
    private double shotPR;
    private double discusPR;

    //Constructors
    public Thrower(String firstName, String lastName, int gradeLevel, int pointsEarned, double shotPR, double discusPR) {
        super(firstName, lastName, gradeLevel, pointsEarned);
        setShotPR(shotPR);
        setDiscusPR(discusPR);
    }

    //Mutators (SETTERS)
    public void setShotPR(double shotPR) {
        if (shotPR >= 0 && shotPR <= 100) {
        }
    }

    public void setDiscusPR(double discusPR) {
        if (discusPR >= 0 && discusPR <= 230) {
        }
    }

    //Accessors (GETTERS)
    public double getDiscusPR() {return discusPR;}

    public double getShotPR() {return shotPR;}

    public String toString() {
        return super.toString() + "\nShot Put PR (ft): " + getShotPR() + "\nDiscus PR (ft): " + getDiscusPR();
    }
}

