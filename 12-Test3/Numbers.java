public class Numbers implements Ok{
    private int[] nums;

    public Numbers(int[] nums) {
        this.nums = nums;
    }

    @Override
    public boolean ok() {
        boolean flag = true;
        for (int i=0; i<nums.length; i++) {
            if (i%2==0 || i==0) {
                if (nums[i]%2==0) {
                    flag = true;
                } else {
                    return false;
                }
            } else if (i%2!=0) {
                if (nums[i]%2!=0) {
                    flag = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
