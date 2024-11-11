import { bootstrapApplication } from '@angular/platform-browser';
import { provideRouter } from '@angular/router';
import { AppComponent } from './app/app.component';
import { routes } from './app/app.routes'; // Assure-toi que le chemin est correct

bootstrapApplication(AppComponent, {
  providers: [
    provideRouter(routes),
    // autres providers, si nécessaires
  ]
});
