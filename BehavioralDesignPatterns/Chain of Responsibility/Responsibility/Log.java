package Responsibility;

public abstract class Log{
  Log nextLogProcessor;
  public Log(Log nextLogProcessor){
    this.nextLogProcessor = nextLogProcessor;
  }

  public void logProcess(String logType, String logMessage){
    if(nextLogProcessor != null){
      nextLogProcessor.logProcess(logType, logMessage);
    }
  }
}