@FunctionalInterface
interface DemoAno{
    void meth1();
    //void meth2();
}
public class AnontmousClass_LambdaExp {
    public static void main(String[] args) {
        //Usage of Anonymous class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//
//            }
//
//            @Override
//            public void meth2() {
//
//            }
//        };

        //Implementing Lambda Exp
        DemoAno obj = ()->{
            System.out.println("This is lamda to implement a functional interface");
        };
    }
}
