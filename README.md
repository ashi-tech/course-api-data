# course-api-data
Course API with data for Spring boot QuickStart


Course to Topic: ManyToOne


1.getAllTopics:GET  
http://localhost:8080/topics/   

2.addTopic:POST  
http://localhost:8080/topics/   
{
    "id": "javaee",
    "name": "javaee",
    "description": "JAVAEE topic"
}

3.getTopic:GET   
http://localhost:8080/topics/javaee    

4.updateTopic:PUT   
http://localhost:8080/topics/javaee   
 {
    "id": "javaee",
    "name": "JAVA EE update",
    "description": "Javaee update topic"
 }
 
5.deleteTopics:DEL   
http://localhost:8080/topics/javaee   

1.updateCourse:PUT   
http://localhost:8080/topics/java/courses/java-streams   
{
    "id": "java-streams",
    "name": "java 8-stream",
    "description": "java 8-stream course."
}

2.getAllCourses:GET  
http://localhost:8080/topics/java/courses   

3.getCourse:GET    
http://localhost:8080/topics/java/courses/java-streams   

4.addCourse:POST   
http://localhost:8080/topics/java/courses/   
{
    "id": "lambda",
    "name": "Lambda Expn ",
    "description": "java 8-Lambda expn course."
} 

5.deleteCourse   
http://localhost:8080/topics/java/courses/lambda   



