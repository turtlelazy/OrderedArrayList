public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList(){
        super();
    }

    public OrderedArrayList(int a){
        super(a);
    }

    public boolean add(T a){
        for(int i = 0; i < size();i++){
            if(a.compareTo(get(i))<0){
                super.add(i,a);
            }
        }
        return true;
    }

    public void add(int i, T a){
        add(a);
    }

    public T set(int i, T a){
        add(a);
        return remove(i);
    }
}
