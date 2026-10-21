

class Text01 {
    int sum(int a,int b,int c){
        return a+b+c;
    }
    int sum(int a,int b){
        return a+b;
    }
    double sum(double a,double b){
        return a+b;
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Text01 t = new Text01();

        System.out.println(t.sum(56.7800d,78.90080d));
        System.out.println(t.sum(70,80,90));



    }
}