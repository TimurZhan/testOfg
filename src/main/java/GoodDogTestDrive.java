public class GoodDogTestDrive {

  public static void main(String[] args){

    GodDog one = new GodDog();
    one.setSize(70);

    GodDog two = new GodDog();
    two.setSize(8);

    System.out.println("Первая собака: " + one.getSize());
    System.out.println("Вторая собака: " + two.getSize());
    one.bark();
    two.bark();
  }

}
