import java.lang.*;
public class RandomWalk
{
    public static void main(String[] args)
    {
        int bridge = 7;
        double personPosition = 3.5;
        int greatest = 0;
        int steps = 0;
        int average;
        
        for(int i = 0; i < 50; i++)
        {
            while(true)
            {
                double movePos = Math.random();
                if(movePos > 0.5)
                {
                    personPosition++;
                    steps++;
                }
                else if(movePos < 0.5)
                {
                    personPosition--;
                    steps++;
                }
                if((personPosition < 0) || (personPosition > 7))
                {
                    break;
                }
            }
        }
        if(steps > greatest)
            {
                greatest = steps;
            }

        average = steps/50;
        System.out.println("The greatest number of steps: " + greatest);
        System.out.println("The average number of steps:  " + average);
    }
}
