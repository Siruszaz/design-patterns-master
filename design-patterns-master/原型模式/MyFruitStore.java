
public class MyfruitStore{

    private static Hashtable fruittable=new Hashtable<Inter,MyFuit>();

    public static void Add(Integer key,MyFruit fruit)
    {
        fruittable.put(key,fruit);
    }
    public static MyFruit Get(Integer key)
    {
        MyFruit fruit = (MyFruit)fruittable.get(key)
        return (MyFruit)fruit.clone();
    }
}