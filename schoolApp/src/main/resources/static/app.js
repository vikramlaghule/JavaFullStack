
// 1. Get HTML elements
const loadBtn = document.getElementById("loadBtn");
const message = document.getElementById("message");
const schoolContainer = document.getElementById("schoolContainer");

// 2. API URL
const API_URL = "http://localhost:8080/api/schools/get-school&teacher";

// 3. Run the function when the button is clicked
loadBtn.addEventListener("click", loadSchools);

// 4. Fetch school data from Spring Boot
async function loadSchools() {

    try {
        // Show loading message
        message.textContent = "Loading schools...";
        schoolContainer.replaceChildren();
        loadBtn.disabled = true;

        // Send GET request to the backend
        const response = await fetch(API_URL);

        // Check HTTP response status
        if (!response.ok) {
            throw new Error("Failed to fetch school data. Status: " + response.status);
        }

        // Convert JSON response into JavaScript data
        const data = await response.json();

        // Handle empty response
        if (data.length === 0) {
            message.textContent = "No schools found.";
            return;
        }

        // Display the schools
        displaySchools(data);

        // Clear loading message
        message.textContent = "Schools loaded successfully.";

    } catch (error) {

        // Handle errors
        message.textContent = "Error: " + error.message;
        console.error("API Error:", error);

    } finally {

        // Enable the button again
        loadBtn.disabled = false;
    }
}


// 5. Display all schools
function displaySchools(schools) {

    schools.forEach(school => {

        // Create school section
        const schoolSection = document.createElement("section");

        // Create school heading
        const schoolHeading = document.createElement("h2");
        schoolHeading.textContent = school.shoolName;

        schoolSection.appendChild(schoolHeading);

        // Display teachers belonging to this school
        displayTeachers(school.list, schoolSection);

        // Add school section to the main container
        schoolContainer.appendChild(schoolSection);

    });
}


// 6. Display teachers and their students
function displayTeachers(teachers, schoolSection) {

    teachers.forEach(teacher => {

        // Create teacher section
        const teacherSection = document.createElement("div");

        // Create teacher heading
        const teacherHeading = document.createElement("h3");
        teacherHeading.textContent = "Teacher: " + teacher.teacherName;

        teacherSection.appendChild(teacherHeading);

        // Check whether the teacher has students
        if (teacher.list.length === 0) {

            const noStudents = document.createElement("p");
            noStudents.textContent = "No students assigned.";

            teacherSection.appendChild(noStudents);

        } else {

            // Create student list
            const studentHeading = document.createElement("p");
            studentHeading.textContent = "Students:";

            const studentList = document.createElement("ul");

            // Display each student
            teacher.list.forEach(student => {

                const studentItem = document.createElement("li");
                studentItem.textContent = student.studentName;

                studentList.appendChild(studentItem);

            });

            teacherSection.appendChild(studentHeading);
            teacherSection.appendChild(studentList);
        }

        // Add teacher section to the school
        schoolSection.appendChild(teacherSection);

    });
}
