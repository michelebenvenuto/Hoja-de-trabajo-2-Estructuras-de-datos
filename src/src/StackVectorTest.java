import org.junit.Test;

import static org.junit.Assert.*;

public class StackVectorTest {

    private StackVector<Integer> stack = new StackVector<Integer>();
    int numero = 2;

    @Test
    public void pop() {
        stack.push(2);
        Integer esperado = 2;
        assertEquals(esperado,stack.pop());
    }

    @Test
    public void peek() {
        stack.push(2);
        Integer esperado = 2;
        assertEquals(esperado,stack.peek());
    }

    @Test
    public void empty() {
        stack.push(2);
        stack.pop();
        assertEquals(true,stack.empty());
    }

    @Test
    public void size() {
        stack.push(2);
        stack.push(3);
        assertEquals(2,stack.size());
    }
}