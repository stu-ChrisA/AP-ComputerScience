public class HailStone1
{
    public static void main(String[] args)
    {
        int start = 200;
        int steps = 0;
        System.out.print(start + " ");
        for(int i = 1; i < 200; i++)
        {
            if(start%2 == 0)
            {
                start = start/2;
                steps++;
            }
            else if(start%2 != 0)
            {
                start = start * 3 + 1;
                steps++;
            }
            System.out.print(start + " ");
        }
        
            System.out.println("Steps: " + steps + " Took this amount of steps");
        //a - Yes all intergers eventually reach this cycle
        //b - The maxium is the amount it's starting with until it hits the number 1
        
    }
}
