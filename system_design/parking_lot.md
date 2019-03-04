# Parking lot

## Variants:

* system-desing
* alogrithmic
* OO design quesion

## Question

You have a parking lot, and you have to manage many parking spots. You want a system that manages it.

## What interviewer wants from you?

* Handling ambiguity
  * clarifying questions
    * Do you want me to define system architecture?
    * Do you want the class hierarchies?
* Systematic approach
  * How you approach the problem
  * Clarify the assumptions
  * interviewer leave out the details and you need to figure out the details

## What questions you can ask

* How is the parking lot designed?
  * Is it a building or an open space
  * How many spots? 10 or thousands?
  * Are there multiple levels?
  * Are there multiple entrances?
    * Concurrencies details
  * Optimise certain areas first

* Prices
  * Pricing strategy
    * Bigger slots -> more price
    * type of vehicle - charging by the type of vehicle

* Type of parking spots
  * Premium
  * For handicapped persons

## An Example

Lets assume that the interviewer wants you to design the system with 4 different sizes.

* Small (bikes)
* Medium (small cars)
* Large (big cars)
* XLarge (buses)

Let's assume that you can put a small car in a big slot/spot. But you are not allowed to put large car in a small spot.

Let's think about the class hierarchy.

Classes:

* ParkingLot
* Vehicle
* Spot

```java
public interface Vehicle {
    String getVehicleRegistrationNumber(); // can be used for unique identification
    Size getSize();
}

public enum Size {
    SMALL, MEDIUM, LARGE, XLARGE;
}

```

```java
public class SmallCar implements Vehicle {

}

public class MediumCar implements Vehicle {

}

public class Bike implements Vehicle {

}

public class Bus implements Vehicle {

}
```

```java
public class ParkingLot {

    public ParkingLot(String zipCode) {

    }

    // optional becuase it can be the case that there is no parking spot free.
    public Optional<ParkingSpot> placeVehicle(Vehicle vehicle) {

    }

    // optional because it can be the case that vehicle was not there in the parking lot
    public Optional<ParkingSpot> removeVehicle(Vehicle vehicle) {

    }

}
```

```java
public class ParkingSpot {
    long id;
    String address;
    Size size;
}
```

For algorithmic question, you need to ask what goal do we have. 

* Efficiency
* Optimization in terms of allcating a `ParkingSpot`.

In reality we have a database backend where we place the current status of the vehicle. But for the sake of simplicity let's assume that we have all this information in-memory.

Now you need to choose the right data structure.

Say we have four different list that corresponds to the free `ParkingSpots` for each size type. Search the first free `ParkingSpot` where this vehicle fits. (This needs to be a concurrent data structure.)

We can simply add all the `ParkingSpot`s into a list.
Let us suppose that we have 4 different lists, one for each size type. (this list keeps track of free spots).

* When a `Vehicle` requests a `ParkingSpot`, we return a `ParkingSpot` accoding to the size. If the exact size `ParkingSpot` is not available, then we go for bigger size.
* When a `Vehicle` leaves the `ParkingSpot`, then this recently freed `ParkingSpot` will be added to it's free list.

Constant time `O(1)` operation for allocating the `ParkingSpot`.

Having `HashMap<Vehicle, ParkingSpot>` for looking up where this vehicle is kept. (This will again be a concurrent data-structure)