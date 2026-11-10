public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        int length = x.length();
        if (length < 2) {
            return false;
        }
        String lastTwo = x.substring(length-2);
        return lastTwo.equals("ly");
    }

    public String conCat(String s1, String s2) {
        String result = "";
        if (s2.length() == 0) {
            return s1;   
        } else {
            if (s1.length() == 0) {
                return s2;
            }
        }
        String s1Last = s1.substring(s1.length()-1);
        String s2First = s2.substring(0,1);
        if (s1Last.equals(s2First)) {
            result = s1.substring(0,s1.length()-1);
            result += s2;
        } else {
            result = s1 + s2;
        }
        return result;
    }

    public String withoutX(String s1) {
        String result = s1;
        String first = s1.substring(0,1);
        String last = s1.substring(s1.length()-1);
        if (first.equals("x")) {
            result = result.substring(1,result.length());
        }
        if (last.equals("x")) {
            result = result.substring(0,result.length()-1);
        }
        return result;
    }

    public String fizzString(String s1) {
        String result = "";
        String first = s1.substring(0,1);
        String last = s1.substring(s1.length()-1);
        if (first.equals("f")) {
            result += "Fizz";
        }
        if (last.equals("b")) {
            result += "Buzz";
        }
        if (result.length() == 0){
            return s1;
        }
        return result;
    }

    public String fizzString2(int x) {
        String result = "";
        if (x%3 == 0) {
            result += "Fizz";
        }
        if (x%5 == 0) {
            result += "Buzz";
        }
        if (result.length() == 0){
            result = x + "!";
        } else {
            result += "!";            
        }
        return result;
    }
}
