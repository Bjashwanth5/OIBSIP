## **Task :1**
# ATM INTERFACE
This is a simple console-based **ATM Program** made using Java.  
It allows the user to log in and perform basic banking operations.
## Features
- Login using User ID and PIN  
- Deposit money  
- Withdraw money  
- Transfer money to another user  
- View transaction history  
- Exit the program  
## Technologies Used
- Java  
- OOP concepts  
- ArrayList  
- Scanner for input  
## How to Run
1. Compile the program:
javac ATM.java
2. Run the program:
java ATM
**OUTPUT:**
Welcome to the ATM Service!
Enter your 4-digit PIN: 1234
======== ATM MENU ========
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Select an option: 1
---- Transaction History ----
No transactions yet.
======== ATM MENU ========
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Select an option: 3
Enter amount to deposit: 10000
10000.0 deposited successfully.
======== ATM MENU ========
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Select an option: 
2
Enter amount to withdraw: 5000
Withdrawal of 5000.0 successful.
======== ATM MENU ========
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Select an option: 4
Enter recipient account number: 504
Enter amount to transfer: 500
Successfully transferred 500.0 to account 504
======== ATM MENU ========
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Select an option: 1
---- Transaction History ----
Deposited: 10000.0
Withdrawn: 5000.0
Transferred 500.0 to Account 504
======== ATM MENU ========
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Select an option: 5
Thank you for using our ATM!
## **Task :2**
# Number Guessing Game
This is a simple Java console game where the user tries to guess a random number between 1 and 100.  
The game gives the player 10 attempts and awards points based on how quickly they guess the number.
## Features
- Random number generation (1–100)
- 10 attempts per round
- Score system (fewer attempts = more points)
- Option to play multiple rounds
- Simple and fun console game
## How to Run
1. Compile the program:
javac GuessTheNumber.java
2. Run the program:
java GuessTheNumber
## Gameplay Rules
- You have **10 attempts** to guess the number.
- If you guess correctly, you earn points.
- If you fail, the correct number is shown.
- You can choose to play again.
**OUTPUT**
Welcome to Guess the Number!
I've picked a number between 1 and 100. Let's see if you can find it.
Your guess: 90
Too high, try again!
Your guess: 50
Too low, try again!
Your guess: 70
Too high, try again!
Your guess: 60
Too high, try again!
Your guess: 55
Too low, try again!
Your guess: 59
Too high, try again!
Your guess: 57
Too low, try again!
Your guess: 58
Congratulations! You guessed the number in 8 attempts.
## **Task :3**
## Digital library management
This is a simple Library Management System built using Java.  
It allows both **Admin** and **Users** to manage books through a console-based menu.
## Features
###  Admin
- Add Book  
- Update Book  
- Delete Book  
- View All Books  
(Default Admin Login)  
- Username: **admin**  
- Password: **admin@123**
### User
- View all books  
- Issue a book  
- Return a book  
## Technologies Used
- Java  
- ArrayList  
- Scanner for input  
- Basic OOP concepts  
## How to Run
1. Compile:
javac LibraryManagementSystem.java
2. Run:
java LibraryManagementSystem
## **OUTPUT**
Library Management System
1. Admin Login
2. User Access
3. Exit
Enter your choice: 1
Enter admin username: admin
Enter admin password: admin@123
Admin Menu 
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 1
Enter Book ID: 101
Enter Book Title: python
Enter Book Author: Gudio van 
Book added successfully!
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 1
Enter Book ID: 102
Enter Book Title: java
Enter Book Author: james
Book added successfully!
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 2
Enter Book ID to update: 101
Enter new Title: C
Enter new Author: Danies
Book updated successfully!
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 4
 All Books
ID: 101, Title: C, Author: Danies, Issued: No
ID: 102, Title: java, Author: james, Issued: No
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 3
Enter Book ID to delete: 101
Book deleted successfully!
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 4
 All Books
