class Solution 
{
    public int removeElement(int[] nums, int val)
     {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int value = scan.nextInt();
        Solution obj = new Solution();
      System.out.println(obj.removeElement(arr,value));
    }
}