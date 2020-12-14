public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList(){
        super();
    }

    public OrderedArrayList(int a){
        super(a);
    }

    public boolean add(T a){
        super.add(a);
        for(int i = 0; i < size();i++){
            if(get(size()-1).compareTo(get(i))<0){
                super.remove(size()-1);
                super.add(i,a);
            }
        }

        return true;
    }

    public void add(int i, T a){
        add(a);
    }

    public T set(int i, T a){
        T previous = get(i);
        add(a);
        remove(previous);
        return previous;
    }
}
