import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookListComponent } from './Components/book-list/book-list.component';
import { CreatebookComponent } from './Components/createbook/createbook.component';
import { HomePageComponent } from './Components/home-page/home-page.component';
import { SearchBookComponent } from './Components/search-book/search-book.component';
import { SignUpComponent } from './Components/sign-up/sign-up.component';
import { SigninComponent } from './Components/signin/signin.component';
import { UpdateBookComponent } from './Components/update-book/update-book.component';

const routes: Routes = [{path:"signup",
component:SignUpComponent}, {path:"signin",
component:SigninComponent},{path:"create",
component:CreatebookComponent},
{path:"getbooks",component:BookListComponent},
{path: 'update-book/:id',component:UpdateBookComponent},
{path: "search",component:SearchBookComponent},
{path: "home",component:HomePageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
