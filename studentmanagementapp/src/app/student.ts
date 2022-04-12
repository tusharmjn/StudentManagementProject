import { Subjects } from './subject';
export class Student {
    id!: number;
    name!: string;
    email!: string;
    department!: string;
    phoneNumber!: number;
    subjectIds! : number[];
//   static subjectIds: any;
}