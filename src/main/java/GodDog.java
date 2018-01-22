
public class GodDog {

  private int size;

  public int getSize(){
    return size;
  }

  public void setSize(int s){
    size = s;
  }

  void bark(){
    if (size > 60){
      System.out.println("Гав, епта, гав!");
    } else if (size > 14){
      System.out.println("Вуф, епта, фуф!");
    } else {
      System.out.println("Тяф, епта, тяф!");
    }
  }
}
