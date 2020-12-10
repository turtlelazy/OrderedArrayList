import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    
    public void add(){
        throw new IllegalArgumentException();  
    }

}