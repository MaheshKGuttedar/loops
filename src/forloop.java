public class forloop {
    public  static void main(String[] agrs){

//print name 10 times
        for(int i=0; i<10; i=i+1){

                System.out.println("mahesh" + i);

        }
//print 100 to 0 using for loops
        for (int j= 100; j>0; j=j-1){

            System.out.println(j);

        }
// add numbers from 0 to 9 using for loops
        int input = 9;
        int sum = 0;

        for(int i = 0; i <= input; i++)
        {
            sum = sum + i;
            System.out.println("adding the numbers  " + i + " is : " + sum);
        }

        System.out.println("Sum of  all the numbers " + input + " is " + sum);

    }

        }


