package ss4_OOP.bai_tap.StopWatch;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;
//        startTime = new Date();

    public StopWatch() {
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = new Date();
        System.out.println(this.startTime);
    }

    public void stop() {
        this.endTime = new Date();
        System.out.println(this.endTime);

    }

    public long getElapsedTime() {
        return this.getStartTime().getTime() - this.getEndTime().getTime();
    }
}
