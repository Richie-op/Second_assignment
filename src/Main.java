public class Main {
    public static void main(String[] args) {

        String userType1 = "Admin";
        String userType2 = "Teacher";
        String userType3 = "Student";
        String userType4 = "TA";

        String CurrentuserType = "Admin";

        if (CurrentuserType == userType1) {
            System.out.println("Welcome to Admin Portal");
        }
        if (CurrentuserType == userType2) {
            System.out.println("Welcome to Teacher's Portal");
        }
        if (CurrentuserType == userType3) {
            System.out.println("You've now entered the student portal");
        }
        if (CurrentuserType == userType4) {
            System.out.println("Opening TA's dashboard");
        } else {
            System.out.println("Access denied");
        }
    }
    }