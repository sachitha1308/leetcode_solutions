class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
      int m = nums1.length;
      int n = nums2.length;
      int[] number = new int[m+n];
      int i=0,j=0,k=0;
      while(i<m&&j<n)
      {
        if(nums1[i]<=nums2[j])
        {
            number[k]=nums1[i];
            k++;i++;
        }
        else
        {
            number[k]=nums2[j];
            k++;j++;
        }
      }
      while (i < m) {
    number[k++] = nums1[i++];
}
while (j < n) {
    number[k++] = nums2[j++];
}

      int start =0;
      int end = number.length-1;
      int mid = (start+end)/2;

      int leftside = mid;
      int rightside = number.length-mid-1;

      if(leftside==rightside)
      {
       return(number[mid]);
      }
      else
      {
     return(number[mid]+number[mid+1])/2.0;

     }
    }
}    
