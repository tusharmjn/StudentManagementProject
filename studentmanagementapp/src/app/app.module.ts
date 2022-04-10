import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser'; 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentListComponent } from './student-list/student-list.component';
import { CreateStudentComponent } from './create-student/create-student.component';
import { FormsModule } from '@angular/forms';
import { UpdateStudentComponent } from './update-student/update-student.component';
import { StudentDetailsComponent } from './student-details/student-details.component';
import { SubjectListComponent } from './subject-list/subject-list.component';
@NgModule({
  declarations: [
    AppComponent, 
    StudentListComponent, 
    CreateStudentComponent,
     UpdateStudentComponent, 
     StudentDetailsComponent, SubjectListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],

  bootstrap: [AppComponent]
})
export class AppModule { }
