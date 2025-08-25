import { Component } from '@angular/core';
import { ReactiveFormsModule, FormsModule, FormGroup, Validators, FormControl } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { MaterialModule } from './material.module';
import { Subject } from 'rxjs';
import { MovieCartComponent } from "./movie-cart/movie-cart.component";
import { MusicComponent } from "./music/music.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, MaterialModule, FormsModule, FormsModule, ReactiveFormsModule, MovieCartComponent, MovieCartComponent, MusicComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'feedbackform';
myFormReact: any;

onSubmitReact() {
    console.log(this.myFormReact.value)

}
ngOnInit(): void {
    this.myFormReact = new FormGroup({
      name: new FormControl('', [Validators.required, Validators.minLength(5)]),
      email: new FormControl('', [Validators.required, Validators.email]),
      subject: new FormControl('', [Validators.required, Validators.maxLength(40)]),
      Comment: new FormControl('', [Validators.required, Validators.maxLength(250)])
    });
  }

}
