import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PostComponent } from './post/post.component';
import { AppComponent } from './app.component';
import { ForsideComponent } from './forside/forside.component';

const routes: Routes = [
  { path: '', component: AppComponent },
  { path: 'forside', component: ForsideComponent },
  { path: 'post', component: PostComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
