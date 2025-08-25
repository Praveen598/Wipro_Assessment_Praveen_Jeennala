import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-todo-app',
  imports: [FormsModule],
  templateUrl: './todo-app.component.html',
  styleUrl: './todo-app.component.css'
})
export class TodoAppComponent {
   h: string[] = [];
  todo: string = "";

  submit() {
    if (this.todo.trim() !== "") {
      this.h.push(this.todo);
      this.todo = "";  // clear input after submit
    }

}
}
