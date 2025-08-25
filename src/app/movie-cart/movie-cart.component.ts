import { Component } from '@angular/core';
import { MatCardContent, MatCardModule } from "@angular/material/card";
import { MaterialModule } from "../material.module";

@Component({
  selector: 'app-movie-cart',
  imports: [MatCardContent, MaterialModule,MatCardModule],
  templateUrl: './movie-cart.component.html',
  styleUrl: './movie-cart.component.css'
})
export class MovieCartComponent {

}
