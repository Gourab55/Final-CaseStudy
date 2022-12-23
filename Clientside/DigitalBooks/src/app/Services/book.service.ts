import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../Models/book';



@Injectable({
  providedIn: 'root'
})
export class BookService {


  // saveBook(book:{
  //   logo:String,
  //   title:String,
  //   category:String,
  //   price:number,
  //   author:String,
  //   publisher:String,
  //   publishedDate:String,
  //   chapter:number,
  //   active:String,

  // })
  
  private  Base_Url="http://localhost:8081/api/v1/getbooks";
  private  Base_Url1="http://localhost:8081/api/v1/savebook";
  private Base_Url2="http://localhost:8081/api/v1/book";
  private Base_Url3="http://localhost:8081/api/v1/update";
  private Base_Url4="http://localhost:8081/api/v1/remove";
  private Base_Url5="http://localhost:8081/api/v1/search";

 getBookList():Observable<Book[]>{  

    return this.http.get<Book[]>(`${this.Base_Url}`);
  }
 createBook(books:Book):Observable<object>{

  return this.http.post(`${this.Base_Url1}`,books);

 }
 getBookById(id: number):Observable<Book>{

   return this.http.get<Book>(`${this.Base_Url2}/${id}`);

 }
 
 getBookBySearch(title: String,author: String,publisher: String,price: number):Observable<Book[]>{

  http://localhost:8081/api/v1/search/?title=my book&author=gourab&publisher=20/03/2022&price=1000
  console.log(`${this.Base_Url5}/?title=${title}&author=${author}&publisher=${publisher}&price=${price}`);
   return this.http.get<Book[]>(`${this.Base_Url5}/?title=${title}&author=${author}&publisher=${publisher}&price=${price}`)

 }




 updateBook(id: number,book:Book):Observable<object>{
   return this.http.put(`${this.Base_Url3}/${id}`,book);
 }
  
 deleteBook(id : number):Observable<object>{
   return this.http.delete(`${this.Base_Url4}/${id}`);
 }




  constructor(private http:HttpClient) { }
}



// getBooks(){
//   return this.http.get(this.Base_Url);
// }

