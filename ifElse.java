import java.io.*;
import java.util.*;
public class ifElse {
    public static void main(String args[]){
    Scanner sc=  new Scanner(System.in);
    int a = sc.nextInt();
    if(a>18){
        System.out.println("adult");
    }
    else{
        System.out.println("child");
    }
    }
}
