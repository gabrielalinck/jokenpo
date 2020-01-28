# JOKENPO

### HOW TO RUN
- Clone the project, then in the command line you can run the command 'gradle bootRun'
- Or you can open it in your java code editor and run it from there.

### ABOUT
This project solves the problem descript on the dojo Jokenpo (http://dojopuzzles.com/problemas/exibe/jokenpo/) where we basically play a jokenpo game, and the code tell us who won. 
The solution was developed using TDD method, where fisrt I put all the rules on the code with the tests telling the right behaviour of the code. In this phase, I put all the ifs with all the possibilities, then I put the answers of the players in a list, so with the '.contains()' method, I could check the rules independent of what player played what. Finally, I added a verification on what is inputed on the code, and only accepting entries like "rock", "paper" and "scissors".

### WHAT COULD BE BETTER
Still there are a large number of ifs in the code, so it would be better if I could find a solution more clean and with less code.
