public class Time{

    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() 
    {
        return this.hour;
    }

    public void setHour(int hour)
    {
        if(hour>=0 && hour<=23)
        {
            this.hour = hour;
        }

    }

    public int getMin() 
    {
        return this.hour;
    }
    
    public void setMin(int min)
    {
        if(min>=0 && min<=60)
        {
            this.min = min;
        }

    }

    public int getSecond()
    {
        return this.sec;
    }

    public void setSecond(int sec)
    {
        if(sec>=0 && sec<=60)
        {
            this.sec = sec;
        }

    }

    public String getCurrentTime()
    {
        return "Current "+Integer.toString(this.hour)+":"+Integer.toString(this.min)+":"+Integer.toString(this.sec);
    }
}