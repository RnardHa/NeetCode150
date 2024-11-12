package HackerRank;

public class ConvertTime {
    public String solution() {
        return timeConversion("12:45:54PM");
    }

    public static String timeConversion(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder();

        var split = s.split(":");
        // get day or night
        var condition = split[2].substring(2);

        int hour = Integer.valueOf(split[0]);
        String min = split[1];
        String sec = split[2].substring(0,2);

        if (condition.equals("PM")) { //12-23
            if (hour == 12) {
                sb.append(split[0]);
            } else {
                sb.append(hour + 12);
            }
        } else { // AM 00-11
            if (hour != 12) {
                sb.append(split[0]);
            } else {
                sb.append("00");
            }
        }
        sb.append(':');
        sb.append(min);
        sb.append(':');
        sb.append(sec);

        return sb.toString();
    }
}
