package Builder;

public class Client {
    public static void main(String args[]) {
        //动态确定套餐种类
        MealBuilder mb = new MealBuilder();
        //服务员是指挥者
        KFCWaiter waiter = new KFCWaiter();
        //服务员准备就餐
        waiter.setMealBuilder(mb);
        //客户获得套餐
        Meal meal  = waiter.construct();
        System.out.println("套餐组成：");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}