import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Book } from 'src/app/Models/book';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-createbook',
  templateUrl: './createbook.component.html',
  styleUrls: ['./createbook.component.css']
})
export class CreatebookComponent implements OnInit {

 


  book: Book= new Book();

  constructor(private bookService:BookService,private router:Router) { }

  ngOnInit(): void {

  }

  saveBook()
  {
    this.bookService.createBook(this.book).subscribe(data =>{
      console.log(data);
      this.gotoBookList();
    },
     error => console.log(error));
  }
  gotoBookList(){
    this.router.navigate(['/getbooks'])
  }


 onSubmit(){
  

console.log(this.book);
this.saveBook();

 }
}
