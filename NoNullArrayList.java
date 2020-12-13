import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    public NoNullArrayList(){
        super();
    }

    public NoNullArrayList(int a){
        super(a);
    }

    public boolean add(T a) {
        if (a==null){
            throw new IllegalArgumentException(); 
        }
        else{
            return super.add(a);
        }
    }

    public void add(int i,T a){
        if(a == null){
            throw new IllegalArgumentException();
        }
        else{
            super.add(i,a);
        }
    }

    public T set(int i, T a){
        if(a == null){
            throw new IllegalArgumentException();
        }
        else{
            return super.set(i,a);
        }
    }

}