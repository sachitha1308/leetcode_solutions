import java.util.*;

class Solution 
{
    public int maxArea(int[] height) 
    {
        int max = 0;
        int i = 0;
        int j =height.length-1;

        while (i < j)
        {
            int maxwater = Math.min(height[i], height[j]) * (j - i);

            if (maxwater > max)
            {
                max = maxwater;
            }

            
            if (height[i] < height[j])
                i++;
            else
                j--;
        }

       return max;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++)
        {
            height[i] = scan.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.maxArea(height));
    }
}
