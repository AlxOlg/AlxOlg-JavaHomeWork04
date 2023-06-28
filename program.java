package JavaHomeWork04;

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, 
// чтобы последняя введенная была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
// 4. Если введено exit, то программа завершается.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String inputValue = scanner.nextLine();
                if ("exit".equals(inputValue)) {
                    System.exit(0);
                } else if ("print".equals(inputValue)) {
                    System.out.println(deque);
                } else if ("revert".equals(inputValue)) {
                    deque.removeFirst();
                } else {
                    deque.addFirst(inputValue);
                }
            }
        }
    }
}
