import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { CalculatotComponent } from './calculatot/calculatot.component';
import { TodoAppComponent } from "./todo-app/todo-app.component";
import { RouterLink } from "../../node_modules/@angular/router/router_module.d-Bx9ArA6K";
import { routes } from './app.routes';

 


@Component({
  selector: 'app-root',
  imports: [RouterOutlet, NavBarComponent, CalculatotComponent, TodoAppComponent, RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'navBar';
}
