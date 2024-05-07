public class ClientClass{
    public static void main(String[] args){
        Factory factory=(Factory)XMLUtil.getBean();
        Fruit fruit=factory.CreateFruit();
        fruit.eat();
    }
}
    public Stringg factory(String fruitname)
    {
        if(fruitname.equals("Apple"))
            return "Apple";
        if(fruitname.equals("Banana"))
            return "Banana";
        return null;
    }