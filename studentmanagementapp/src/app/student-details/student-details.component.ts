import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { ActivatedRoute } from '@angular/router';
import { StudentService } from '../student.service';
import { Subject } from 'rxjs';
import { Subjects } from '../subject';

@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.css']
})
export class StudentDetailsComponent implements OnInit {

  id! : number
  student! : Student
  //subject !: Subjects
  subjects : Array<Subjects> = [] ;
  constructor(private route : ActivatedRoute,private studentService: StudentService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    //this.subject = new Subjects();
    this.student = new Student();
    this.studentService.getStudentById(this.id).subscribe(data=>{
      this.student = data;
      //console.log(data);
    })
    this.studentService.getStudentsSubjectById(this.id).subscribe(data=>{
      console.log(data);
      //this.subject = data[0];
      data.forEach(element => {
        let sub = new Subjects();
        sub["subjectId"] = element["subjectId"] ;
        sub["subjectName"] = element["subjectName"]
        console.log(element);
        this.subjects.push(sub);
      });
    })
  }

}
