//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class ID {
    String name;
    String birthday;
    String gender;
    String birthplace;
    public ID(String name, String birthday, String gender, String birthplace) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.birthplace = birthplace;
    }
    public void displayID() {
        System.out.println(this.name);
        System.out.println(this.birthday);
        System.out.println(this.gender);
        System.out.println(this.birthplace);

    }
}
class FoodOrder {
    String FoodItem;
    int FoodCost;
    int FoodQuantity;
    int TotalCost = FoodCost * FoodQuantity;
    public FoodOrder(String FoodItem, int FoodCost, int FoodQuantity, int TotalCost) {
       this.FoodItem = FoodItem;
       this.FoodCost = FoodCost;
        this.FoodQuantity = FoodQuantity;
        this.TotalCost = TotalCost;
    }
    public void displayFoodOrder() {
        System.out.println(this.FoodItem);
        System.out.println(this.FoodCost);
        System.out.println(this.FoodQuantity);
        System.out.println(this.TotalCost);
    }

}
public class Main {
    public static void main(String[] args) {
        ID i =  new ID("Michael", "January 12, 1994", "Male" , "San Jose, California" );
        i.displayID();
        FoodOrder f = new FoodOrder("1 Bagel, 1 Coffee", 2 , 2, 4);
        f.displayFoodOrder();
    }
}
