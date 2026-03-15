import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int age;
        String location;
        int phone;
        System.out.println("enter your name ");
       name =sc.nextLine();
        System.out.println("enter your age ");
        age =sc.nextInt();
        if(age<16){
            System.out.println("you are under age ");
        }
        System.out.println("enter your phone number");
        phone =sc.nextInt();
        if(phone>=10){
            System.out.println("valid number ");
        }
        else{
            System.out.println("the number entered is invalid");
        }
        sc.nextLine();
        System.out.println("enter your location");
        location =sc.nextLine();
        //System.out.println("hello my names are "+ name + "," + age + "," + phone + "," +location );
        System.out.println("the names you enterd " + name);
        System.out.println(" the age you enterd are " + age);
        System.out.println(" the phone number you entered are " + phone);
        System.out.println( "the location you entered is " + location);//
        sc.close();
    }
}
