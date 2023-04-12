package mypackage;
import java.util.Arrays;

public class StringUtils {
    public boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }

        char[] s1chars = s1.toCharArray();
        char[] s2chars = s2.toCharArray();

        Arrays.sort(s1chars);
        Arrays.sort(s2chars);

        for (int i = 0; i < s1chars.length; i++){
            if (s1chars[i] != s2chars[i]){
                return false;
            }
        }
        
        return true;
    }
}