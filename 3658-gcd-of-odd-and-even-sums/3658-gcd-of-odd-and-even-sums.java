class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven=0;
        int sumOdd=0;
       for(int i=1;i<=n*2;i++)
       {
        //even no
            if(i%2==0)
            {
                sumEven+=i;
            }
            else
            {
                sumOdd+=i;
            }
       }

        int a=sumOdd;
        int b=sumEven;
       while(b!=0)
       {
           int temp=b;
           b=a%b;
           a=temp;
       } 
       return a;
    }
}