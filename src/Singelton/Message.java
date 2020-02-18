package Singelton;

class Message {
  private static final Message ourInstance = new Message();

  static Message getInstance() {
    return ourInstance;
  }

  private Message() {
  }

  public void showMessage() {
    System.out.println("Singletone Design pattern!");
  }
}
