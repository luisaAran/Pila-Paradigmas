public class Stack<T>{
    public StackNode<T> superior;
    public int tamanioPila;
    public Stack(){
        this.superior = null;
        this.tamanioPila = 0;
    }
    public void push(T value){
        StackNode<T> nuevoNodo = new StackNode<>(value);
        if(this.superior == null){
            this.superior = nuevoNodo;
            this.tamanioPila++;
        }else{
            nuevoNodo.anterior = this.superior;
            this.superior = nuevoNodo;
            this.tamanioPila++;
        }
    }
    public T peek() throws Exception{
        if(this.tamanioPila == 0){
            throw new Exception("La pila está vacía");
        }
        return this.superior.valor;
    }
    public T pop() throws Exception{
        if(this.tamanioPila == 0){
            throw new Exception("La pila está vacía");
        }
        T value = this.superior.valor;
        this.superior = this.superior.anterior;
        this.tamanioPila--;
        return value;
    }
    public boolean pilaVacia(){
        return this.tamanioPila == 0;
    }
}
