class Complex{
    private int real;
    private int imaginary;

    Complex(){
        this.real = 0;
        this.imaginary = 0;        
    }

    Complex(int r, int i){
        real = r;
        imaginary = i;
    }

    public int getImaginary() {
        return imaginary;
    }
    public int getReal() {
        return real;
    }

    void addComplex(Complex c){
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}


public class Statement17 {
    public static void main(String[] args) {
        Complex num1 = new Complex(12, 5);
        Complex num2 = new Complex(12, 5);

        num1.addComplex(num2);

        System.out.println(num1.getImaginary());
    }
}
