import Singleton.Apple;
import Singleton.Banana;
import Singleton.MyFruit;
import Singleton.MyFruitStore;

public class ClientClass {
    public static void main(String args[]) {
        MyFruit fru1 = new Apple();
        MyFruit fru2 = new Banana();
        MyFruitStore mfs = MyFruitStore.Getfruitstore();
        mfs.Add(1, fru1);
        mfs.Add(2, fru2);
        mfs.Add(3, new Apple());
        mfs.Add(4, new Banana());
        MyFruitStore mfs2 = MyFruitStore.Getfruitstore();
        InewJuicer newJuicer = new Adapter();
        System.out.println(newJuicer.newPort(mfs.Get(3), mfs
                .Get(4)));
        }
     }