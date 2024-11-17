public class ProxyServer implements IServer {

  private IServer server;
  private String user;

  public ProxyServer(String user){
    this.user =  user;
  }

  @Override
  public void create() {
    if (user.contains("Admin")) {
      if(server == null){
        server = new MainServer();//Create Connection
      }
      server.create();
      return;
    }
    System.out.println("Access Denied");
  }

  @Override
  public void delete() {
    if(server == null){
      server = new MainServer();//Create Connection
    }
    if (user.contains("Admin")) {
      server.delete();
      return;
    }
    System.out.println("Access Denied");
  }
}