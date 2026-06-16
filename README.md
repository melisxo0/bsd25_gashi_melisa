# ISupervision

iSupervision is a console-based Java management system for bachelor/master theses as well as for individual student projects

---

## How to Install
Create a new project in IntelliJ: 
 - Open IntelliJ IDEA
 - Select File → New → Project
 - Select Java on the left
 - Enter a project name, e.g. ISupervision
 - Choose the location → click Create

Create packages: 
 - go to the src folder
 - right-click → New → Package
 Create the following three packages:
   - **General**
   - **User**
   - **Utils**

Insert Java files into the packages
- Open each package with right-click → New → Java Class and insert the files:
  - **General:** (Application.java, Role.java, ThesisType.java, Topic.java)
  - **User:** (User.java, SupervisionPlan.java)
  - **Utils:** (FileManager.java)
  
Select a main-class & start the program
- Open the file Application.java
- Click the ***green Run button*** at the top right (or Shift+F10)
- The program starts in the Run console at the bottom

Log in with test users
- Sample data will automatically be loaded on first start. 
Available login details:
 1\. **User:** Admin, **password:** admin, **role:** Admin
 2\. **User:** Prof. Huber, *password:* prof, *role:* Assistant
 3\. **User:** Anna/Bernd/Clara, **password:** 1234, **role:** Student
## Information
The file isupervision_daten.txt is automatically created in the project directory as soon as a user logs out. The next time it starts, this data will be loaded.

## How to use 
The program starts with a login prompt in the console. Enter your username and password, the menu for your role opens automatically.

***Role: Student***
**1\. Show all topics**
Lists all available topics grouped by type (Project/Bachelor/Master). Free topics show FREI, occupied ones show the enrolled student's name.

**2. Show my enrollments**
Shows only the topics the currently logged-in student is enrolled in.

**3. Enroll in a topic**

All topics are displayed with numbers. Enter a number → the enrollment is validated and either confirmed or rejected with an error message

***Role: Assistant***
**1\. Show all topics**
Same as the student view; full overview grouped by type.

**2. Create a new topic**
Enter a title → choose type (1 Project / 2 Bachelor / 3 Master) → enter a deadline (e.g. 30.05.2026 or TBD). The topic appears in the list immediately.

***Role: Admin***
**1\. Show all topics**
Full overview grouped by type
**2. Create new topic**
Same as assistant
**3. Delete topic**
Choose a number → topic is permanently removed
**4. Remove enrollment**
Only occupied topics are shown → choose number → student is unenrolled, topic stays
**5. Show all users**
List of all users with their role
**6. Add new user**
Enter name, password and role (1/2/3)
**7. Check consistency**
Verifies enrollments meet prerequisites (e.g. bachelor without a project)

## Übungen
- [Exercise1 Part1](exercise1_part1.md)
- [Exercise1 Part2](exercise1_part2.md)
- [Exercise1 Part3](exercise1_part3.md)
- Exercise2


**Author**
Melisa Gashi 
52505183@edu-campus02.at
[GitHub Profil](https://github.com/melisxo0)
[Campus02](https://www.campus02.at)
