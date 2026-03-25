//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Treadmill {
    int TimeSpent_Minutes;
    String SpeedActivity;
    int RunningSpeed_MilesPerHour;
    int Distance_Miles;
    int RunningCaloriesBurned;
    String ProgramType;
    public Treadmill(int TimeSpent_Minutes, String SpeedActivity, int RunningSpeed_MilesPerHour, int Distance_Miles, int RunningCaloriesBurned, String ProgramType) {
        this.TimeSpent_Minutes = TimeSpent_Minutes;
        this.SpeedActivity = SpeedActivity;
        this.RunningSpeed_MilesPerHour = RunningSpeed_MilesPerHour;
        this.Distance_Miles = Distance_Miles;
        this.RunningCaloriesBurned = RunningCaloriesBurned;
        this.ProgramType = ProgramType;
    }
    public void displayTreadmill() {
        System.out.println(this.TimeSpent_Minutes);
        System.out.println(this.SpeedActivity);
        System.out.println(this.RunningSpeed_MilesPerHour);
        System.out.println(this.Distance_Miles);
        System.out.println(this.RunningCaloriesBurned);
        System.out.println(this.ProgramType);
    }

}
class Set {
    int Set;
    int Set2;
    int Weight_Kg;
    int Reps;
    public Set(int Set, int Weight_Kg, int Reps) {
        this.Set = Set;
        this.Weight_Kg = Weight_Kg;
        this.Reps = Reps;
    }
    public void displaySet() {
        System.out.println(this.Set);
        System.out.println(this.Weight_Kg);
        System.out.println(this.Reps);
    }
    public void displaySecondSet() {
        System.out.println(this.Set);
        System.out.println(this.Weight_Kg);
        System.out.println(this.Reps);
    }
}
public class Main {
    public static void main(String[] args) {
        Treadmill t = new Treadmill(36, "Running", 3,  7, 278, "Manual");
        t.displayTreadmill();
        Set l = new Set(1, 100, 11);
        l.displaySet();
        Set l2 = new Set(2, 110, 9);
        l2.displaySecondSet();
    }
}