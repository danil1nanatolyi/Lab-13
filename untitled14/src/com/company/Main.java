package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        DeliveryFactory myThuckcarFactory = new TruckcarDeliveryFactory();
        DeliveryFactory myShipFactory = new ShipDeliveryFactory();
        DeliveryFactory myAirFactory = new AirDeliveryFactory();

        Delivery myThuckcarDelivery = myThuckcarFactory.createDelivery();
        Delivery myShipDelivery = myShipFactory.createDelivery();
        Delivery myAirDelivery = myAirFactory.createDelivery();
        System.out.println(myThuckcarDelivery);
        System.out.println(myShipDelivery);
        System.out.println(myAirDelivery);
    }
}
abstract class Delivery {
    String name;

    List<String> accessories = new ArrayList();

    public String toString() {
        return "Model Delivery: " + name + "\n" + accessories;
    }
}

abstract class DeliveryFactory {
    public abstract Delivery createDelivery();

}

class TruckcarDeliveryFactory extends DeliveryFactory {

    public Delivery createDelivery() {
        return new TruckcarDelivery();
    }

}

class ShipDeliveryFactory extends DeliveryFactory {

    public Delivery createDelivery() {

        return new ShipDelivery();
    }

}

class AirDeliveryFactory extends DeliveryFactory {

    public Delivery createDelivery() {
        return new AirDelivery();
    }
}

class TruckcarDelivery extends Delivery {

    public TruckcarDelivery() {
        name = "Truck Car";//имя
        accessories.add("права категории С");
        accessories.add("мед. книжка");
        accessories.add("накладная на товары");
        accessories.add("документы на транспорт");
    }
}

class ShipDelivery extends Delivery {
    public ShipDelivery() {
        name = "Корабль";
        accessories.add("документы на судно");
        accessories.add("Водные права");
    }
}

class AirDelivery extends Delivery {
    public AirDelivery() {
        name = "Самолет";
        accessories.add("документы на самолет");
        accessories.add("Самолетные права");
        accessories.add("документы на перевозку");
        accessories.add("груз");
    }
}
