


public class NumberUtilities {
        public static String getRange(int stop) {
            String numString = "";
            for(int x = 0; x < stop; x++){
                numString += x;
            }
            return numString;
        }

        public static String getRange(int start, int stop) {
            String numString = "";
            for(int x = start; x < stop; x++){
                numString += x;
            }
            return numString;
        }


        public static String getRange(int start, int stop, int step) {
            String numString = "";
            for(int x = start; x < stop; x =+ step){
                numString += x;
            }
            return numString;
        }

        public static String getEvenNumbers(int start, int stop) {
            String numString = "";
            for (int x = start; x < stop; x++) {
                if (x % 2 == 0) {
                    numString += x;
                }
            }
            return numString;
        }


            public static String getOddNumbers(int start, int stop) {
                String numString = "";
                for(int x = start; x < stop; x++){
                    if(x % 2 ==1){
                        numString += x;
                    }
                }
                return numString;
            }


            public static String getExponentiations(int start, int stop, int exponent) {
                String numString = "";
                for(int x = start; x <= stop; x++){
                    numString += ((int)Math.pow(x, exponent));
                }
                return numString;
            }
        }