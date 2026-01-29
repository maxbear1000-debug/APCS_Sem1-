public class StepTracker{
    private int minActiveSteps;
    private int daysTracked;
    private int totalSteps;   
    private int activeDaysCount;
    
    
    
     public StepTracker(int minActiveSteps) {
        
        this.minActiveSteps = minActiveSteps;
        this.daysTracked = 0;
        this.totalSteps = 0;
        this.activeDaysCount = 0;
    }
    
    public void addDailySteps(int steps) {
        
        daysTracked++;
        totalSteps += steps;
        if (steps >= minActiveSteps) {
            activeDaysCount++;
        }
    }
    
     public int activeDays() {
        return activeDaysCount;
    }
    
     public double averageSteps() {
        return (double) totalSteps / daysTracked;
    }
    
      public int getDaysTracked() {
        return daysTracked;
    }
    
     public int getTotalSteps() {
        return totalSteps;
    }
    
    
    
    
    
    
}