class Practise{
    public static void diagonalSum(int arr[][]){
        int pd = 0,sd=0;
        for(int i=0; i<arr.length; i++){
            pd +=arr[i][i];
            if(i!= arr.length-1-i)
                sd += arr[i][arr.length-1-i]; // i+j = n-1  or j = n - 1 -i;
        }
        System.out.println("Primary diagonal sum = "+pd+"\nSecondary diagonal sum = "+sd);
        
    }
    public static void main(String[]args){
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        diagonalSum(array);
    }
}