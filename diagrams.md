# Design Diagrams

## 1. System Architecture Diagram

```text
                         +------------------+
                         |      USER        |
                         |    (Student)     |
                         +--------+---------+
                                  |
                                  v
                         +------------------+
                         |     Main.java    |
                         |  Console Menu    |
                         +--------+---------+
                                  |
              +-------------------+-------------------+
              |                   |                   |
              v                   v                   v
     +----------------+  +----------------+  +----------------+
     |    Student     |  |    Academic    |  |     Study      |
     |   Management   |  |  Performance   |  |    Planner     |
     +-------+--------+  +-------+--------+  +-------+--------+
             |                   |                   |
             +-------------------+-------------------+
                                 |
                                 v
                       +---------------------+
                       | Supporting Classes  |
                       |                     |
                       | FileManager         |
                       | InputValidator      |
                       | PerformanceAnalyzer |
                       | ReportGenerator     |
                       +----------+----------+
                                  |
                                  v
                       +---------------------+
                       |    Text File Data   |
                       |                     |
                       | students.txt        |
                       | subjects.txt        |
                       | tasks.txt           |
                       +---------------------+

                       2. Workflow Diagram
                                           +-------+
                    | START |
                    +---+---+
                        |
                        v
                +---------------+
                |   Main Menu   |
                +-------+-------+
                        |
          +-------------+-------------+
          |             |             |
          v             v             v
 +----------------+ +-------------+ +----------------+
 |    Student     | |  Academic   | |     Study      |
 |   Management   | | Performance | |    Planner     |
 +-------+--------+ +------+------+ +-------+--------+
         |                 |                |
         v                 v                v
 +----------------+ +-------------+ +----------------+
 | Add / View /   | | Add Marks / | | Add / View /   |
 | Search / Delete| | View / Analyze| | Complete / Delete|
 +-------+--------+ +------+------+ +-------+--------+
         |                 |                |
         +-----------------+----------------+
                           |
                           v
                  +------------------+
                  | Generate Report  |
                  +--------+---------+
                           |
                           v
                      +---------+
                      |  EXIT   |
                      +---------+

                      3. Use Case Diagram
                                          STUDENT PERFORMANCE
                    & STUDY PLANNER

                         +---------+
                         | Student |
                         +----+----+
                              |
              +---------------+----------------+
              |               |                |
              v               v                v
      +---------------+ +-------------+ +-------------+
      | Manage Student| |   Manage    | |   Manage    |
      | Information   | |   Subjects  | | Study Tasks |
      +---------------+ +-------------+ +-------------+
              |               |                |
              v               v                v
       Add Student      Add Subject       Add Task
       View Student     View Marks        View Tasks
       Search Student   Analyze Marks     Complete Task
       Delete Student                    Delete Task

                              |
                              v
                    +-------------------+
                    | Analyze Performance|
                    +---------+---------+
                              |
                              v
                    +-------------------+
                    | Generate Report   |
                    +-------------------+
                    4. Class Diagram
                                             +----------------------+
                         |        Person        |
                         +----------------------+
                         | - name               |
                         +----------------------+
                         | + displayInfo()      |
                         +----------+-----------+
                                    |
                              Inheritance
                                    |
                                    v
                         +----------------------+
                         |       Student        |
                         +----------------------+
                         | - studentId          |
                         | - branch             |
                         | - semester           |
                         +----------------------+
                         | + displayInfo()      |
                         +----------------------+

+--------------------+       +--------------------+
|      Subject       |       |     StudyTask      |
+--------------------+       +--------------------+
| - subjectName      |       | - taskId           |
| - marks            |       | - subject          |
| - grade            |       | - description      |
+--------------------+       | - priority         |
| + getGrade()       |       | - completed        |
| + displaySubject() |       +--------------------+
+--------------------+       | + markCompleted()  |
                             +--------------------+

+--------------------+       +--------------------+
|  StudentManager    |       |   StudyPlanner     |
+--------------------+       +--------------------+
| - students         |       | - tasks            |
+--------------------+       +--------------------+
| + addStudent()     |       | + addTask()        |
| + searchStudent()  |       | + displayTasks()   |
| + deleteStudent()  |       | + completeTask()   |
| + displayAll...()  |       | + deleteTask()     |
+--------------------+       +--------------------+

+--------------------+       +--------------------+
| PerformanceAnalyzer|       |  ReportGenerator   |
+--------------------+       +--------------------+
| + calculate...()   |       | + generateReport() |
| + displayAnalysis()|       +--------------------+
+--------------------+

+--------------------+       +--------------------+
|   InputValidator   |       |    FileManager     |
+--------------------+       +--------------------+
| + validMarks()     |       | + saveStudent()    |
| + validName()      |       | + saveSubject()    |
| + validStudentId() |       | + saveTask()       |
| + validPriority()  |       +--------------------+
+--------------------+

                         +------------------+
                         |      Main        |
                         +------------------+
                         | + main()         |
                         | + menus()        |
                         +------------------+

                         5. Sequence Diagram - Adding a Subject
                          Student          Main          InputValidator       Subject       FileManager
    |               |                 |                |               |
    |--Select------>|                 |                |               |
    |  Academic     |                 |                |               |
    |               |                 |                |               |
    |--Enter Name-->|                 |                |               |
    |--Enter Marks->|                 |                |               |
    |               |--Validate------>|                |               |
    |               |<--Valid---------|                |               |
    |               |                                  |               |
    |               |--------Create Subject----------->|               |
    |               |<-------Subject Created-----------|               |
    |               |                                                  |
    |               |----------------Save Subject--------------------->|
    |               |<---------------Saved-----------------------------|
    |<--Success-----|                 |                |               |
    |               |                 |                |               |

    6. Sequence Diagram - Generate Performance Report
     Student       Main       StudentManager   PerformanceAnalyzer   ReportGenerator
    |            |              |                  |                   |
    |--Request-->|              |                  |                   |
    |  Report    |              |                  |                   |
    |            |--Search----->|                  |                   |
    |            |<--Student----|                  |                   |
    |            |                                  |                   |
    |            |----------Analyze Performance---->|                   |
    |            |<---------Analysis Result---------|                   |
    |            |                                                      |
    |            |----------------Generate Report---------------------->|
    |            |<----------------Report Generated--------------------|
    |<--Display--|              |                  |                   |
    |   Report   |              |                  |                   |

    7. Storage Design
                        +----------------------+
                    |    Java Application  |
                    +----------+-----------+
                               |
              +----------------+----------------+
              |                |                |
              v                v                v
      +---------------+ +---------------+ +---------------+
      | students.txt  | | subjects.txt  | |   tasks.txt   |
      +---------------+ +---------------+ +---------------+
      | Student ID    | | Subject Name  | | Task ID       |
      | Name          | | Marks         | | Subject       |
      | Branch        | | Grade         | | Description   |
      | Semester      | |               | | Priority      |
      |               | |               | | Completion    |
      +---------------+ +---------------+ +---------------+

      8. Module Relationship
      Main
 |
 +----> StudentManager
 |          |
 |          +----> Student
 |                    |
 |                    +----> Person
 |
 +----> Subject
 |
 +----> StudyPlanner
 |          |
 |          +----> StudyTask
 |
 +----> PerformanceAnalyzer
 |
 +----> ReportGenerator
 |
 +----> InputValidator
 |
 +----> FileManager

 