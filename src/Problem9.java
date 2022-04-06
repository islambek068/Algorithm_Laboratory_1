public class Problem9 {
    public int rec(int n,int k){
        if(k==n || k==0)
            return 1;
        return rec(n-1, k-1) + rec(n-1, k);
    }
}
