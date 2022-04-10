import { Component, OnInit } from '@angular/core';
import { Subjects } from '../subject';
import { Student } from '../student';
import { SubjectService } from '../subject.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-subject-list',
  templateUrl: './subject-list.component.html',
  styleUrls: ['./subject-list.component.css']
})
export class SubjectListComponent implements OnInit {

  subjectId! : number;
  // student: Student = new Student();
  subject: Subjects = new Subjects();
  constructor(private subjectService : SubjectService, private router : Router,private route: ActivatedRoute) { }

  ngOnInit(): void {

  //   this.subjectId = this.route.snapshot.params['subjectId'];

  //   this.subjectService.getSubjectById(this.subjectId).subscribe({
      
  //     next: (data) => { 
  //       this.subject =data;
  //       console.log(data);
  //     },
  //       error: (e) => console.error(e),
  //   })
  }

  onSubmit(){
    console.log("working");
      this.saveSubject();
  }
  saveSubject(){
    this.subjectService.createSubject(this.subject).subscribe({
      next:(data)=>{
        console.log(data);
        // this.router.navigate(["/subjects"]);
        console.log("added");
      },
    error: (e)=> console.error(e),
  });
}
}
