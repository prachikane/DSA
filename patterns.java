
import java.util.*;
// import java.lang.*;

class patterns{

    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        pattern7(n);
        pattern8(n);
    }

    static void pattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>5) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num=1-num;
            }
            System.out.println();
        }
    }
    
    static void pattern12(int n){
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+(n-i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        char ch= 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int i=0;i<n;i++){
            char ch='A';
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //alphabets
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j>i-1) ch--;
                else ch++;
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n){
        for(int i=1;i<=n;i++){
            for(char ch=(char)('A'+n-i);ch<'A'+n;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n){
        int spaces=0;
        for(int i=0;i<n;i++){
            //stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            spaces+=2;
            System.out.println();
        }
    
        for(int i=0;i<n;i++){
            spaces-=2;
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    

    static void pattern20(int n){
        int spaces=2*(n-1);
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;

            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i>n-1) spaces+=2;
            else spaces-=2;
            System.out.println();
        }
    }

    static void pattern21(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i, bottom=2*(n-1)-i;
                int left=j, right=2*(n-1)-j;
                int val = Math.min(Math.min(top,bottom), Math.min(left,right));
                System.out.print(n-val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        pattern22(num);
        System.out.println();
        sc.close();
    }
}
// for multiple test cases
// for(int i=0;i<num1;i++){
//     int num2=sc.nextInt();
//     pattern1(num2);
//     System.out.println();
//     pattern2(num2);
//     System.out.println();
// }
