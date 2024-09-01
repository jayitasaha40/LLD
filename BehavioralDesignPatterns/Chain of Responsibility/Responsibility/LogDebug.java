package Responsibility;

public class LogDebug extends Log{
  
  public LogDebug(Log nextLogProcessor){
    super(nextLogProcessor);
  }
  public void logprocess(String logType, String logMessage){
    if(logType == "DEBUG"){
      System.out.println("Log Debug: "+logMessage);
    }
    else{
      super.logProcess(logType, logMessage);
    }
  }
}