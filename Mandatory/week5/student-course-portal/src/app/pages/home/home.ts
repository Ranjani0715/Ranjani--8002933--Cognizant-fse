import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home implements OnInit {

  title = "";
  description = "";

  studentName = "Ranjani";
  studentInput = "Ranjani";

  profileImage =
    "https://cdn-icons-png.flaticon.com/512/3135/3135715.png";

  coursesAvailable = 12;
  enrolledCourses = 3;
  currentGPA = 3.8;

  buttonDisabled = false;
  statusMessage = "";

  ngOnInit(): void {
    this.title = "Welcome to Student Course Portal";
    this.description =
      "Manage your courses, enroll in subjects, and monitor your academic progress.";

    console.log("Home Component Loaded Successfully");
  }

  enrollCourse() {
    this.enrolledCourses++;
    this.buttonDisabled = true;
    this.statusMessage = "🎉 Successfully enrolled in the course!";
  }

}