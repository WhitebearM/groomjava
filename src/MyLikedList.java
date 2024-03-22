import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLikedList<T> {
    private List<T> list;

    public MyLikedList(){
        list = new ArrayList<>();
    }

    public void add(T data) {
        list.add(data);
    }

    public T get(int index){
        return list.get(index);
    }

    public void delete(int index){
        list.remove(index);
    }

    public void printList(){
        for(T i : list){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        MyLikedList<String> myl1 = new MyLikedList<>();
        
        myl1.add("배한솔");
        myl1.add("강룡");
        myl1.add("조민준");
        myl1.add("이주원");
        myl1.add("왕영찬");

        myl1.delete(3);
        myl1.printList();

        Iterator<String> intItor = myl1.list.iterator();

        for(int i = 0; i < myl1.list.size();i++){
            System.out.println(intItor.next());
        }
    }
}
