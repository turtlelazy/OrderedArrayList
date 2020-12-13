import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    ArrayList<T> data;

    public NoNullArrayList(){
        data = new ArrayList<T>();
    }

    public NoNullArrayList(int a){
        data = new ArrayList<T>(a);
    }

    public boolean add(T a) {
        if (a==null){
            throw new IllegalArgumentException(); 
        }
        else{
            return data.add(a);
        }
    }

    public void add(int i,T a){
        if(a == null){
            throw new IllegalArgumentException();
        }
        else{
            data.add(i,a);
        }
    }

    public T set(int i, T a){
        if(a == null){
            throw new IllegalArgumentException();
        }
        else{
            return data.set(i,a);
        }
    }

}