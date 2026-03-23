// pubic string substring(int beginIndex)
// public string substring(int begingindex,endindex)

class Demo4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java programming");
        System.out.println(sb.substring(5));
        System.out.println(sb.substring(0, 9));
    }
}