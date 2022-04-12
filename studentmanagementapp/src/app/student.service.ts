import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { Student } from './student';
import { Subjects } from './subject';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  
  private baseURL="http://localhost:8080/api/v1"
  constructor(private httpClient : HttpClient) { }

  getStudentsList(): Observable<Student[]>{
    return this.httpClient.get<Student[]>(`${this.baseURL}/students`)  
  }

  createStudent(student: Student): Observable<any>{
    return this.httpClient.post(`${this.baseURL}/add_student`,student);
  }

  getStudentById(id:number):Observable<Student>{
    return this.httpClient.get<Student>(`${this.baseURL}/students/${id}`)
  }

  updateStudent(id: number, student: Student) : Observable<Student>{
    return this.httpClient.put<Student>(`${this.baseURL}/students/${id}`,student);
  }

  deleteStudent(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/students/${id}`); 
  }
  
   getStudentsSubjectById(id:number):Observable<Student["subjectIds"][]>{
    return this.httpClient.get<Student["subjectIds"][]>(`${this.baseURL}/studentsubject/${id}`);
  }
}
