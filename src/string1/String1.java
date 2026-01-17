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




}
