public class Fruit extends Decorating {

    public void show(){

    }

    public void PutFruit() {
        System.out.println("Add Fruit ......");
    }

    public Fruit(IBirthdayCake birthdayCake){
        super(birthdayCake);
    }

}