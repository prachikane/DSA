import java.util.*;
// import java.lang.*;

class patterns{

    static void pattern1(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=0;i<num1;i++){
            int num2=sc.nextInt();
            pattern1(num2);
            System.out.println();
        }
        sc.close();
    }
}
