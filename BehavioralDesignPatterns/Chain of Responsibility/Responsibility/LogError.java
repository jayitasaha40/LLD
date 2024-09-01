package Responsibility;

public class LogError extends Log{

  public LogError(Log nextLogProcessor){
    super(nextLogProcessor);
  }
  public void logProcess(String logType, String logMessage){
    if(logType == "ERROR"){
      System.out.println("Log Error: "+logMessage);
    }
    else{
      super.logProcess(logType, logMessage);
    }
  }
}