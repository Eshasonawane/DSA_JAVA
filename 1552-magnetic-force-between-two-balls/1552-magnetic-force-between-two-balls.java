class Solution {
    public boolean isPossiblePosition(int[] position, int n,int m, int mid)
    {
        int ballCount=1;
        int lastPos=position[0];
        for(int i=1;i<n;i++)
        {
            if(position[i]-lastPos>=mid)
            {
                ballCount++;
                lastPos=position[i];
                if(ballCount==m)
                {
                    return true;
                }
            }
        }
        return false;
    }  
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int s=0;
        int ans=-1;
        int e=position[n-1]-position[0];
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(isPossiblePosition(position,n,m,mid))
            {
                ans=mid;
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
          return ans;
    }
}
  
