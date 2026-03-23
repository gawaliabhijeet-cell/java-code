// public stringbuffer append()

class Demo5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb.append("programming"));
        System.out.println(sb.append(23));
        System.out.println(sb.append(true));
        System.out.println(sb.append(55.55));
    }
}