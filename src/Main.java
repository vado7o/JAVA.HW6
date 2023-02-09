import java.util.*;

public class Main {
    static Random rnd = new Random();
    static Map<Integer, String> brand_col = new HashMap<>();
    static Map<Integer, String> ram_col = new HashMap<>();
    static Map<Integer, String> hdd_col = new HashMap<>();
    static Map<Integer, String> os_col = new HashMap<>();
    static Map<Integer, String> color_col = new HashMap<>();
    static NoteBook noteBook1 = new NoteBook();
    static NoteBook noteBook2 = new NoteBook();
    static NoteBook noteBook3 = new NoteBook();
    static NoteBook noteBook4 = new NoteBook();
    static NoteBook noteBook5 = new NoteBook();
    static NoteBook noteBook6 = new NoteBook();
    static NoteBook noteBook7 = new NoteBook();
    static NoteBook noteBook8 = new NoteBook();
    static NoteBook noteBook9 = new NoteBook();
    static NoteBook noteBook10 = new NoteBook();
    static NoteBook noteBook11 = new NoteBook();
    static NoteBook noteBook12 = new NoteBook();
    static NoteBook noteBook13 = new NoteBook();
    static NoteBook noteBook14 = new NoteBook();
    static NoteBook noteBook15 = new NoteBook();
    static NoteBook noteBook16 = new NoteBook();
    static NoteBook noteBook17 = new NoteBook();
    static NoteBook noteBook18 = new NoteBook();
    static NoteBook noteBook19 = new NoteBook();
    static NoteBook noteBook20 = new NoteBook();
    static NoteBook noteBook21 = new NoteBook();
    static NoteBook noteBook22 = new NoteBook();
    static NoteBook noteBook23 = new NoteBook();
    static NoteBook noteBook24 = new NoteBook();
    static NoteBook noteBook25 = new NoteBook();
    static NoteBook noteBook26 = new NoteBook();
    static NoteBook noteBook27 = new NoteBook();
    static NoteBook noteBook28 = new NoteBook();
    static NoteBook noteBook29 = new NoteBook();
    static NoteBook noteBook30 = new NoteBook();
    static NoteBook noteBook31 = new NoteBook();
    static NoteBook noteBook32 = new NoteBook();
    static NoteBook noteBook33 = new NoteBook();
    static NoteBook noteBook34 = new NoteBook();
    static NoteBook noteBook35 = new NoteBook();
    static NoteBook noteBook36 = new NoteBook();
    static NoteBook noteBook37 = new NoteBook();
    static NoteBook noteBook38 = new NoteBook();
    static NoteBook noteBook39 = new NoteBook();
    static NoteBook noteBook40 = new NoteBook();
    static List<NoteBook> catalog = new ArrayList<>();
    static String brand;
    static String color;
    static String os;
    static String hdd;
    static String ram;

    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        makeCatalog();

