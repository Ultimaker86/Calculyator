class Roman_numbers {
    static String[] romanSimbols = new String[]{"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};

    static boolean ifRoman(String value) {
        for (int i = 0; i < romanSimbols.length; i++) {
            if (value.equals(romanSimbols[i])) {
                return true;
            }
        }
        return false;
    }

    static String convToRoman(int arabian_number) {

        return romanSimbols[arabian_number];
    }


    static int convtoArabians(String romaninput) {
        for (int i = 0; i < romanSimbols.length; i++) {
            if (romaninput.equals(romanSimbols[i])) {
                return i;
            }
        }
        return -1;

    }
}