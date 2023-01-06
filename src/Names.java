public class Names {
    String fname;
    String lname;
    public static int cidNumber=1;
    public static boolean citizen = true;
    public Names(String first, String last) {
        fname = first;
        lname = last;
    }
   public Boolean CheckFirstisA() {
        return ((fname.charAt(0) == 'A'));
    }
}