        System.out.println("В магазине имеются ноутбуки:");
        for (NoteBook notebook : catalog) {
            System.out.println("Фирма-изготовитель: " + notebook.brand + "/ Цвет: " + notebook.color + "/ ОЗУ: "
                    + notebook.ram + "Гб. Жёсткий диск: " + notebook.hdd + "Гб / ОС: " + notebook.os);
        }
        brand = askForString("ФИРМА-ИЗГОТОВИТЕЛЬ", brand_col);
        color = askForString("ЦВЕТ", color_col);
        os = askForString("ОПЕРАЦИОННАЯ СИСТЕМА", os_col);
        hdd = askForString("ЖЕСТКИЙ ДИСК", hdd_col);
        ram = askForString("ОПЕРАТИВНАЯ ПАМЯТЬ", ram_col);
        filter();
    }
    static String generateBrand() {
        brand_col.put(1, "ASUS");
        brand_col.put(2, "MSI");
        brand_col.put(3, "APPLE");
        brand_col.put(4, "DELL");
        brand_col.put(5, "HP");
        brand_col.put(6, "LENOVO");
        brand_col.put(7, "DNS");
        return brand_col.get(rnd.nextInt(1, 8));
    }
    static String generateRam() {
        ram_col.put(1, "4");
        ram_col.put(2, "8");
        ram_col.put(3, "16");
        ram_col.put(4, "32");
        return ram_col.get(rnd.nextInt(1, 5));
    }
    static String generateHdd() {
        hdd_col.put(1, "256");
        hdd_col.put(2, "512");
        hdd_col.put(3, "1024");
        hdd_col.put(4, "2048");
        hdd_col.put(5, "4096");
        return hdd_col.get(rnd.nextInt(1, 6));
    }
    static String generateOs() {
        os_col.put(1, "Windows 8");
        os_col.put(2, "Windows 10");
        os_col.put(3, "ASTRA Linux");
        os_col.put(4, "Linux UBUNTU");
        return os_col.get(rnd.nextInt(1, 5));
    }
    static String generateColor() {
        color_col.put(1, "Black");
        color_col.put(2, "White");
        color_col.put(3, "Graphite");
        color_col.put(4, "Blue");
        color_col.put(5, "Red");
        return color_col.get(rnd.nextInt(1, 6));
    }

    static NoteBook generateNotebook(NoteBook noteBook) {
        noteBook.brand = generateBrand();
        noteBook.os = generateOs();
        noteBook.color = generateColor();
        noteBook.hdd = generateHdd();
        noteBook.ram = generateRam();
        return noteBook;
    }

    static String askForString(String field, Map<Integer, String> list) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("\nВведите фильтр по полю " + field + ". Введите цифру или нажмите Enter для удаления данного фильтра: ");
            System.out.println(list);
            input = scanner.nextLine();
            if (input == "") return "";
            try {
                if (!list.containsKey(Integer.parseInt(input))) {
                    System.out.println("Некорректно введён номер по каталогу!!!");
                } else break;
            } catch (Exception e) {
                System.out.println("Некорректно введён номер по каталогу!!!");
            }
        }
        return list.get(Integer.parseInt(input));
    }

    static void makeCatalog() {
        catalog.add(generateNotebook(noteBook1));
        catalog.add(generateNotebook(noteBook2));
        catalog.add(generateNotebook(noteBook3));
        catalog.add(generateNotebook(noteBook4));
        catalog.add(generateNotebook(noteBook5));
        catalog.add(generateNotebook(noteBook6));
        catalog.add(generateNotebook(noteBook7));
        catalog.add(generateNotebook(noteBook8));
        catalog.add(generateNotebook(noteBook9));
        catalog.add(generateNotebook(noteBook10));
        catalog.add(generateNotebook(noteBook11));
        catalog.add(generateNotebook(noteBook12));
        catalog.add(generateNotebook(noteBook13));
        catalog.add(generateNotebook(noteBook14));
        catalog.add(generateNotebook(noteBook15));
        catalog.add(generateNotebook(noteBook16));
        catalog.add(generateNotebook(noteBook17));
        catalog.add(generateNotebook(noteBook18));
        catalog.add(generateNotebook(noteBook19));
        catalog.add(generateNotebook(noteBook20));
        catalog.add(generateNotebook(noteBook21));
        catalog.add(generateNotebook(noteBook22));
        catalog.add(generateNotebook(noteBook23));
        catalog.add(generateNotebook(noteBook24));
        catalog.add(generateNotebook(noteBook25));
        catalog.add(generateNotebook(noteBook26));
        catalog.add(generateNotebook(noteBook27));
        catalog.add(generateNotebook(noteBook28));
        catalog.add(generateNotebook(noteBook29));
        catalog.add(generateNotebook(noteBook30));
        catalog.add(generateNotebook(noteBook31));
        catalog.add(generateNotebook(noteBook32));
        catalog.add(generateNotebook(noteBook33));
        catalog.add(generateNotebook(noteBook34));
        catalog.add(generateNotebook(noteBook35));
        catalog.add(generateNotebook(noteBook36));
        catalog.add(generateNotebook(noteBook37));
        catalog.add(generateNotebook(noteBook38));
        catalog.add(generateNotebook(noteBook39));
        catalog.add(generateNotebook(noteBook40));
    }

    static void filter() {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (NoteBook noteBook: catalog) {
            if ((Objects.equals(noteBook.os, os) || Objects.equals(os, ""))
                    && (Objects.equals(noteBook.hdd, hdd) || Objects.equals(hdd, ""))
            && (Objects.equals(noteBook.ram, ram) || Objects.equals(ram, ""))
                && ((Objects.equals(noteBook.color, color)) || Objects.equals(color, ""))
                && (Objects.equals(noteBook.brand, brand) || Objects.equals(brand, ""))) {
                stringBuilder.append(noteBook+"\n");
                count++;
            }
        }
        if (count == 0) System.out.println("По выбранным Вами фильтрам НИЧЕГО НЕ найдено!!!");
        else {
            System.out.println("По выбранным Вами фильтрам найдено " + count + "товара(-ов): ");
            System.out.println(stringBuilder);
        }
    }
}

