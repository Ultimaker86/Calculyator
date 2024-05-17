class Roman_numbers {
    static String[] romanSimbols = new String[]{"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII", "XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};

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