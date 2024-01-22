public class C3 {
    boolean[] logicalValues;

    public C3(boolean[] logicalValues) {
        this.logicalValues = logicalValues;
    }

    public int opposite() {
        int opposite = 0;
        if (this.logicalValues.length < 3) {
            return 0;
        }
        for (int i=1; i < logicalValues.length-1; i++) {
            if (logicalValues[i-1] == logicalValues[i+1] && logicalValues[i-1] != logicalValues[i] ) {
                opposite ++;
            }
        }
        return opposite;
    }
}
