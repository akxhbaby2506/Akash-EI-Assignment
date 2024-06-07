# Assignment

# Excersice-1: Morse Rover Stimulation

This project is a simulation of a rover navigating a grid with obstacles, following a set of commands. The rover can move in four directions (North, East, South, West) and turn left or right. The grid is defined with a specified width and height, and obstacles can be placed at specific coordinates.

## Components

### Position Class

The `Position` class represents the current position and direction of the rover. It consists of:

- `x`: x-coordinate on the grid
- `y`: y-coordinate on the grid
- `direction`: current direction the rover is facing (N, E, S, W)

### Rover Class

The `Rover` class simulates the rover and its movements on the grid. Key functionalities include:

- `move()`: Moves the rover one step in the current direction.
- `turn_left()`: Turns the rover 90 degrees to the left.
- `turn_right()`: Turns the rover 90 degrees to the right.
- `is_within_bounds(position)`: Checks if a given position is within the grid boundaries.
- `is_obstacle(position)`: Checks if a given position contains an obstacle.

### Command Pattern

The command pattern is implemented to decouple the sender of a request (the commands) from the receiver (the rover that executes the commands). This allows for flexible command execution and easier extension.

- `Command` (abstract class): Defines the `execute()` method.
- `MoveCommand`, `TurnLeftCommand`, `TurnRightCommand`: Concrete implementations of the `Command` interface that execute specific actions on the rover.

### Grid Class

The `Grid` class defines the boundaries of the simulation area:

- `width`: Width of the grid.
- `height`: Height of the grid.

## Example Usage

An example of using the rover and its commands:

```python
if __name__ == "__main__":
    # Define grid and obstacles
    grid = Grid(10, 10)
    obstacles = [(2, 2), (3, 5)]

    # Initialize rover
    start_position = Position(0, 0, 'N')
    rover = Rover(grid, start_position, obstacles)

    # Define commands
    commands = [
        MoveCommand(rover),   # Move North from (0, 0, N) to (0, 1, N)
        MoveCommand(rover),   # Move North from (0, 1, N) to (0, 2, N)
        TurnRightCommand(rover),  # Turn right from (0, 2, N) facing East
        MoveCommand(rover),   # Move East from (0, 2, E) to (1, 2, E)
        TurnLeftCommand(rover),   # Turn left from (1, 2, E) facing North
        MoveCommand(rover),    # Move North from (1, 2, N) to (1, 3, N)
        TurnRightCommand(rover)   # Turn right from (1, 3, N) to (1, 3, E)
    ]

    # Execute commands
    for command in commands:
        command.execute()
        logging.info(f"Rover's position: {rover.position}")

    # Print final position
    logging.info(f"Rover is at {rover.position}")

```
# Logging
The project uses Python's logging module to provide detailed logs for each movement, obstacle detection, and final position.

# Running the Simulation
To run the simulation, ensure you have Python installed and execute the script. The logging.basicConfig function is used to configure the logging output to display information about each command executed and the rover's final position.

# Notes
- Ensure that the grid and start position are within the specified boundaries.
- Obstacles can be defined as coordinates where the rover cannot move.
