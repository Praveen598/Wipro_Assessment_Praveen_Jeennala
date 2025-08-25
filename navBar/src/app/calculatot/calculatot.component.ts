import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-calculatot',
  standalone: true,
  imports: [FormsModule, CommonModule],   // ✅ important
  templateUrl: './calculatot.component.html',
  styleUrls: ['./calculatot.component.css']
})
export class CalculatotComponent {
  firstnum: number =0;
  secondnum: number = 0;

  get addResult(): number {
    return this.firstnum + this.secondnum;
  }

  get subration():number{
    return this.firstnum-this.secondnum;
  }
  get devison():number{
    return this.firstnum/this.secondnum;
  }
  get multiplication():number{
    return this.firstnum*this.secondnum;
  }
}


