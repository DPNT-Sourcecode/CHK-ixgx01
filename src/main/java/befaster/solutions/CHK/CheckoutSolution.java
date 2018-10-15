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
        //Parse string sorting items
    	int items[] = new int[specials.length];
    	for(int item:items) {
    		item = 0;
    	}
    	int sum = 0;
    	for (int i=0;i < skus.length(); i++) {
    		int id = skus.charAt(i) - 'A';
    		if (specials[id].length > 1 &&  (++items[id])%specials[id][1]==0) {
    			sum += specials[id][0] - (specials[id][1] * specials[id][0] - specials[id][2]);
    		}else {
    			sum += specials[id][0];
    		}
    	}
    	return sum;
    	
    }
}
