package main.java.by.intensiveJava;

public class TaskRun {

    public TaskRun() {}

    public void allTaskRun() {
        runTaskTurnString();
        runTaskGetDistinctNumbers();
        runTaskFindSecondMaxElement();
        runTaskLengthOfLastWord();
        runTaskIsPalindrome();
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
        System.out.println("// Найти длину последнего слова в строке. В строке только буквы и пробелы.\n" +
                           "// \"Hello world\" - 5\n" +
                           "// \"    fly me    to the moon    \" - 4");
        System.out.println(Homework.lengthOfLastWord("Hello world"));
        System.out.println(Homework.lengthOfLastWord("    fly me    to the moon    "));
    }

    public void runTaskIsPalindrome(){
        System.out.println("// Определить, что строка является палиндромом\n" +
                           "// Сложность по памяти O(1), не создавать новые String, StringBuilder\n" +
                           "// Примеры:\n" +
                           "// abc - false\n" +
                           "// 112233 - false\n" +
                           "// aba - true\n" +
                           "// 112211 - true");
        System.out.println(Homework.isPalindrome("abc"));
        System.out.println(Homework.isPalindrome("112233"));
        System.out.println(Homework.isPalindrome("aba"));
        System.out.println(Homework.isPalindrome("112211"));
    }}