import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-course-list',
  imports: [CommonModule],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  courses = [
    {
      id: 101,
      name: 'Angular',
      instructor: 'John',
      fee: 2500,
      startDate: new Date('2026-08-01'),
      available: true
    },
    {
      id: 102,
      name: 'Java',
      instructor: 'David',
      fee: 3000,
      startDate: new Date('2026-08-10'),
      available: false
    },
    {
      id: 103,
      name: 'Spring Boot',
      instructor: 'Robert',
      fee: 3500,
      startDate: new Date('2026-08-20'),
      available: true
    }
  ];

}