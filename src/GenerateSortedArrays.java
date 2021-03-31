import java.util.*;
public class GenerateSortedArrays {

        static String max;

        static void findMaximumNum(char[] s1,int x)
        {

            if (x == 0)
                return;
            int n = s1.length;
            for (int i=0;i<n-1;i++)
            {
                for (int j=i+1;j<n;j++)
                {

                    if (s1[i] < s1[j])
                    {

                        char t = s1[i];
                        s1[i] = s1[j];
                        s1[j] = t;
                        if (String.valueOf(s1).compareTo(max) > 0)
                            max = String.valueOf(s1);
                        findMaximumNum(s1, x - 1);
                        char c = s1[i];
                        s1[i] = s1[j];
                        s1[j] = c;
                    }
                }
            }
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);

            String s1 = sc.next();
            int k = sc.nextInt();
            max = s1;
            findMaximumNum(s1.toCharArray(), k);
            System.out.print(max + "\n");
        }
    }