public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args){
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-46));
        System.out.println(getDurationString(65, 9));
    }


    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        } else {
            int hour = minutes / 60;
            int min = minutes % 60;

            String hourString = hour + "h ";
            if(hour < 10){
                hourString = "0" + hourString;
            }

            String minString = min + "m ";
            if(min < 10){
                minString = "0" + minString;
            }

            String secString = seconds + "h ";
            if(seconds < 10){
                secString = "0" + secString;
            }

            return hourString + minString + secString;
        }
    }
    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        } else {
            int minutes = seconds / 60;
            int sec = seconds % 60;
            return getDurationString(minutes, sec);
        }
    }
}
