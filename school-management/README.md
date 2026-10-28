# School Management (Spring Boot)

## Run karaycha steps
1. MySQL start kara. `application.properties` madhye username/password badla.
2. IDE madhye "Open as Maven project" kara, kinva terminal madhye: `mvn spring-boot:run`
3. Lombok plugin IDE madhye enabled asavi (annotation processing ON).
4. Swagger UI: http://localhost:8080/swagger-ui.html

## Relationships (entity madhye already ahet)
- School 1 --- N Teacher
- School 1 --- N Student
- Teacher 1 --- N Student
- Student N --- 1 School (student fetch kela ki school disel)

## Tumhi add karaycha (TODO)
Service + Controller madhye:
1. School CRUD: create, getAll, getById, update, delete
2. Teacher CRUD (create karatana schoolId dya)
3. Student CRUD (create karatana schoolId + teacherId dya)
4. GET /api/schools/{id}/teachers  -> teacherRepository.findBySchoolId(id)
5. GET /api/schools/{id}/students  -> studentRepository.findBySchoolId(id)
6. GET /api/teachers/{id}/students -> studentRepository.findByTeacherId(id)
7. GET /api/students/{id}/school   -> student.getSchool()
8. Business rules: school shivay teacher/student create karu naye; not found zalyas custom exception (404).

## Tip
Entity direct return karnyapeksha nantar DTO vapra.
