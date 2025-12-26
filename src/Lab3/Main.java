package Lab3;

public class Main {
    public static void main(String[] args) {

        GroupCommand g = new GroupCommand();
        g.setUniqueNumber(9);

        g.add(new Command("Иванов", "1", "рядовой", "01.01.2004", "01.09.2023", "A-123"));
        g.add(new Command("Петров", "2", "сержант", "05.06.2003", "10.10.2022", "B-777"));
        g.add(new Command("Сидоров", "1", "лейтенант", "11.11.2002", "01.02.2021", "A-123"));
        

        System.out.println(g);

        g.sortBySurname();
        System.out.println("После сортировки:");
        System.out.println(g);

        g.deleteBySurname("Петров");
        System.out.println("После удаления:");
        System.out.println(g);
    }
}

