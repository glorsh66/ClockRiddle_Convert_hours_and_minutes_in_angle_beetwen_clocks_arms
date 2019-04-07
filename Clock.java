public class Clock {


    public static void main(String[] args) {

       //One must check input variables to be in a permitted range e.g.
    //an hour cannot be more than 11 and less than 0
    //a minute hand (variable) can be only in the range from 0 to 59
    //in a case when a 24 hour time is given one needs to convert given variables into
    // 12 hours time, because mechanical watches for 24 hour day are not invented yet :)

    int h = 3;
    int m = 15;

    float m_angle = m*(360/60);
    System.out.println("Угол минутной стрелки: " +  m_angle);

    float part = h+ m/60f;
    float h_angle = part * 360/12;



    System.out.println("Доля часа: " +  part);

    System.out.println("Угол часа: " +  h_angle);

    System.out.println("Угол между: " + Math.abs(m_angle - h_angle));




    }
}
