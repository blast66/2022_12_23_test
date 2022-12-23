import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;
public class test46{
    public static void main(String args[]){
        int[] Arr = {7, 5, 4, 9, 8, 1, 2};
        int[] flag = new int [Arr.length];
        int index = 0;
        int flag_count = 1;
        int num1 = 0;
        int max = 0;
        int min = 10;
        int sum = 0;
        float avg = 0;

        int med = 0;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();

        for (int i=0; i<Arr.length;i++){
            int flag_1 = 1000;
            int flag_2 = 0;
            for (int j=0; j<Arr.length; j++) {
                if(Arr[j] < flag_1 && flag[j] == 0){
                    flag_1 = Arr[j];
                    flag_2 = j;
                    index = j;

                }
            }
            System.out.println();
            flag[flag_2] = flag_count;//更新flag每輪最小值的數，下一輪不再判斷此數
            flag_count++ ; 
            med  = Arr[flag_2];
            if(num1 == flag[index]){
                System.out.println("med: " + Arr[index]);
                break;
            }
        }

    }
}