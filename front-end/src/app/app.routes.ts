import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';

export const routes: Routes = [
  { path: '', component: HomeComponent }, // Route par défaut pour la page d'accueil
  // Ajoute d'autres routes si nécessaire, par exemple :
  // { path: 'about', component: AboutUsComponent },
  // { path: 'contact', component: ContactComponent }
];
