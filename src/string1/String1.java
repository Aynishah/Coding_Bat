package string1;

public class String1 {
    public static void main(String[] args) {

    }

    public String helloName(String name) {
        return "Hello " + name +"!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + "/" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    public String extraEnd(String str) {
        String lasttwo = str.substring(str.length() - 2);
        return lasttwo + lasttwo + lasttwo;
    }

    public String firstTwo(String str) {
        if (str.length()> 2){
            return str.substring(0,2);
        } else {
            return str.substring(0);
        }
    }

    public String firstHalf(String str) {
        int half = str.length()/2;
        return str.substring(0,half);
    }

    public String withoutEnd(String str) {
        int middle = (str.length() - 1);
        return str.substring(1,middle);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()){
            return b + a + b;
        } else if (a.length() < b.length()){
            return a + b + a;
        } else {
            return a+b;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        if (str.length()>2){
            String firstletter = str.substring(0,2);
            String other = str.substring(2);
            return other + firstletter;
        } else{
            return str;
        }
    }

    public String right2(String str) {
        String end = str.substring(str.length()-2);
        String start = str.substring(0,str.length()-2);
        return end + start;
    }

    public String theEnd(String str, boolean front) {
        if (front == true){
            String str1 = str.substring(0,1);
            return str1;
        }else {
            String str1 = str.substring(str.length()-1);
            return str1;
        }
    }

    public String withouEnd2(String str) {
        if (str.length() > 2) {
            int middle = str.length() - 1;
            return str.substring(1, middle);
        } else {
            return "";
        }
    }

        public String middleTwo(String str) {
            int first = (str.length()/2) ;
            return str.substring(first - 1, first + 1);
        }

    public boolean endsLy(String str) {
        boolean ly = true;
        if (str.endsWith("ly")){
            return ly ;
        } else {
            return !ly;
        }
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        String st = "";
        if(index < 0 || index >= str.length()-1){
            st = str.substring(0,2);
        } else {
            st = str.substring(index, index+2);
        }
        return st;
    }







}
