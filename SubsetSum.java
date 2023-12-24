import java.util.ArrayList;
import java.util.List;

class Solution{
    public void solve(List<Integer> nums, List<Integer> helper, int i, int sum, int n, int target){
        if(i == n){
            if(sum == target){
                System.out.println(helper);
            }
            return ;
        }
        sum += nums.get(i);
        helper.add(nums.get(i));
        solve(nums, helper, i+1, sum, n, target);
        sum -= nums.get(i);
        helper.remove(helper.size()-1);
        solve(nums, helper, i+1, sum, n, target);
    }
}

public class SubsetSum {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(3,1,2,4));
        List<Integer> helper = new ArrayList<>();
        int target = 3;
        int n = nums.size();
        Solution obj = new Solution();
        obj.solve(nums, helper, 0, 0, n, target);
    }    
}
