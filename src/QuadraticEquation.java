public class QuadraticEquation {
    private double  num1, num2, num3;

    public QuadraticEquation(double num1, double num2, double num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getNum3() {
        return num3;
    }
    public double getDiscriminant(){
        return  this.num2*this.num2 - 4*this.num1*this.num3;
    }

    public double getRoot1(){
        return (-this.num2 + Math.sqrt(getDiscriminant()))/(2*this.num1);
    }

    public double getRoot2(){
        return (-this.num2 - Math.sqrt(getDiscriminant()))/(2*this.num1);
    }
}
