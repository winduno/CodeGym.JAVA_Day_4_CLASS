import java.util.Scanner;

public class QuadraticEquationProcess {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a, b, c đi anh zai!!: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        QuadraticEquation quadraticEquation1 = new QuadraticEquation(num1, num2, num3);
        if (quadraticEquation1.getDiscriminant() > 0){
            System.out.print("Phương trình có 2 nghiệm là: " + quadraticEquation1.getRoot1() + " và " + quadraticEquation1.getRoot2());
        }
        else if (quadraticEquation1.getDiscriminant() == 0){
            System.out.print("Phương trình có nghiệm kép: " + quadraticEquation1.getRoot2());
        }
        else {
            System.out.print("Vô nghiệm!!");
        }
    }

    public static boolean isStringDouble(String number){
        try{
            Double.parseDouble(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
}
