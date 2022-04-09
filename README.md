# Travel Inc
As a part of exercise from head first object design analysis 

## Feature Analysis
---
1. The RouteFinder should be able to store all the network of subway lines 
2. RouteFinder should be able to take any starting station and destination station and provide a route for it.
3. Travel agents will print out the route and will indicate which line to take and when need to switch out the routes. 


## Use case diagrams
---

|Actor|RouteFinder |
|---|--|
|Administrator| Store station|    
|Administrator| Include station on multiple route|
|Agent| Input for path|
|Agent| Print|


## Modules 
---
 1. `Station`
 2. `Route`
 3. `Path`
 4. `Printer` 

#### OOAD modules 
1. `Subway` : Stores all the stations and routes 
2. `Loader` : Takes input stations and provides the path
3. `Printer` : Takes the path from loader and prints it
4. `Test` : WIll check the functionality of each module


## Subway Module 
---
### Usecases
1. The administrator supplies a file of stations and lines.
2. The system reads in the name of a station.
3. The system validates that the station doesn’t already exist.
4. The system adds the new station to the subway.
5. The system repeats steps 2-4 until all stations are added.
6. The system reads in the name of a line to add.
7. The system reads in t wo stations that are connected.
8. The system validates that the stations exist.
9. The system creates a new connection between the two
stations, going in both directions, on the current line.
10. The system repeats steps 7-9 until the line is complete.
11. Repeat steps 6-10 for all the lines.

### Classes for Subway 

|Subway Loader|
|-------|
|`private subway`|
|`loadFromFile : Subway`|
|`loadStations `|
|`loadLines`|

|Subway|
|-------|
|`private List stations`|
|`private List connections`|
|`addStation(Station st) : void`|
|`hasStation(Station st) : boolean`|
|`addConnection(Station st1, Station st2, String Line): void`|

|Station|
|-------|
|`private Station station`|
|`addStation(Station st) : void`|
|`equals(Station st) : boolean`|
|`hashCode() : int `|


|Connection|
|-------|
|`private Station st1`|
|`private Station st2`|
|`getStationOne : Station`|
|`getStationTwo : Station`|
|`getLineName : String`|

## PathFinder Module