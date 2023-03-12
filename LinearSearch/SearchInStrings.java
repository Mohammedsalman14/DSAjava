package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="Salman";
        char target='l';
        // System.out.println(search(name,target));
        System.out.println(search2(name,target));

    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if(target==str.charAt(index)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char element:str.toCharArray()){
            if(target==element){
                return true;
            }
        }
        return false;
    }
}
