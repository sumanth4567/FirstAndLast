import java.util.Scanner;
public class FirstAndLast {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,target;
        System.out.println("Enter the no of elements:");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements into array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        target=sc.nextInt();
        int present[]=new int[2];
        //First occurance
        for(int i=0;i<n;i++){
            if(target==nums[i]){
                present[0]=i;
                break;
            }
        }
        //Last occurance
        for(int i=n-1;i>=0;i--){
            if(target==nums[i]){
                present[1]=i;
                break;
            }
        }
        //if the target number is not repated
        if(present[0]==present[1]){
            System.out.println("Target number is not repeated");
        }
        else{
            System.out.println("The first and last occurence of the target indexes are:");
            for(int i=0;i<2;i++){
                System.out.println(present[i]);
            }
        }
    }
}
