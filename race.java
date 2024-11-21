
/**
 * 在这里给出对类 race 的描述。
 * 
 * @author (你的名字)
 * @version (一个版本号或者一个日期)
 */
import java.util.*;
public class race
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mintime = 10000;
        String winner = "";
        int num = input.nextInt();
        input.nextLine();
        String [] name = new String[num];
        int [] time = new int[num];
        for (int i = 0;i < num; i ++){
            name[i] = input.nextLine().split(" ")[0];
            time[i] = Integer.parseInt(input.nextLine().split(" ")[1]);
        }
        for (int i =0;i< num; i++){
            if (time [i] < mintime){
                winner = name[i];
            }
        }
        System.out.println(winner);
    }
}
