class Parent
{
    void putdata()
    {
        System.out.println("parent class");
    }
}

class Child extends Parent
{
    void putdata()
    {
        System.out.println("base class");
    }
}

class Over2
{
    public static void main(String arg[])
    {
        Chid c=new Chid();
        c.putdata();
    }
}