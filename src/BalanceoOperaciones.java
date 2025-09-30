import java.util.Scanner;

public class BalanceoOperaciones {
    public static boolean operacionBalanceada(String operacion) throws Exception {
        Stack<Character> stack = new Stack<>();
        for(char c : operacion.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(c == '}' || c == ')' || c == ']'){
                if(stack.pilaVacia()){
                    return false;
                }
                if(c == '}' && stack.peek() == '{' ||
                   c == ')' && stack.peek() == '(' ||
                   c == ']' && stack.peek() == '[') {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.pilaVacia();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exec = true;
        System.out.println("Verificador de paréntesis balanceados");
        while(exec){
            try{
                System.out.println("Menu");
                System.out.println("1. Ingresar expresión");
                System.out.println("2. Salir");
                int option = Integer.parseInt(in.nextLine());
                switch (option){
                    case 1:
                        System.out.println("Ingrese la expresion: ");
                        String expr = in.nextLine();
                        System.out.println("Expresion balanceada: " + operacionBalanceada(expr));
                        break;
                    case 2:
                        System.out.println("Graciasss!!!");
                        exec = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            }catch (Exception e){
                System.out.println("Operación invalida");
            }
        }
    }
}
