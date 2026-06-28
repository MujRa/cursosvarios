public class sumarecursiva {
    //Funcion de suma correlativa del numero entero
    public static int sumarecursiva(int numero){
        if(numero==0) {
            return 0;
        }else
        {
            return numero + sumarecursiva(numero - 1);
        }
    }
    public static void main(String[] args){
        //Inicializa numero entero
        int numero = 10;
        System.out.println("La suma correlativa para el numero "+numero+" es " +sumarecursiva(numero));
    }
}
