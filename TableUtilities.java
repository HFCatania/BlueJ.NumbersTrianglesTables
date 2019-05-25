 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        String rowString = "";
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 6; j++){
                int numHolder = i * j;
                if (numHolder < 10){
                    rowString += "  " + numHolder + " |";
                } else if (numHolder < 100){
                    rowString += " " + numHolder + " |";
                } else {
                    rowString += numHolder + " |";
                }
            }
         result += rowString + "\n";
         rowString = "";
        }
        System.out.println(result);
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        String rowString = "";
        for(int i = 1; i < 11; i++){
            for(int j = 1; j < 11; j++){
                int numHolder = i * j;
                if (numHolder < 10){
                    rowString += "  " + numHolder + " |";
                } else if (numHolder < 100){
                    rowString += " " + numHolder + " |";
                } else if (numHolder >100){
                    rowString += "" + numHolder + " |";
                } else {
                    rowString += numHolder + " |";
                }
            }
         result += rowString + "\n";
         rowString = "";
        }
        System.out.println(result);
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        String rowString = "";
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                int numHolder = i * j;
                if (numHolder < 10){
                    rowString += "  " + numHolder + " |";
                } else if (numHolder < 100){
                    rowString += " " + numHolder + " |";
                } else {
                    rowString += numHolder + " |";
                }
            }
         result += rowString + "\n";
         rowString = "";
        }
        System.out.println(result);
        return result;
    }
}
