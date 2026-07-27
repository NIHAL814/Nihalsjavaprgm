public class strings {
    public static void main(String[] args) {
        String s1="Java";
        String s2="programming";
        System.out.println("Length:"+s1.length());
        System.out.println("Character at index 2:"+s1.charAt(2));
        System.out.println("Substring:"+s2.substring(0,7));
        System.out.println("Concatenation:"+s1.concat(s2));
        System.out.println("Equals:"+s1.equals("java"));
        System.out.println("Uppercase:"+s1.toUpperCase());
        System.out.println("Lowercase:"+s2.toLowerCase());
        System.out.println("index of v:"+s1.indexOf('v'));
}
}
