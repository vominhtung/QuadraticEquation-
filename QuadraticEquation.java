public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA (){
        return this.a;
    }
    public double getB (){
        return this.b;
    }
    public double getC (){
        return this.c;
    }
    public double getDiscriminant(){
        double delta = (this.getB()*2)-(4*this.getA()*this.getC());
         return  delta;
    }
    public double getRoot1(){
        double denominator = this.getA() * 2;
        double nominator = -this.getB() + Math.pow(this.getB()*this.getB() - 4 * this.getA()* this.getC(), 0.5);
        return denominator / nominator;
    }
    public double getRoot2(){
        double denominator = this.getA() * 2;
        double nominator = -this.getB() - Math.pow(this.getB()*this.getB() - 4 * this.getA()* this.getC(), 0.5);
        return denominator / nominator;
    }
}




