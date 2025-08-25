import { Component } from '@angular/core';
import { HomeComponent } from "./home/home.component";
import { AboutComponent } from "./about/about.component";
import { SessionComponent } from "./session/session.component";
import { UserComponent } from "./user/user.component";

@Component({
  selector: 'app-nav-bar',
  imports: [HomeComponent,AboutComponent,SessionComponent,UserComponent],
  templateUrl: './nav-bar.component.html',
  styleUrl: './nav-bar.component.css'
})
export class NavBarComponent {

}
