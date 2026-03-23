// public stringbuffer inset()
class Demo9 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        sb.insert(3, "programming");
        sb.insert(0, "why");

        sb.insert(3, 34);
        sb.insert(9, 56.56);
        System.out.println(sb);
    }
}