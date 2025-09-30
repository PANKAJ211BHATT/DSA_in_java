package DSA.Arrays;

public class rainWaterContainer {
    public static int TrappedRainWater(int[] height) {
        int n = height.length;
        int trapedsum = 0;

        // left max
        int[] auxleftmax = new int[n];
        auxleftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            auxleftmax[i] = Math.max(auxleftmax[i - 1], height[i]);
        }

        // right max
        int[] auxrightmax = new int[n];
        auxrightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            auxrightmax[i] = Math.max(auxrightmax[i + 1], height[i]);
        }

        // water trapped
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(auxleftmax[i], auxrightmax[i]);
            trapedsum += (waterlevel - height[i]);
        }

        return trapedsum;
    }

    public static void main(String[] args) {
        int [] height= {4,2,0,6,3,2,5};
        System.out.println(TrappedRainWater(height));

    }
}
