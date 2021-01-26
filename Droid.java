public class Droid {
  
  int batterylevel;
  String name;


public Droid(String droidname) {
    name = droidname;
    batterylevel = 100;
    }

  public String toString() {
    return "Hey there " + name + " here I am one Month Old!";
}

public void performTask(String task) {
  batterylevel = batterylevel -10;
  System.out.println(name + " is performing task: " + task);
}

public static void main(String[] args) {
    
    Droid codey = new Droid("codey");    
      System.out.println(codey);
      codey.performTask("Running");
      codey.performTask("Walking");

}

}