ID: 102, Title: java, Author: james, Issued: No
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 5
Returning to main menu...
User Menu
1. View All Books
2. Issue Book
3. Return Book
4. Back to Main Menu
Enter your choice: 1
 All Books
ID: 102, Title: java, Author: james, Issued: No
User Menu
1. View All Books
2. Issue Book
3. Return Book
4. Back to Main Menu
Enter your choice: 2
Enter Book ID to issue (0 to go back): 102
Book issued successfully!
Enter Book ID to issue (0 to go back): 0
User Menu
1. View All Books
2. Issue Book
3. Return Book
4. Back to Main Menu
Enter your choice: 3  
Enter Book ID to return (0 to go back): 102
Book returned successfully!
Enter Book ID to return (0 to go back): 0
User Menu
1. View All Books
2. Issue Book
3. Return Book
4. Back to Main Menu
Enter your choice: 4
Returning to main menu...
Exiting system. Goodbye!
Invalid choice. Try again.
Library Management System
1. Admin Login
2. User Access
3. Exit
Enter your choice: 3
Exiting system. Goodbye!
## **Task :4 **
## Online reservation system
###  Book a ticket
###  Cancel a ticket
###  View all booked tickets
And **login is required** (username: admin, password: admin@123)
## **Reservation Class**
This class stores **one passenger’s booking details**:
* name
* age
* train number
* train name
* class
* journey date
* from – to
* PNR number
It also has a `display()` method to print the ticket.
## **Login System**
Before using the reservation system, the program asks:
Enter username:
Enter password:
Only if both match:
admin
admin@123
the user can continue.
## **Menu(Loop)**
After login, the program keeps showing:
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
The user chooses what to do.
# **What Each Function Does**
## **bookReservation()**
Asks the user for:
* name
* age
* train details
* journey date
* source
* destination
Then it **creates a new PNR like:**
PNR1, PNR2, PNR3 ...
Then adds it to the list of reservations.
 Prints success message.
## **cancelReservation()**
* Asks for PNR
* Searches in the list
* If found → shows details → asks:
Confirm cancellation? (yes/no)
If yes → deletes reservation.
## **viewReservations()**
Prints all booked reservations using the `display()` method.
## **OUTPUT**
Enter username: admin
Enter password: admin@123
Online Reservation System 
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
Enter your choice: 1
Enter Name: jash
Enter Age: 20
Enter Train Number: 513
Enter Train Name: express
Enter Class Type: sleeper
Enter Date of Journey (DD/MM/YYYY): 11/11/2025
From: hyd
To: goa
Reservation Successful! Your PNR: PNR1
Online Reservation System
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
Enter your choice: 1
Enter Name: varun
Enter Age: 20
Enter Train Number: 514
Enter Train Name: express
Enter Class Type: sleeper
Enter Date of Journey (DD/MM/YYYY): 12/11/2025
From: hyd
To: jammu
Reservation Successful! Your PNR: PNR2
Online Reservation System
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
Enter your choice: 3
All Reservations
PNR: PNR1
Name: jash
Age: 20
Train No: 513
Train Name: express
Class: sleeper
Date of Journey: 11/11/2025
From: hyd To: goa
PNR: PNR2
Name: varun
Age: 20
Train No: 514
Train Name: express
Class: sleeper
Date of Journey: 12/11/2025
From: hyd To: jammu
Online Reservation System
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
Enter your choice: 2
Enter PNR to cancel: pnr2
PNR: PNR2
Name: varun
Age: 20
Train No: 514
Train Name: express
Class: sleeper
Date of Journey: 12/11/2025
From: hyd To: jammu
Confirm cancellation? (yes/no): yes
Reservation cancelled successfully!
Online Reservation System
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
Enter your choice: 4
Exiting system. Goodbye!
## **Author**
Name: B.Jashwanth
github link: https://github.com/Bjashwanth5

