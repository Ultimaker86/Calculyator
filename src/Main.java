import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа (арабских либо римских");
        System.out.println("Input: ");
        String input = scanner.nextLine(); //ввод пользователем значений и операции;
        System.out.println(calc(input));
    }

    static String detOperation(String input)  //обнаружение знака операции
    {
        if (input.contains("+")) return "+";
        else if (input.contains("-")) return "-";
        else if (input.contains("/")) return "/";
        else if (input.contains("*")) return "*";
        else return null;
    }

    public static String calc(String input) throws Exception {

        String operation;
        String result = "хз";
        int number1, number2;
        operation = detOperation(input);
        String[] operands = input.split("[+\\-*/]");

        if (Arabian_numbers.ifarabian(input) && operation != null) {
            number1 = Integer.parseInt(operands[0]);
            number2 = Integer.parseInt(operands[1]);

            if (operation.equals("+")) result = Integer.toString(number1 + number2);
            else if (operation.equals("-")) {
                result = Integer.toString(number1 - number2);
            } else if (operation.equals("/")) {
                result = Integer.toString(number1 / number2);
            } else if (operation.equals("*")) {
                result = Integer.toString(number1 * number2);

            }


            }
        else if (Roman_numbers.ifRoman(operands[0]) && Roman_numbers.ifRoman(operands[1]) && operation != null) {
                number1 = Roman_numbers.convtoArabians(operands[0]);
                number2 = Roman_numbers.convtoArabians(operands[1]);
                if (operation.equals("+")) result = Roman_numbers.convToRoman(number1 + number2);
                else if (operation.equals("-")) {
                    result = Roman_numbers.convToRoman(number1 - number2);
                } else if (operation.equals("/")) {
                    result = Roman_numbers.convToRoman(number1 / number2);
                } else if (operation.equals("*")) {
                    result = Roman_numbers.convToRoman(number1 * number2);

                }



            }
        else throw new Exception("Числа не прошли проверку. Калькулятор умеет работать только с целыми арабскими2 числами от 0 до 10, либо римскими цифрами от I до X одновременно. Введите операцию заново");
        System.out.println("Output: ");
        return result;
        }

    }



























       /*

        String res=calc((String) inp);
        info(res);


    }

      public static String calc(String input){
          String sumstr=input+input;
          return sumstr;
        }
        public static void info(String result){
        System.out.println(result);
        }
        */

