import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Models/User';
import { AuthService } from 'src/app/Services/auth.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

 user: User= new User();


  constructor(private authService:AuthService) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.saveBook();
    

  }
  saveBook()
  {
    this.authService.createUser(this.user).subscribe(data =>{
      console.log(data);
      
    },
     error => console.log(error));
  }
  

}
