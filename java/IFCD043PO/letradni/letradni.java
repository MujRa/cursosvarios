public class letradni {
    //Funcion para asignar el literal del DNI
    public static void letradeldni(int dni) {
        int resto = dni % 23;
        switch (resto) {
            case 0:
                System.out.println("El literal del DNI "+dni+" es T");
                break;
            case 1:
                System.out.println("El literal del DNI "+dni+" es R");
                break;
            case 2:
                System.out.println("El literal del DNI "+dni+" es W");
                break;
            case 3:
                System.out.println("El literal del DNI "+dni+" es A");
                break;
            case 4:
                System.out.println("El literal del DNI "+dni+" es G");
                break;
            case 5:
                System.out.println("El literal del DNI "+dni+" es M");
                break;
            case 6:
                System.out.println("El literal del DNI "+dni+" es Y");
                break;
            case 7:
                System.out.println("El literal del DNI "+dni+" es F");
                break;
            case 8:
                System.out.println("El literal del DNI "+dni+" es P");
                break;
            case 9:
                System.out.println("El literal del DNI "+dni+" es D");
                break;
            case 10:
                System.out.println("El literal del DNI "+dni+" es X");
                break;
            case 11:
                System.out.println("El literal del DNI "+dni+" es B");
                break;
            case 12:
                System.out.println("El literal del DNI "+dni+" es N");
                break;
            case 13:
                System.out.println("El literal del DNI "+dni+" es J");
                break;
            case 14:
                System.out.println("El literal del DNI "+dni+" es Z");
                break;
            case 15:
                System.out.println("El literal del DNI "+dni+" es S");
                break;
            case 16:
                System.out.println("El literal del DNI "+dni+"es Q");
                break;
            case 17:
                System.out.println("El literal del DNI "+dni+" es V");
                break;
            case 18:
                System.out.println("El literal del DNI "+dni+" es H");
                break;
            case 19:
                System.out.println("El literal del DNI "+dni+" es L");
                break;
            case 20:
                System.out.println("El literal del DNI "+dni+" es C");
                break;
            case 21:
                System.out.println("El literal del DNI "+dni+" es K");
                break;
            case 22:
                System.out.println("El literal del DNI "+dni+" es E");
                break;
            default:
                System.out.println("El literal del DNI no esta registrado");
                break;
        }
    }

    public static void main(String[] arg){
        letradeldni(35666118);
    }
}
