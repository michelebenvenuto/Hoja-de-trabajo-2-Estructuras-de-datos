import java.util.Vector;

public class StackVector<E> implements Stack<E> {
    public Vector<E> data;

    public StackVector(){data = new Vector<E>();}

    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        return data.remove(size()-1);
    }

    @Override
    public E peek() {
        return data.get(size()-1);
    }

    @Override
    public boolean empty() {
        return size()==0;
    }

    @Override
    public int size() {
        return data.size();
    }

}
