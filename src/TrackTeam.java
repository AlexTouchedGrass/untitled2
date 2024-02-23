import java.util.ArrayList;

public class TrackTeam {
    public  static void main(String[] args){

        ArrayList<Coach> coaches = new ArrayList<Coach>();
        ArrayList<Thrower> throwers = new ArrayList<Thrower>();

        //Create coach objects.
        Coach c1 = new Coach("Emory", "Gorg", "Throws", false);
        Coach c2 = new Coach("John", "Pork", "Distance", true); //Not related to John Jarvis, completely separate thing. Not an insult.

        //Add Coach objects to coaches ArrayList.
        coaches.add(c1);
        coaches.add(c2);

        //Print coach objects.
        for (Coach c: coaches) {
            System.out.println(coaches);
            System.out.println(); //Skips a line.
        }

        //Create Thrower objects.
        Thrower t1 = new Thrower ("Jason","Ocampo",12,0,31,97);
        Thrower t2 = new Thrower ("Dalton","Sali",12,0,27,86);

        //Add Thrower Objects to throwers ArrayList.
        throwers.add(t1);
        throwers.add(t2);

        //Display Throwers.
        for (Thrower t: throwers) {
            System.out.println(throwers);
            System.out.println(); //Skips a line.
        }

        //These are all the starting values of the class, so imagine this is the beginning of the season and these are their previous/starting values.
        //Now the set methods can be used to simulate updating their stats throughout the "season." This is something really useful and I like this.
        t1.setDiscusPR(100);


    }
}
