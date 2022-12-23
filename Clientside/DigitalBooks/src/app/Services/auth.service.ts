import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../Models/User';



@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http:HttpClient) { }

  private Base_Url1="http://localhost:8080/api/v2/saveuser";

  createUser(users:User):Observable<object>{

    return this.http.post(`${this.Base_Url1}`,users);
  
   }
}
