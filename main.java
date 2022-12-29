import java.util.Scanner;
public class recursiveExpo {
    static int expo(int a,int b){
        if (b==0){
            return 1;
        }else{
            b--;
            return(a*expo(a,b));
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;

        System.out.print("Taban Değerini Giriniz: ");
        n1=input.nextInt();
        System.out.print("Üst Değerini Giriniz: ");
        n2 = input.nextInt();

        System.out.print("Sonuç : "+expo(n1,n2));

    }
}
