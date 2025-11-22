## **Task :1**
## **ATM INTERFACE**
This is a simple console-based ATM Program made using Java.
It allows the user to log in and perform basic banking operations.
**Features**
Login using User ID and PIN
Deposit money
Withdraw money
Transfer money to another user
View transaction history
Exit the program
**Technologies Used**
Java
OOP concepts
ArrayList
Scanner for input
**How to Run**
Compile the program: javac ATM.java
Run the program: java ATM
## **Output:**
Welcome to the ATM Service! Enter your 4-digit PIN: 1234 ======== ATM MENU ========

Transaction History
Withdraw
Deposit
Transfer
Quit Select an option: 1 ---- Transaction History ---- No transactions yet. ======== ATM MENU ========
Transaction History
Withdraw
Deposit
Transfer
Quit Select an option: 2 Enter amount to withdraw: 7000 Insufficient funds or invalid amount! ======== ATM MENU ========
Transaction History
Withdraw
Deposit
Transfer
Quit Select an option: 3 Enter amount to deposit: 10000 ?10000.0 deposited successfully. ======== ATM MENU ========
Transaction History
Withdraw
Deposit
Transfer
Quit Select an option: 2 Enter amount to withdraw: 2000 Withdrawal of ?2000.0 successful. ======== ATM MENU ========
Transaction History
Withdraw
Deposit
Transfer
Quit Select an option: 2 Enter amount to withdraw: 5000 Withdrawal of ?5000.0 successful. ======== ATM MENU ========
Transaction History
Withdraw
Deposit
Transfer
Quit Select an option: 1 ---- Transaction History ---- Deposited: ?10000.0 Withdrawn: ?2000.0 Withdrawn: ?5000.0 ======== ATM MENU ========
Transaction History
Withdraw
Deposit
Transfer
Quit Select an option: 4 Enter recipient account number: 10 Enter amount to transfer: 100 Successfully transferred ?100.0 to account 10 ======== ATM MENU ========
Transaction History
Withdraw
Deposit
Transfer
Quit Select an option: 5 Thank you for using our ATM!
## **Task :2**
## **Number Guessing Game**
This is a simple Java console game where the user tries to guess a random number between 1 and 100.
The game gives the player 10 attempts and awards points based on how quickly they guess the number.
**Features**
Random number generation (1–100)
10 attempts per round
Score system (fewer attempts = more points)
Option to play multiple rounds
Simple and fun console game
**How to Run**
Compile the program: 
javac GuessTheNumber.java
Run the program:
java GuessTheNumber
**Gameplay Rules**
You have 10 attempts to guess the number.
If you guess correctly, you earn points.
If you fail, the correct number is shown.
You can choose to play again. How to Run git clone https://github.com/Bjashwanth5/GuessTheNumber.git Navigate into the project folder: cd GuessTheNumber Compile the Java program: javac GuessTheNumber.java Run the game: java GuessTheNumber
## **Output:**
Welcome to the Guess the Number Game! I've chosen a number between 1 and 100 ? can you guess it? Enter your guess: 50 Too high! Try a lower number. Enter your guess: 25 Too high! Try a lower number. Enter your guess: 13 Too high! Try a lower number. Enter your guess: 6 Too high! Try a lower number. Enter your guess: 3 Too low! Try a higher number. Enter your guess: 4 ? Congratulations! You guessed it in 6 attempts. Thanks for playing!

