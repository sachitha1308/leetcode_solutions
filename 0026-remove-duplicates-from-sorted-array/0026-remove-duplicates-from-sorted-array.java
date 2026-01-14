class Solution
 {
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length==0)
        {
            return 0;
        }
        int k=1;
      for(int i=1;i<nums.length;i++)
      {
        if(nums[i]!=nums[i-1])
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
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = scan.nextInt();
        }
        Solution obj = new Solution();
        System.out.println(obj.removeDuplicates(nums));
    }
}