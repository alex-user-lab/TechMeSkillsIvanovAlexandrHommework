
import java.util.Random;

/*Создать класс компьютер.
        Поля:
        isOn boolean
        - процессор    Boolean
        - оперативка Boolean
        - жесткий диск Boolean
        - ресурс полных циклов работы (включений/выключений) int
        Методы:
        - метод описание(вывод всех полей)
        вывод:  [“есть”, “есть”, “есть”, 18 циклов]
        - метод включить, при включении может произойти сбой, при вызове метода
        рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
        угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
        включить нужно выдать сообщение что ему конец
        - выключить (аналогично включению)
        - при превышении лимита ресурса комп сгорает

 */
public class Computer {


        private boolean isOn;
        private  boolean Cpu = true;
        private  boolean Ram = true;
        private  boolean Sd = true;
        private static int cycleCount = 0;
        private static int maxCycleCount = 20;
        public void showDescription(){
            System.out.printf("[");
            if (isOn)
                System.out.printf("yes,");
            else
                System.out.printf("no,");
            if (Cpu)
                System.out.printf("yes,");
            else
                System.out.printf("no,");
            if (Ram)
                System.out.printf("yes,");
            else
                System.out.printf("no,");
            if (Sd)
                System.out.printf("yes,");
            else
                System.out.printf("no,");
            System.out.printf("%d",cycleCount);
            System.out.printf(" cycles");
            System.out.printf("]");
            System.out.println();
        }
        public boolean On(int n){
            int rnd;
            Random rand = new Random();
            rnd = rand.nextInt(2);
            if (cycleCount >= maxCycleCount)
            {
                System.out.println("Burned!");
                isOn = false;
                return false;
            }
            if (rnd == n){
                cycleCount++;
                System.out.println("On!");
                isOn = true;
                return true;
            }
            else {
                System.out.println("Burned!");
                isOn = false;
                return false;
            }
        }
        public boolean Off(int n){
            int rnd;
            Random rand = new Random();
            rnd = rand.nextInt(2);
            if (cycleCount >= maxCycleCount)
            {
                System.out.println("Burned!");
                return false;}
            if (rnd == n){
                cycleCount++;
                System.out.println("Off!");
                isOn = false;
                return true;
            }
            else {
                System.out.println("Burned!");
                return false;
            }
        }
    }


