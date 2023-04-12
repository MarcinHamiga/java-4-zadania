import mypackage.StringUtils;

public class Main3 {
    public static void main(String[] args){
        StringUtils strut = new StringUtils();
        String s1 = "armia";
        String s2 = "miara";
        String s3 = "pasta";
        String s4 = "tapas";

        System.out.println(strut.isAnagram(s1, s2));
        System.out.println(strut.isAnagram(s2, s3));
        System.out.println(strut.isAnagram(s3, s4));

    }
}