public class Arabian_numbers {
    static boolean ifarabian(String input) throws Exception{
        boolean[] operand_arabian_ok = {false, false};
        String[] arabiannumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] operands = input.split("[+\\-*/]");
        for (int i = 0; i <operands.length; i++) {
            for (int j = 0; j < arabiannumbers.length; j++) {
                if (operands[i].equals(arabiannumbers[j]) ) operand_arabian_ok[i] = true;

            }
        }
        if (operand_arabian_ok[0] && operand_arabian_ok[1]) return true;
        else return false;

    }
}