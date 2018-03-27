public class MainClass
{
    public static void main(String[] args)
    {
        ArrayMethods meth = new ArrayMethods();

        meth.createArray();
        meth.printArray();
        System.out.println("Max = "+meth.maxValue());
        System.out.println("Average = "+meth.averageValue());

    }
}
