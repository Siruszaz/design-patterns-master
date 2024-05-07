import Singleton.MyFruit;
public class OldJuicer {

    public String onePort(MyFruit fruit){
        String str = fruit.getClass() + "果汁";
        return str;
    }

}