class Solution {
    public int[][] flipAndInvertImage(int[][] image)
    {
        int m = image.length;
        int n = image[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(image[i][j]==0)
                {
                    image[i][j] = 1;
                }
                else
                {
                    image[i][j] = 0;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            reverse(image[i]);
        }
        return image;    
    }
    public void reverse(int arr[])
    {
        int l = 0;
        int r = arr.length-1;
        while(l<r)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}