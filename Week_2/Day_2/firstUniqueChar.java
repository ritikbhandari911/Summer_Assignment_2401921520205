class Solution {
    public int firstUniqChar(String s) {

        int[] count = new int[26];


        //step 1 - count frequency 
        for( int i = 0 ; i < s.length() ; i++){
            count[s.charAt(i) - 'a']++;
        }
        //step 2 - find the first non repeating letter
        for ( int i = 0 ; i<s.length() ; i++){
            if(count[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
        
    }
}
