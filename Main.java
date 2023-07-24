import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("******* Task #1 ********");
        System.out.println();

        int open1 = 9;
        int open2 = 10;
        int open = Math.min(open1, open2);
        int close1 = 19;
        int close2 = 20;
        int close = Math.max(close1, close2);

        System.out.println(open);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time: ");
        int time;

        while (true) {
            time = sc.nextInt();
            if (time < 0 || time >= 24)
                System.out.println("Enter the valid value: ");
            else break;
        }
        System.out.println(time);

        if (time < open || time > close2) System.out.println("Both shops are closed");
        else if (isEdekaOpen(time, open1, close1) && isReweOpen(time, open2, close2))
            System.out.println("Both shops are closed");
        else if (isEdekaOpen(time, open1, close1)) System.out.println("Only Edeka is open");
        else System.out.println("Only Rewe is open");

    }


    public static boolean isEdekaOpen(int time, int open, int close) {
        if (time >= open && time < close) return true;
        else return false;
    }

    public static boolean isReweOpen(int time, int open, int close) {
        if (time >= open && time < close) return true;
        else return false;
    }


// TASK 2 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите какой год : ");
            int year = scanner.nextInt();
            if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
                System.out.println("Год высокосный");
            } else {
                System.out.println("Не высокосный");
            }
        }
    }


    //TASK #3!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x, y, z;
            System.out.println("Введите первое число");
            x = scanner.nextInt();
            System.out.println("Ведите второе число");
            y = scanner.nextInt();
            System.out.println("Ведите третье число");
            z = scanner.nextInt();
            int max = x;
            if (y > max) {
                max = y;
            }
            if (z > max) {
                max = z;

            }
            System.out.println("Самое большое число из трёх " + max);
            int min = x;
            if (y < min) {
                min = y;
            }
            if (z < min) {
                min = z;
            }
            System.out.println("Самое маленькое число из трёх " + min);
            int midl = x;
            if (y < max && y > min) {
                midl = y;
            }
            if (z < max && z > min) {
                midl = z;

            }
            System.out.println("Это среднее число " + midl);
            System.out.println();

            System.out.println(" Максимальное значение из трёх чисел " + max +"" + midl + "" + min);

        }
    }


}
