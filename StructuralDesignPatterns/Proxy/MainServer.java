public class MainServer implements IServer{
  @Override
  public void create(){
    System.out.println("Creating a server");
  }

  @Override
  public void delete(){
    System.out.println("Deleting a server");
  }
}