import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';
  showForside = false;
  showPost = false;

  public toggleForside() {
    this.showForside = !this.showForside;
  }

    public togglePost() {
      this.showPost = !this.showPost;
    }
}
