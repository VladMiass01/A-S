public class Main {
    public static void main(String[] args) {
        HashTable<Integer, String> table = new HashTable<>();
        table.putNode(1, "str1");
        table.putNode(2, "str2");
        table.putNode(2, "str11");
        table.putNode(2, "str14");
        table.putNode(3, "str3");
        table.putNode(4, "str15");
        table.putNode(4, "str16");
        table.putNode(4, "str17");
        System.out.println(table.get(2));
        System.out.println(table.get(4));
        System.out.println(table.get(6));
        System.out.println("\n");
        table.lpt();
    }
}
