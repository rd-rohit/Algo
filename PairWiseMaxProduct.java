import java.util.*;
import java.lang.*;

public class PairWiseMaxProduct {
    public static void main(String[] args) {
        // while(true){
        //     Random random = new Random();
        //     int n = random.nextInt(1000) + 2;
        //     System.out.println(n);
        //     int[] a = new int[n];
        //     for(int i = 0; i<n; i++){
        //         a[i] = random.nextInt(100000);
        //     }
        //     for(int i =0 ; i< n;i++){
        //         System.out.print(a[i]+ " ");
        //     }
        //     System.out.println();
        //     long res1 = getMaxProd(a);
        //     long res2 = getMaxProdFast(a);
        //     if(res1 != res2){
        //         System.out.println("Wrong results , "+"Res1 : "+res1+", Res2 : "+res2);
        //         break;
        //     }else{
        //         System.out.println("OK");
        //     }
        // }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for( int i = 0; i <n ; i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(getMaxProdFast(a));
    }

    private static long getMaxProd(int[] a){
        long result = 0;
        for(int i = 0; i< a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(((long)a[j] * a[i]) > result){
                    result = ((long)a[i]) * a[j];
                }
            }
        }
        return result;
    }

    private static long getMaxProdFast(int[] a){
        int maxindex1 = -1;
        for (int i = 0; i < a.length; i++) {
            if((maxindex1 == -1) || a[i] > a[maxindex1]){
                maxindex1 = i;
            }
        }
        int maxindex2 = -1;
        for (int j = 0; j < a.length; j++) {
            if(((a[j] != a[maxindex1]) || (j!=maxindex1)) && (maxindex2 == -1 || a[j] > a[maxindex2])){
                maxindex2 = j;
            }
        }
        return ((long) a[maxindex1])* a[maxindex2];
    }
}