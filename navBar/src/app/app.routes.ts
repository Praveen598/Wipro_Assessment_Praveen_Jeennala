import { UserComponent } from './nav-bar/user/user.component';
import { Routes } from '@angular/router';
import { HomeComponent } from './nav-bar/home/home.component';
import { AboutComponent } from './nav-bar/about/about.component';
import { SessionComponent } from './nav-bar/session/session.component';

export const routes: Routes = [
     {
        path:'',
        component:HomeComponent
    },
    {
        path:'about',
        component:AboutComponent
    },
     {
        path:'session',
        component:SessionComponent
    },
    {
        path:'user',
        component:UserComponent
    }
];
