import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class AddToArray {

    public List <Integer> AddToArray(int []num, int k){
        List<Integer> ans = new ArrayList<>();

        int p = num.length-1;

        int carry = 0;

        while (p>=0 || k>0) {
            int numvalu = 0;
            if(p>=0){
            numvalu = num[p];
            }
            int d = k % 10;
            int sum = numvalu + d + carry;
            int digit = sum % 10;
            carry =  sum/10;

            ans.add(digit);

            p--;
            k = k/10;
        }
        if(carry > 0){
            ans.add(carry);
        }
        Collections.reverse(ans);       
        return ans;
    }
}
