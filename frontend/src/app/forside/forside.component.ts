import { Component } from '@angular/core';

@Component({
  selector: 'app-forside',
  templateUrl: './forside.component.html',
  styleUrls: ['./forside.component.css']
})
export class ForsideComponent {
  showContent = false;

  public toggleContent() {
  this.showContent = !this.showContent
  }

}
