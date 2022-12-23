import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from 'src/app/Models/book';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})
export class SearchBookComponent implements OnInit {


  title: String;
  author:String;
  publisher: String;
  price:number;




  book:Book= new Book();
  books:Book[]=[];

  constructor(private bookService:BookService,private router:Router) { }
  
  
  

  ngOnInit(): void {
  }
  searchBook()
  {
    this.bookService.getBookBySearch(this.book.title,this.book.author,this.book.publisher,this.book.price).subscribe(data =>{
      this.books=data;
      // this.gotoBookList();
    },
     error => console.log(error));
  }

 


  onSubmit(){
  this.searchBook();
  }

}
