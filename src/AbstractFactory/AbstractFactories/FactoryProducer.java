package AbstractFactory.AbstractFactories;

public class FactoryProducer {
  public static AbstractFactory getFactory(String choice){
    if(choice.equalsIgnoreCase("CAR")){
      return new CarFactory();
    } else if(choice.equalsIgnoreCase("TRUCK")){
      return new TruckFactory();
    }
    return null;
  }
}
