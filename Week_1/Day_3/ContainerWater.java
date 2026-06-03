public class ContainerWater {
    public int maxArea(int[] height)
    {
        int maxarea=0;
        int left=0;
        int right =height.length-1;
        while(left<right)
        {
            int ht=Math.min(height[left],height[right]);
            int width=right-left;
            int area =ht*width;
            maxarea=Math.max(area,maxarea);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxarea;
    }
    public static void main(String args[]){
        ContainerWater cw = new ContainerWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = cw.maxArea(height);
        System.out.println(result);
    }
}