import { Component } from '@angular/core';
import { HeaderComponent } from '../header/header.component';
import { BackgroundComponent } from '../background/background.component';
import { AboutUsComponent } from '../about-us/about-us.component';
import { ContactComponent } from '../contact/contact.component';

@Component({
  selector: 'app-home',
  standalone: true,
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
  imports: [HeaderComponent, BackgroundComponent, AboutUsComponent, ContactComponent]
})
export class HomeComponent {}
