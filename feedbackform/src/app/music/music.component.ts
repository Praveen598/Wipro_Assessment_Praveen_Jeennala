import { Component } from '@angular/core';
import { MatCardContent, MatCardModule } from '@angular/material/card';
import { MaterialModule } from '../material.module';

@Component({
  selector: 'app-music',
  imports: [MatCardContent, MaterialModule,MatCardModule],
  templateUrl: './music.component.html',
  styleUrl: './music.component.css'
})
export class MusicComponent {

}
