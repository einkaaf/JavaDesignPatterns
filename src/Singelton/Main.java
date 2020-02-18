package Singelton;

class Main {
  public static void main(String[] args) {
    Message.getInstance().showMessage();
//    or
    Message message=Message.getInstance();
    message.showMessage();
  }
}
