 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";
        for(int i = 0; i < numberOfStars; i++) {
            result += ("*");
        }
        return result;
    }

    public static String getTriangle(int numberOfRows) {
        String result = "";
        String rowString = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < i + 1; j++){
            rowString += "*"; 
        }
        result += rowString + "\n";
        rowString = ""; 
    }
        System.out.println(result);
        return result;
    }


    public static String getSmallTriangle() {
       String result = "";
       String rowString = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++){
            rowString += "*"; 
        }
        result += rowString + "\n";
        rowString = ""; 
    }
        System.out.println(result);
        return result;
    }


    public static String getLargeTriangle() {
       String result = "";
       String rowString = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i + 1; j++){
            rowString += "*"; 
        }
        result += rowString + "\n";
        rowString = ""; 
    }
        System.out.println(result);
        return result;
    }
 }

