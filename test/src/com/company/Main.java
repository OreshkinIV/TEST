package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int[] test(int n)
    {
        int[] array;
        List<Integer> ListArray = new ArrayList<>();

        // генерация случайной длины первого массива
        int length = ((int)(Math.random() * 10) + 1);
        System.out.println("Случайная длина первого массива = " + length);

        for (int j = 0; j < n ; j++)
        {
            array = new int[length];
            for (int i = 0; i < length; i++)
            {
                array[i] = ((int)(Math.random() * 100) - 50);
                System.out.print(array[i] + " ");
            }
            System.out.println();    System.out.println();
            // сортировка массива
            // если массив имеет четный порядковый номер, то сортируем по возрастанию
            if ((j+1)%2 == 0)
            {
                Arrays.sort(array);
            }
            // иначе по убыванию
            else {

                int temp;
                for (int m = 0; m < length; m++)
                {
                    for (int k = m + 1; k < length; k++)
                    {
                        if (array[m] < array[k])
                        {
                            temp = array[m];
                            array[m] = array[k];
                            array[k] = temp;
                        }
                    }
                }
            }

            System.out.println("Отсортированный массив");
            for (int i = 0; i < length; i++)
            {
                System.out.print(array[i] + " ");
                ListArray.add(array[i]);
            }

            System.out.println();    System.out.println();

            // будем увеличивать длины следующих массивов на 1, чтобы они не повторялись
            length = length + 1;
            if ((j+2) <= n)
            {
                System.out.println("Длина " + (j+2) + " массива = " + length);
            }
        }

        System.out.println("Отсортированные массивы");
        int[] arr = new int[ListArray.size()];
        for (int i = 0; i <  ListArray.size(); i++)
        {
            arr[i] =  ListArray.get(i);
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    public static void main(String[] args)
    {
        System.out.print("Тестовое задание");
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество массивов (n>0): ");
        int n = in.nextInt();
        // количество массивов не должно быть < 1
        if (n<=0)
        {
            System.out.println("n<=0");
            System.out.println();
            System.exit(1);
        }
        System.out.println();
        test(n);
    }
}
