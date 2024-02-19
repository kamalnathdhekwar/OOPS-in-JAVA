class maxArray{

    public static void main(String[] args) {
        
        int[] arr  = {877,6,4,9,15,3,7,69,-888 ,999};

        int max = arr[0];
        for(int i = 0 ; i<arr.length ; i++)
        {
           
           if(arr[i]>max)
           {
            max = arr[i];
           }
           
        }
         System.out.println(max);   


    }
}