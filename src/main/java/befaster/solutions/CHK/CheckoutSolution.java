package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
	static final int [][] specials = {{50,3,130},{30,2,45},{20},{15}};
    public Integer checkout(String skus) {
    	if (skus == "" || skus == null) return -1;
        //Parse string checking for invalid characters
    	for (int i=0;i < skus.length(); i++) {
    		if (skus.charAt(i) < 'A' || skus.charAt(i) > ('A' + specials.length - 1)) {
    			return -1;
    		}
    	}
    	return 0;
    }
}
