public class StackNode<T>{
    public T valor;
    public StackNode<T> anterior;
    public StackNode(T value){
        this.valor = value;
        this.anterior = null;
    }
}
