class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int temp=n;
        int result=0;
        while (temp!=0){
                int l=temp%10;
                sum=sum+l;
                product=product*l;
                temp=temp/10;

        }
        result=product-sum;
        return result;
    }
}
