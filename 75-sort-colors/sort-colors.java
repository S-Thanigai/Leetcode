class Solution 
{
    public void sortColors(int[] a) 
    {
    //   int l=0;
    //   int h=a.length-1;
    //   int mid=0;
    //   int temp=0;
    //   while(mid<=h)
    //   {
    //     if(a[mid]==0)
    //     {
    //       temp=a[l];
    //       a[l]=0;
    //       a[mid++]=temp;
    //       l++;
    //     }
    //     else if(a[mid]==1)
    //     {
    //         mid++;
    //     }
    //     else 
    //     {
    //         temp=a[h];
    //         a[h]=a[mid];
    //         a[mid]=temp;
    //         h--;
    //     }
    //   }  
        int fre[] = new int[3];
        for(int f:a)
        {
            fre[f]++;
        }
        int k = 0;
        for(int i=0;i<3;i++)
        {
            while(fre[i]>0)
            {
                a[k++] = i;
                fre[i]--;
            }
        }
    }
}