public class trapRainWtr {

    public static int trappingRainWater(int height[]){
      int n = height.length;

      // left Max
      int leftMax[] = new int[n];
      leftMax[0] = height[0];
      for(int i=1; i<n; i++){
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
      }

      // Right Max
      int rightMax[] = new int[n];
      rightMax[n-1] = height[n-1];
      for(int i= n-2; i>=0; i--){
       rightMax[i] = Math.max(height[i], rightMax[i+1]);
      }

       // trapping water

       int trappingWater = 0;

       for(int i = 0; i<n; i++){
        int  waterlvl = Math.min(leftMax[i], rightMax[i]);
        trappingWater = trappingWater + (waterlvl - height[i]);
       }

       return trappingWater;
 }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5} ;

        int reasult = trappingRainWater(height);

        System.out.println(reasult);
    }
}
