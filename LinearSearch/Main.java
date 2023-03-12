package LinearSearch;


/**
 * test
 */
public class Main {

    public static void main(String[] args) {
        
        int[] arr={12,3,445,674,2,21};
        int target=12   ;
        System.out.println(linearsearch(arr, target));
        System.out.println(linearsearch2(arr, target));

        
    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //  run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            // check every element at every index = if(index==targer)
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
    static int linearsearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }
    static boolean linearsearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}