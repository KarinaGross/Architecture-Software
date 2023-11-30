import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

public class Ticket {
    private BigDecimal price;
    private Date date;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int roadNumber;

    // Предполагается, что цена, место и платформа заполняются из базы данных

    public Ticket(Date date, int startZone, int finishZone, boolean isLuggage) {
        this.date = date;
        this.startZone = startZone;
        this.finishZone = finishZone;
        this.isLuggage = isLuggage;
        setPrice();
        setPlace();
        setRoadNumber();
    }

    private void setPrice() {
        BigDecimal price = new BigDecimal(Math.random()); // берем рандомное число, но вообще брали бы конкретную
                                                          // стоимость билета из БД
        this.price = price;
    }

    private void setPlace() {
        int place = new Random().nextInt(50) + 1; // будем считать, что в автобусе максимум 50 мест
        this.place = place;
    }

    private void setRoadNumber() {
        int roadNumber = new Random().nextInt(10) + 1;
        this.roadNumber = roadNumber;
    }

}