## **Task :3**
## **Digital library management**
This is a simple Library Management System built using Java.
It allows both Admin and Users to manage books through a console-based menu.
**Features**
Admin
Add Book
Update Book
Delete Book
View All Books
(Default Admin Login)
Username: admin
Password: admin@123
User
View all books
Issue a book
Return a book
**Technologies Used**
Java
ArrayList
Scanner for input
Basic OOP concepts
**How to Run**
Compile: javac LibraryManagementSystem.java
Run: java LibraryManagementSystem
## **Output:**
Library Management System
Admin Login
User Access
Exit 
Enter your choice: 1
Enter admin username: admin
Enter admin password: admin@123 
Admin Menu
Add Book
Update Book
Delete Book
View All Books
Back to Main Menu Enter your choice: 1 Enter Book ID: 101 Enter Book Title: java Enter Book Author: james Book added successfully! Admin Menu
Add Book
Update Book
Delete Book
View All Books
Back to Main Menu Enter your choice: 1 Enter Book ID: 102 Enter Book Title: C Enter Book Author: Danies Book added successfully! Admin Menu
Add Book
Update Book
Delete Book
View All Books
Back to Main Menu Enter your choice: 2 Enter Book ID to update: 102 Enter new Title: python Enter new Author: Gudio van Book updated successfully! Admin Menu
Add Book
Update Book
Delete Book
View All Books
Back to Main Menu Enter your choice: 3 Enter Book ID to delete: 102 Book deleted successfully! Admin Menu
Add Book
Update Book
Delete Book
View All Books
Back to Main Menu Enter your choice: 4 All Books ID: 101, Title: java, Author: james, Issued: No Admin Menu
Add Book
Update Book
Delete Book
View All Books
Back to Main Menu Enter your choice: 1 Enter Book ID: 103 Enter Book Title: DAA Enter Book Author: charlies Book added successfully! Admin Menu
Add Book
Update Book
Delete Book
View All Books
Back to Main Menu Enter your choice: 4 All Books ID: 101, Title: java, Author: james, Issued: No ID: 103, Title: DAA, Author: charlies, Issued: No Admin Menu
Add Book
Update Book
Delete Book
View All Books
Back to Main Menu Enter your choice: 5 Returning to main menu... User Menu
View All Books
Issue Book
Return Book
Back to Main Menu Enter your choice: 1 All Books ID: 101, Title: java, Author: james, Issued: No ID: 103, Title: DAA, Author: charlies, Issued: No User Menu
View All Books
Issue Book
Return Book
Back to Main Menu Enter your choice: 2 Enter Book ID to issue (0 to go back): 101 Book issued successfully! Enter Book ID to issue (0 to go back): 103 Book issued successfully! Enter Book ID to issue (0 to go back): 0 User Menu
View All Books
Issue Book
Return Book
Back to Main Menu Enter your choice: 3 Enter Book ID to return (0 to go back): 101 Book returned successfully! Enter Book ID to return (0 to go back): 103 Book returned successfully! Enter Book ID to return (0 to go back): 0 User Menu
View All Books
Issue Book
Return Book
Back to Main Menu Enter your choice: 4 Returning to main menu... Exiting system. Goodbye! Invalid choice. Try again. Library Management System
Admin Login
User Access
Exit Enter your choice: 3 Exiting system. Goodbye!
## **Task :4**
## **Online reservation system**
Book a ticket
Cancel a ticket
View all booked tickets
And login is required (username: admin, password: admin@123)
Reservation Class
This class stores one passenger’s booking details:
name
age
train number
train name
class
journey date
from – to
PNR number It also has a display() method to print the ticket.
Login System
Before using the reservation system, the program asks: Enter username: Enter password: Only if both match: admin admin@123 the user can continue.
Menu
After login, the program keeps showing:
Book Reservation
Cancel Reservation
View All Reservations
Exit The user chooses what to do.
What Each Function Does
**bookReservation()**
Asks the user for:
name
age
train details
journey date
source
destination Then it creates a new PNR like: PNR1, PNR2, PNR3 ... Then adds it to the list of reservations. Prints success message.
**cancelReservation()**
Asks for PNR
Searches in the list
If found → shows details → asks: Confirm cancellation? (yes/no) If yes → deletes reservation.
**viewReservations()**
Prints all booked reservations using the display() method. How to Run Clone the repository: git clone https://github.com/Bjashwanth5/OnlineReservationSystem.git Navigate to the folder: cd OnlineReservationSystem Compile the Java file: javac OnlineReservationSystem.java Run the program: java OnlineReservationSystem
## **Output:**
Enter username: admin Enter password: admin@123 Online Reservation System

Book Reservation
Cancel Reservation
View All Reservations
Exit Enter your choice: 1 Enter Name: jash Enter Age: 20 Enter Train Number: 513 Enter Train Name: express Enter Class Type: sleeper Enter Date of Journey (DD/MM/YYYY): 11/11/2025 From: hyd To: goa Reservation Successful! Your PNR: PNR1 Online Reservation System
Book Reservation
Cancel Reservation
View All Reservations
Exit Enter your choice: 1 Enter Name: varun Enter Age: 20 Enter Train Number: 542 Enter Train Name: express Enter Class Type: sleeper Enter Date of Journey (DD/MM/YYYY): 12/11/2025 From: hyd To: jammu Reservation Successful! Your PNR: PNR2 Online Reservation System
Book Reservation
Cancel Reservation
View All Reservations
Exit Enter your choice: 3 All Reservations PNR: PNR1 Name: jash Age: 20 Train No: 513 Train Name: express Class: sleeper Date of Journey: 11/11/2025 From: hyd To: goa PNR: PNR2 Name: varun Age: 20 Train No: 542 Train Name: express Class: sleeper Date of Journey: 12/11/2025 From: hyd To: jammu Online Reservation System
Book Reservation
Cancel Reservation
View All Reservations
Exit Enter your choice: 2 Enter PNR to cancel: pnr2 PNR: PNR2 Name: varun Age: 20 Train No: 542 Train Name: express Class: sleeper Date of Journey: 12/11/2025 From: hyd To: jammu Confirm cancellation? (yes/no): yes Reservation cancelled successfully! Online Reservation System
Book Reservation
Cancel Reservation
View All Reservations
Exit Enter your choice: 4 Exiting system. Goodbye!
