import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './Components/home-page/home-page.component';
import { SignUpComponent } from './Components/sign-up/sign-up.component';
import { SigninComponent } from './Components/signin/signin.component';
import { CreatebookComponent } from './Components/createbook/createbook.component';
import { SearchBookComponent } from './Components/search-book/search-book.component';
import { BookListComponent } from './Components/book-list/book-list.component';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { UpdateBookComponent } from './Components/update-book/update-book.component';
import { BookSearchComponent } from './Components/book-search/book-search.component';
import { NavbarComponent } from './Components/navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    SignUpComponent,
    SigninComponent,
    CreatebookComponent,
    SearchBookComponent,
    BookListComponent,
    UpdateBookComponent,
    BookSearchComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
