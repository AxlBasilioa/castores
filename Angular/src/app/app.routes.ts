import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LogsComponent } from './logs/logs.component';
import { InventarioComponent } from './inventario/inventario.component';
import { SellsComponent } from './sells/sells.component';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
    {path:'', component:HomeComponent},
    {path:'logs',component:LogsComponent},
    {path:'inventario', component:InventarioComponent},
    {path:'sells', component:SellsComponent},
    {path:'login', component:LoginComponent}
];
