import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Subjects } from '../subject';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { SubjectService } from '../subject.service';

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {

  student: Student = new Student();
  // subject: Subjects = new Subjects();
  constructor(private studentService: StudentService,
    private subjectService : SubjectService,
  private router : Router){}

  ngOnInit(): void {
  }
  gotoStudentList(){
    this.router.navigate(['/students']);
  }
  onSubmit(){
    this.saveStudent();  
  }

  saveStudent(){
    this.studentService.createStudent(this.student).subscribe({
      next:(data)=>{
        console.log(data);
        this.router.navigate(["/students"]);
      },
    error: (e)=> console.error(e),
  });
}
}
