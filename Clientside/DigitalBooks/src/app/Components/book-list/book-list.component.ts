import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from 'src/app/Models/book';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {




  books: Book[] = [];
  constructor(private bookService: BookService,private router: Router) { }

  ngOnInit(): void {
  //  this.books= [{
  //      "id":1,
  //       "logo":"Happy",
  //     "title":"always happy",
  //     "category":"Poet",
  //     "price":5000,
  //    "author":"ashis",
  //     "publisher":"vk public",
  //     "publishedDate":"15/04/2022",
  //     "chapter":50,
  //     "active":"Yes"
  //      }]

    this.getBooks();
   
   
  }
  private getBooks(){
   
      this.bookService.getBookList().subscribe(data => {
        this.books=data;
      });

  }
  updateBook(id:number){
    this.router.navigate(['update-book', id])

  }
  deleteBook(id:number){

    this.bookService.deleteBook(id).subscribe(data =>{
      console.log(data);
      this.getBooks();
    })

  }



  

}





// const promise= this.bookService.getBooks();
// promise.subscribe((Response) => {
// console.log(Response);
// this.books= Response as Book[];
// })