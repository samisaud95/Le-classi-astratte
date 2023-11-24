
public class Main {
    public static void main(String[] args) {
        Retangolo retangolo1= new Retangolo(3.8,4.3);
        Triangolo triangolo1= new Triangolo(6,7);

        System.out.println("Area del rettangolo: " + retangolo1.calcoloArea());


        System.out.println("Area del triangolo: " + triangolo1.calcoloArea());
    }
}