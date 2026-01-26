import java.util.Scanner;


class Increasing_subsequences {

    //backtracking
    static int solve(int [] arr,int ind,int val){
        if(ind==arr.length){
            return 0;
        }
        else{
            if(val < arr[ind]){
                return Math.max( solve(arr,ind+1,val),solve(arr,ind+1,arr[ind])+1);
            }
            else {
                return solve(arr, ind + 1, val);

            }
        }
    }


    // memoization
    static int solve(int [] arr,int ind,int val,int [][]dp){
        if(ind==arr.length || val==arr.length){
            return 0;
        }

        else if( dp[ind][val] == -1){
            if(arr[val] < arr[ind]){
                dp[ind][val]= Math.max( solve(arr,ind+1,val,dp),solve(arr,ind+1,ind,dp)+1);
            }
            else {
                dp[ind][val]= Math.max( solve(arr, ind + 1, val,dp),solve(arr,ind+1,val+1,dp));

            }

        }
        return dp[ind][val];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {4,45,7,1,2,15,3,12,34,85,6,67,89,78,99};
        int [][] dp = new int[arr.length+1][arr.length+1];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                dp[i][j]=-1;
            }

        }

        for (int i = arr.length; i >= 0; i--) {
            for (int j = arr.length; j >=0 ; j--) {
                if(i==arr.length ){
                    dp[i][j]= 0;
                }
                else if( dp[i][j] == -1){
                    if(j== arr.length||arr[i] > arr[j]){
                        dp[i][j]= Math.max( dp[i+1][j],dp[i+1][i]+1);
                    }
                    else {
                        dp[i][j]= dp[i+1][j];

                    }

                }
            }
        }

        System.out.println(dp[0][arr.length]);
        //System.out.println(solve(arr,0,0,dp));
    }
}

