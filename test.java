public class test {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findodd(nums));
    }
    static int findodd (int[] nums){
        int count=0;
        for(int num:nums){
            if(odd(num)){
                count++;
            }
        }
        return count;
    }
    static boolean odd(int num){
        int numberofdigits=digits(num);
        return numberofdigits%2==1;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
