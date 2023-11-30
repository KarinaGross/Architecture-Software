import java.util.ArrayList;
import java.util.List;

public class BusRoute {

    private int id;
    private String remark;
    private int capacity;
    private List<BusStop> busStops;

    public BusRoute(int id, String remark, int capacity) {
        this.id = id;
        this.remark = remark;
        this.capacity = capacity;
        this.busStops = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public void addBusStop(BusStop busStop) {
        this.busStops.add(busStop);
    }

}