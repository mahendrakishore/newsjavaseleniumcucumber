package JavaProgram;

public class StringCompare {

    public static void main(String[] args) {
        String s1 = "mahendra";
        String s2 = "mahendra";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3 = new String("mahendra");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        String s4 =s2;
        System.out.println(s1==s4);


    }

}

