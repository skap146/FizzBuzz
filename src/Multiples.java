public class Multiples
{
    public static int main(int a, int n, int b)
    {
        int i = 0;
        int multiplesOf3Or5 = 0;

        while (i < n)
        {
            if (i % a == 0 || i % b == 0)
            {
                multiplesOf3Or5 ++;
            }

            i++;
        }

        return multiplesOf3Or5;
    }

}


