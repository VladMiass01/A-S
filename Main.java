/*Начинаем реализацию хэш-таблицы с подготовки структуры и
        необходимых классов.*/

public class Main {
    public static void main(String[] args) {
        HashTable<Integer, String> table = new HashTable<>();
        table.putNode(1, "str");
        table.putNode(2, "str2");
        table.putNode(2, "str11");
        table.putNode(2, "str14");
        table.putNode(3, "str3");
        table.putNode(4, "str3");
        System.out.println(table.get(2));
        System.out.println(table.get(6));
    }
}