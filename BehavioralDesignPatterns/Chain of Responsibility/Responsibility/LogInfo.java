package Responsibility;

public class LogInfo extends Log{

  public LogInfo(Log nextLogProcessor){
    super(nextLogProcessor);
  }
  public void logprocess(String logType, String logMessage){
    if(logType == "INFO"){
      System.out.println("Log Info: "+logMessage);
    }
    else{
      super.logProcess(logType, logMessage);
    }
  }
}