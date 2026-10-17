def calculate(test,project,work,exam):
    caMark = test * 0.4 + project * 0.3 + work * 0.3
    modMark = caMark * 0.5 + exam * 0.5
   

while True:
    studentName = input("Enter student name:")
    if studentName.isalpha() == False:
        print("Invalid name, please try again.")
    else:
        studentID = int(input("Enter student ID:"))
        testMarks = int(input("Enter testMarks:"))
        projectMarks = int(input("Enter projectMarks:"))
        workshopMarks = int(input("Enter workshopMarks:"))
        examMarks = int(input("Enter examMarks:"))
        print(studentName)
        print(str(studentID))
        break
