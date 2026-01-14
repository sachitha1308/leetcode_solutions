class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        int mindiff = Integer.MAX_VALUE;
        int closestsum =0;

        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int sum = nums[i]+nums[j]+nums[k];
                    int diff =Math.abs(target-sum);

                    if(diff<mindiff)
                    {
                        mindiff= diff;
                        closestsum = sum;
                    }
                }
            }
        }
        return closestsum;
        
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]= scan.nextInt();
        }
        int target = scan.nextInt();
        Solution object = new Solution();
        System.out.println(object.threeSumClosest(nums,target));
    }
}
