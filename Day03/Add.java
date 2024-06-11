package Com;

import java.util.Scanner;

public class Add {
    public  int Suadd(int a,int b){
//    public  static int Suadd(int a,int b){
        return  a+b;
    }
    public static void main(String[] args) {
        Scanner su= new Scanner(System.in);
        System.out.println("Enter A and B");
        int inA=su.nextInt();
        int inB=su.nextInt();
        Add a= new Add();
        System.out.println(a.Suadd(inA,inB));
//        While using the static methord
//        System.out.println(Suadd(inA,inB));


    }
}
