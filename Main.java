
  import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Random los = new Random();
        Scanner in = new Scanner(System.in);
        int[][] A = new int[5][6];
        int sumaParzystych = 0;
        int sumaNieparzystych = 0;
        int suma = 0;
        double avr = 0.0;
        int temp = 0;
        for(int i=0; i<A.length; i++){ 
            for(int j=0;j<A[i].length;j++){
                A[i][j] = los.nextInt(10);
            }
        }
        for(int i=0; i<A.length; i++){ 
            for(int j=0;j<A[i].length;j++){
                System.out.format("%4d",A[i][j]);
            }
            System.out.println();
        }
        for(int i=0; i<A.length;i++){
            for(int j=0; j<A.length; j++){ 
                if(A[i][j] % 2 == 0){
                    sumaParzystych = sumaParzystych + 1;
                    suma = suma + A[i][j];
                }else{
                    sumaNieparzystych = sumaNieparzystych + 1;
                    temp = temp + A[i][j];
                }
            }
        }
        for(int i=0; i<A.length;i++){
            for(int j=0; j<A.length; j++){ 
                if(A[i][j] % 2 != 0){
                    avr = (double)temp / (double)sumaNieparzystych;
                }
            }
        }
        System.out.println("Liczb parzystych: "+sumaParzystych);
        System.out.println("Liczb nieparzystych: "+sumaNieparzystych);
       
    }
}
