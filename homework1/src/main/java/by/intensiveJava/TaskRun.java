package main.java.by.intensiveJava;

import main.java.by.intensiveJava.Homework;

public class TaskRun {

    public TaskRun() {
    }

    ;

    public void allTaskRun() {
        runTaskTurnString();
        runTaskGetDistinctNumbers();
        runTaskFindSecondMaxElement();
    }

    public void runTaskTurnString() {
        System.out.println("// Перевернуть строку и вывести на консоль\n" +
                           "//  String string = \"I love Java\";");
        Homework.turnString("I love Java");
    }

    public void runTaskGetDistinctNumbers(){
        System.out.println("// int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};\n" +
                           "// Удалить дубликаты из массива и вывести в консоль");
        Homework.getDistinctNumbers(new int[] {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9});
    }

    public void runTaskFindSecondMaxElement() {
         System.out.println("// Дан массив, заполненный уникальными значениями типа int.\n" +
                            "// int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47}; /n" +
                            "// Необходимо найти элемент, который меньше максимума, "+
                            "но больше всех остальных.);");
         Integer secondMax = Homework.findSecondMaxElement(new int[] {10, 15, 23, 11, 44, 13, 66, 1, 6, 47});
         System.out.println(secondMax);
    }

    public void runTaskLengthOfLastWord() {

    }

    public void runTaskIsPalindrome(){


    }}