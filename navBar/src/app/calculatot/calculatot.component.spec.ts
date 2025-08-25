import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculatotComponent } from './calculatot.component';

describe('CalculatotComponent', () => {
  let component: CalculatotComponent;
  let fixture: ComponentFixture<CalculatotComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CalculatotComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CalculatotComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
