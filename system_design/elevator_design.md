# Elevator Design

Who is the user?

* Residents
* Workers

States of elevator:

* IDLE
* UP
* DOWN
* LOADIND
* NOT_FUNCTIONAL

What all your need to configure for the elevator?

while installing the elevator:

* highest floor
* lowest floor
* Capacity (in kgs)
* Max-speed

## Feature set

* Efficiency - If you have multiple elevator, then you can optimize the following:
  * You can minimize the time that a user has to wait for after he called elevator
  * the total distance moved by elevator(s)
  * The total time that a user spends in the elevator
    * Consider a scenario where a user enters in the elevator on the 60th floor and he wants to go to the lobby (ground floor). Now if the there are 30 persons on different floor (between floor 60 to floor 0) and each of them wants to stop the elevator, then the user who entered the elevator at the 60th floor will spend lot of time in the elevator. So the idea is to define a threshold, which is the maximum number of times the elevator will stop.
    * It is also good to maintain this threshold as the size of the elevator is finite.
    * A meaningful derivation of the threshold for the number of stops can be: Suppose that the user enters at the `x`th floor, and if the elevator stops at any floor, it will spend on an average `t` seconds on each floor where it's stopped. 
    * We can define our SLA like the elevator will take at most 3 minutes for any user (irrespective of the floor he entered the elevator and also irrespective of the floor where he wants to go.)
    * Then we can say that the elevator will stop at maximum of `(int) (x*0.1)`. This will ensure us to abide by the defined SLA.
* Comfort
* Easy to use
* Size
* security
* Durability
* Emergency Access - good to have feature where the number of floors in the building is very large.

## multiple elevators installed in the same building

## different types of elevators

* Utility elevator - more powerful, more durable, more space
* Passenger elevator - Efficient in terms of taking lesser time for passengers to reach their destination - minimizing travel time

## Elevators which dispatch on a specific floor

Suppose that we have 5 different elevators and a total of 60 floors. We can divide the dispatching of passengers in the follwoing way - from the lobby or the ground floor:

* Elevator#1 dispatches from floor 0 to 11
* Elevator#2 dispatches from floor 12 to 23
* Elevator#3 dispatches from floor 24 to 35
* Elevator#4 dispatches from floor 36 to 47
* Elevator#5 dispatches from floor 48 to 59

If it's not the ground floor, then the nearest elevator can be used to dispatch.

### Another strategy for dispatching

Suppose that we have 5 different elevators and a total of 60 floors.

Each elevator will handle 12 different floors

* Elevator#0 dispatches from floor 0, 5, 10, 15, 20, ...55, 60 (`5n`) - `n` is the number of elevators
* Elevator#1 dispatches from floor 1, 6, 11, 16, 21 .... 56 (`5n+1`)
* Elevator#2 dispatches from floor (`5n+2`)
* Elevator#3 dispatches from floor (`5n+3`)
* Elevator#4 dispatches from floor (`5n+4`)

## Special features of Elevator

* The elevators can also contain the residents'/workers' details so that it starts moving from the lobby only when they enter a correct key - which is effectively their room key. 
* Take care of guests/visitors to provide temporary access
* Workers should also be provided temporary access.