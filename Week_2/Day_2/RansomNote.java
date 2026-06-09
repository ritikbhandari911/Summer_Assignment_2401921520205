class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        //step 1 -count the letters of both the strings 
        for ( int i = 0 ; i < magazine.length() ; i++){
            count[magazine.charAt(i) - 'a']++;
        }
        // step 2 - use the letters of magazine for ransomNote
        for ( int i = 0 ; i < ransomNote.length() ; i++){
            char c = ransomNote.charAt(i);
            if(count[c - 'a'] == 0 ){
                return false;

            }
            count[c - 'a']--;

         }
         return true;
        }
        
    }

