//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        String firstName1 = "Ivanov ";
        String middleNAme1 = "Ivan ";
        String lastName1 = "Ivanovich";
        String fullName1 = firstName1 + middleNAme1 + lastName1;
        System.out.println("Ф.И.О сотрудника " + fullName1);

        System.out.println("Задание 2");

        String firstName2 = "Ivanov ";
        String middleNAme2 = "Ivan ";
        String lastName2 = "Ivanovich";
        String fullName2 = firstName2 + middleNAme2 + lastName2;
        System.out.println("Ф.И.О сотрудника " + fullName2.toUpperCase());

        System.out.println("Задание 3");

        String firstName3 = "Иванов ";
        String middleNAme3 = "Семён ";
        String lastName3 = "Семёнович";
        String fullName3 = firstName3 + middleNAme3 + lastName3;
        System.out.println(fullName3.replace("ё", "е"));
    }
}