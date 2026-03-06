# chainOfResponsibilityPattern
**Automated Waste Management System**

This is a requirement for Lab Assignment 3 in Software Engineering 2.

## Background
Municipalities and cities face significant challenges in managing and efficiently disposing of waste. Traditional waste collection methods often result in delays, inefficiencies, and high operational costs. An innovative solution is needed to automate the waste management process, ensuring timely collection and disposal while optimizing resource utilization.

## Objective
Develop an automated waste management system that uses a chain of responsibility pattern to ensure efficient waste collection and disposal. The system should handle different types of waste containers and trigger appropriate disposal actions based on the type and capacity of each container.

## Requirements

### Waste Container
Create a class to represent waste containers, each with a specific capacity and type of waste (e.g., organic, recyclable, hazardous, electronic).

### Waste Collection Chain
Implement a chain of responsibility pattern to handle different types of waste containers. Each handler in the chain should be responsible for collecting and disposing of a specific type of waste.

### Waste Collection Process
- The system should initialize a chain of waste collectors, each responsible for a different type of waste.
- When a waste container is full or needs disposal, the system should trigger the waste collection process.
- The appropriate waste collector in the chain should handle the disposal based on the type and capacity of the waste container.

### Validation
Ensure that waste containers are correctly identified and disposed of by the appropriate waste collector in the chain.

## Execution Flow
- Create waste container objects with their specifications (type and capacity)
- Create waste collector objects in a chain for different waste types
- Process waste containers through the chain
- Collectors examine waste data and perform disposal operations
- Display results dynamically

## Benefits of Chain of Responsibility Pattern
✅ **Separation of Concerns**: Waste container objects don't need to know about disposal logic  
✅ **Easy to Extend**: Add new waste types without modifying existing collector classes  
✅ **Flexible Processing**: Requests can be handled by any collector in the chain  
✅ **Single Responsibility**: Each collector handles one specific type of waste  

## How to Run
Compile and run the main class:

```
javac src/labAssignment3/*.java
java -cp src labAssignment3.AutomatedWasteSystem
```

Or use your preferred Java IDE to execute `AutomatedWasteSystem.java`.

## UML Diagram
![alt text](https://github.com/ramdcrz/chainOfResponsibility/blob/main/chainOfResponsibility_UML.png)