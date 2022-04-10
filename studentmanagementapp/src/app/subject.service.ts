import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Subjects } from './subject';

@Injectable({
  providedIn: 'root'
})
export class SubjectService {

  private baseURL="http://localhost:8080/api/v1"
  constructor(private httpClient:HttpClient) { }

  createSubject(subject: Subjects): Observable<any>{
    return this.httpClient.post(`${this.baseURL}/add`,subject);
  }

  // getSubjectById(subjectId:number):Observable<Subjects[]>{
  //   return this.httpClient.get<Subjects[]>(`${this.baseURL}/${subjectId}`,);
  // }
}
