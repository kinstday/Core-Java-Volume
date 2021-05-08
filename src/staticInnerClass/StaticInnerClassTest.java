package staticInnerClass;

/**
 * @version 11.06
 * @author liubin
 */

public class StaticInnerClassTest
{
    public static void main(String[] args)
    {
        var values = new double [20];
        for(int i = 0; i < values.length; i++)
        {
            values[i] = 100 * Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(values);
        System.out.println("min=" + p.getMin() + " max=" + p.getMax());
    }
}

class ArrayAlg
{
    public static class Pair
    {
        private double min;
        private double max;

        public Pair(double min, double max)
        {
            this.min = min;
            this.max = max;
        }

        public double getMin()
        {
            return min;
        }

        public double getMax()
        {
            return max;
        }

    }
    public static Pair minmax(double[] values)
    {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for(double v : values)
        {
            if(min>v)
            {
                min = v;
            }
            if(max<v)
            {
                max = v;
            }
        }
        return new Pair(min,max);
    }
    }
