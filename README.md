# Boat-Racing-Game

You are required to build a simple game ‘Boat Race’ in Java program that fulfil the below
requirements. Analyze and develop the Java program as per described using the Object-Oriented
design. You should design your program for optimum maintainability and reusability with the best
practices of object-oriented techniques you have learnt. You also need to document your design
using the UML class and class relationship diagrams.

The game rules:
• The game is required to allow two players to play the game. Each player will be allocated a
boat and take turn to throw the dice (you can use the random function to generate the
random dice number) to decide how many steps should the boat move forward.

• The river can be visualised as 100-columns track as below, which is filled with random
number of traps(#) and currents(C).

Start End
C # C # C # ….. C # # C C

• Once the game started, all the traps and currents will be scattered randomly in the river.
Some currents are stronger than the others, so as the traps. The stronger current or trap
will make the boat moves more steps forward or backward. When boat hits the trap, the
boat will need to move backward x number of steps, when the boat hits the current it will
move forward x number of steps. The boat should not be allowed to move beyond the
river’s boundary.

Game will end when either player’s boat reaches the end of the river. Display the location of
the boats after every move.

When the game starts, display the Top 5 scores and ask the player for the name (short name with
one word). You should count the total turns the player takes along the games. If the player
successfully completes the game, and the score is within the top 5 scores, store the player’s score
and name in the Top 5 score text file. The list should be ordered by score in ascending order.
Tips: You can add any additional attributes to the objects in this game which you see fit
