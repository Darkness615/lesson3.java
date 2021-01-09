import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class lesson3 {
    static Scanner scanner=new Scanner (System.in);
    static Random random= new Random();

    public static void main (String[] args)
    {
        vibor();

    }


    static void checknum()
    {
        int n= random.nextInt(10);


       for (int i =0 ; i<3; ++i)
        {
            System.out.println("Введите число");
            int m = scanner.nextInt();
            if (n<m)
            {
                System.out.println("Число меньше");
            }
            else if (n>m)
            {
                System.out.println("Число больше");
            }
            else
            {
                System.out.println("Вы угадали!");
                break;
            }

        }
        System.out.println("Загаданное: " + n);
    }


    static void povtor()
    {
        int n;
        do
        {
            checknum();
            System.out.println("Хотите ещё раз сыграть в угадай число?\n 0 - да 1 - нет");
            n = scanner.nextInt();
        }
        while (n!=1);
    }


    static void vibor () {
        int j;
        int m;
        do
        {

                System.out.println("В какую игру хотите сыграть?\n 0 - Угадай число 1 - Угадай слово");
                m = scanner.nextInt();
                if (m == 0) povtor();
                else povtor2();
                System.out.println("Вы хотите сыграть?\n 0 - да 1 - нет");
                j = scanner.nextInt();

        } while (j!=1 );

    }


    static void povtor2()
    {
        int n;
        do
        {
            checkword();
            System.out.println("Хотите ещё раз сыграть в угадай слово?\n 0 - да 1 - нет");
            n = scanner.nextInt();
        }
        while (n!=1);

    }


    static void checkword() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        String str;
        int n = random.nextInt(words.length);
        /*System.out.println(words[n]);*/
        System.out.println("Программа загадала слово, угадайте какое ");
        char[] chs = words[n].toCharArray();
        char[] chCmp = new char[chs.length];
        for (int i = 0; i < chs.length; ++i)
        {
            chCmp[i] = '*';
        }
        do  {
            System.out.print("Введите слово: " );
            str = scanner.nextLine();

            if (str.equals(words[n]))
            {
                System.out.println("Вы угадали");
                break;
            }
            else
            {
                System.out.println("Вы не угадали");
                char[] chWord = str.toCharArray();

                for (int i = 0; i < chs.length; i++)
                {

                    if (i >= chWord.length)
                    {
                        break;
                    }
                    if (chs[i] == chWord[i])
                    {
                        chCmp[i] = chs[i];
                        System.out.println("[" + i + "] : " + chCmp[i]);
                    }
                }
            }

        } while (true);
        System.out.println("Загаданное слово: " + words[n]);
    }



}
