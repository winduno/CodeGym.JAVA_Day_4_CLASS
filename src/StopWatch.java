import java.util.Date;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime() {
        this.startTime = new Date().getTime();
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime() {
        this.endTime = new Date().getTime();
    }
    public long getElapesdTime(){
        return this.endTime - this.startTime;
    }
}
