package easy;

public class climbingStairs {

	@SuppressWarnings("unused")
	private int ways (int n) {
	        if(n <= 2){
	            return n;
	        }
	        
	        int oneStep = 1;
	        int twoStep = 2;
	        int all_Ways = 0;
	        
	        for(int i=2; i<n; i++){
	            all_Ways = oneStep + twoStep;
	            oneStep = twoStep;
	            twoStep = all_Ways;
	        }
	        
	        return all_Ways;
	}
}
