import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/Models/book';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-book-search',
  templateUrl: './book-search.component.html',
  styleUrls: ['./book-search.component.css']
})
export class BookSearchComponent implements OnInit {
 

  books:Book[]=[];
  constructor(private bookService:BookService) { }

  ngOnInit(): void {
    
  }
  
   
   
  }
 


