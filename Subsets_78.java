import java.util.ArrayList;
import java.util.List;

class Solution{
    public void solve(List<Integer> nums, List<Integer> helper, List<List<Integer>> result, int i, int n){
        if(i>=n){
            result.add(new ArrayList<>(helper));
            return ;
        }
        helper.add(nums.get(i));
        solve(nums, helper, result, i+1, n);
        helper.remove(helper.size()-1); 
        solve(nums, helper, result, i+1, n);
    }
}

public class Subsets_78 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1,2,3));
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        
        Solution obj = new Solution();
        int n = nums.size();
        obj.solve(nums,helper,result,0,n);
        System.out.println(result);
    }
}
