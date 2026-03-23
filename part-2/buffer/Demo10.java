// public stringbuffer replace(int beginIndex,int endIndex,String s)
class Demo10 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        sb.replace(1, 3, "programming");
        System.out.println(sb);
    }
}