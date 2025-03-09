import java.util.Scanner;
public class BoundaryMatrix {
    public void boundaryMatrix(int arr[][],int R,int C){
        if(R==1){
            for (int i=0;i<C;i++){
                System.out.println(arr[0][i]+" ");
            }
        }
        else if(C==0){
            for (int i=0;i<R;i++){
                System.out.println(arr[i][0]+" ");
            }
        }
        else{
            for (int i = 0; i < C; i++) {
                System.out.print(arr[0][i] + " ");
            }
            for (int i = 1; i < R; i++) {
                System.out.print(arr[i][C - 1] + " ");
            }
            if (R > 1) {
                for (int i = C - 2; i >= 0; i--) {
                    System.out.print(arr[R - 1][i] + " ");
                }
            }
            if (C > 1) {
                for (int i = R - 2; i > 0; i--) {
                    System.out.print(arr[i][0] + " ");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int arr[][]= new int[R][C];

        for(int i=0;i<R;i++){
            for(int j =0;j<C;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        BoundaryMatrix obj = new BoundaryMatrix();
        obj.boundaryMatrix(arr,R,C);
    }
}
