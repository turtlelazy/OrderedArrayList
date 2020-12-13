import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    
    public void add(){
        throw new IllegalArgumentException();  
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

}