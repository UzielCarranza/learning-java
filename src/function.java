import java.util.Scanner;

public class function {
    public static void announceDeveloperTeaTime(){
        System.out.println("waiting for developer tea time");
        System.out.println("enter something random to start developer tea time");

        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("its developer tea time");
    }
    public static void main(String[] args){
        announceDeveloperTeaTime();
    }
}
