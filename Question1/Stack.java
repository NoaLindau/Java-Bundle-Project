public class Stack<GenericType> {
    private GenericType[]  data;
    private  int  top;
    public Stack(int size)  {
        data = (GenericType[]) new Object[size];
        top = -1;
    }
    public void push(GenericType value)  {
        top++;
        data[top] = value;
    }
    public GenericType pop()  {
        return data[top--];
    }
    public GenericType top() {
        return data[top];
    }
}

