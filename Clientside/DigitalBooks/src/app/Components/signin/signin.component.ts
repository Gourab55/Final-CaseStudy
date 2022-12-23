import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Models/User';
import { AuthService } from 'src/app/Services/auth.service';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {
  
  username:String;
  password:String;

  user: User= new User();
  constructor(private authService:AuthService) { }

  ngOnInit(): void {
  }

  onSubmit(){

  }

}
