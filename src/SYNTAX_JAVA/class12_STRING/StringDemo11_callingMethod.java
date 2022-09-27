package SYNTAX_JAVA.class12_STRING;

import SYNTAX_JAVA.class12_UTILITYS.StringUtils;

public class StringDemo11_callingMethod {
    public static void main(String[] args) {
        String str = "Thor love and thunder";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                System.out.println(i);
            }
        }
        StringUtils strUtils = new StringUtils();
        strUtils.printAllIndexes(str, 'e');
        

    }
}
