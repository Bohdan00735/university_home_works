package first_work;

import java.util.Scanner;

public class lets_do_it {
    public static void main(String[] args) {
        int first_oper = 8119%2;
        double constant= 8119%3;
        int second_operation = 8119%5;
        int type_of_index = 8119%7;
        double result = 0;
        int count_dev_by_zero = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        double n = scanner.nextDouble();
        System.out.println("Input m");
        double m = scanner.nextDouble();

        System.out.println("First_operator: -, because c2 = " + first_oper);
        System.out.println("First_operator: -, because c5 = " + second_operation);
        System.out.println("type of index is double , because c7 = " + type_of_index);
        System.out.println("const = " + constant);

        for (double i =1; i < n;i++){
            for (double j = 1;j < m;j++){
                if (i - constant == 0.0){
                    count_dev_by_zero++;
                }else {
                    result += (i-j)/(i-constant);
                }
            }
        }
        System.out.println("result = " + result);
        System.out.println("/ by zero has happened : " + count_dev_by_zero + " times");
    }
}
