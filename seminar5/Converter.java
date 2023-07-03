package seminar5;

public class Converter {

    private final int CELLS_OF_FIELD = 9;
    private final int BYTE_LENGTH = 8;
    public final String EMPTY_CELL = "0";

    public String[] convertArrayToString(int number){
        String snumber;
        snumber = Integer.toString(number);
        String[] result = new String[CELLS_OF_FIELD];

        try {
            if (snumber.length() < CELLS_OF_FIELD) {
                snumber = EMPTY_CELL.repeat(CELLS_OF_FIELD - snumber.length()) + snumber;
            } else if (snumber.length() > CELLS_OF_FIELD) {
                throw new ArrayIndexOutOfBoundsException("Incorrect number! Too long.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            snumber = "000000000";
        }

        String clearnumber = "";
        for (int i = 0; i < snumber.length(); i++) {
            result[i] = getClearSign(String.valueOf(snumber.charAt(i)));
            clearnumber += result[i];
        }
        System.out.println(snumber);
        System.out.println(clearnumber);
        return result;
    }

    public String getSign(String str){
        return switch (str) {
            case "0" -> " ";
            case "1" -> "X";
            case "2" -> "O";
            default -> " ";
        };
    }

    public String getClearSign(String str){
        return switch (str) {
            case "0" -> "0";
            case "1" -> "1";
            case "2" -> "2";
            case "3" -> "3";
            default -> "0";
        };
    }

    public byte[] getEncodeBytesArray(String[] pos) {
        byte[] result = new byte[3];
        int idx = 0;
        String y1 = "";
        String y = "";
        for (int i = 0; i <= pos.length; i++) {
            if (i==3 || i==6 || i==9) {
                result[idx] = (byte) Integer.parseInt(y, 2);
                y = ""; idx++;
            }

            if (i < 9) {
                y1 += Integer.toBinaryString(Integer.parseInt(pos[i], 10));
                if (y1.equals("0") || y1.equals("1")) y1 = "0" + y1;
                y += y1;
                y1 = "";
            }
        }

//        for (Byte b: result) {
//            System.out.println(b);
//        }
        return result;
    }

    public String[] getDecodeBytesArray(byte[] arr){
        String[] result = new String[9];
        String snumber = ""; String temp = "";
        int counter = 0;

        for (byte b: arr) {
            temp = Integer.toBinaryString(b);
            snumber += EMPTY_CELL.repeat(BYTE_LENGTH - temp.length()) + temp;
            for (int i = 2; i < 8; i+=2) {
                result[counter] = String.valueOf(Integer.parseInt(snumber.substring(i,i+2),2));
                counter++;
            }
            snumber = "";
        }
        return result;
    }
}
