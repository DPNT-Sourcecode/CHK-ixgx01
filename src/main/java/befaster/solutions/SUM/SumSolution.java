package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {

    public int compute(int x, int y) {
        if (x < 0 || x > 100) throw new IllegalArgumentException("x not in range");
        if (y < 0 || y > 100) throw new IllegalArgumentException("y not in range");
        return x + y;
    }

}
