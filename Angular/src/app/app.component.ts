import { Component, OnInit } from '@angular/core';
import { NavigationEnd, RouterOutlet } from '@angular/router';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { AuthService } from './services/auth.service';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, RouterModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  constructor(private router: Router, private authService: AuthService) {}
  isAuthenticated = false;
  visibility: boolean[] = [true, true, true, true];
  visibilityLogin: boolean = true;

  ngOnInit() {
    this.updateVisibilityFromPermissions();
    this.authService.authStatus$.subscribe(status => {
      this.isAuthenticated = status;
      console.log('Authentication status changed:', status);
      this.updateVisibilityFromPermissions();
    });

    this.router.events.subscribe(event => {
      if (event instanceof NavigationEnd) {
        this.updateNavBar(event.urlAfterRedirects);
      }
    });
  }

  updateVisibilityFromPermissions() {
    const permisos = JSON.parse(localStorage.getItem("permisos") || '[]');

    const visibility = [
      permisos.includes("Ver módulo del histórico") ? true : false,
      permisos.includes("Ver módulo inventario") ? true : false,
      permisos.includes("Agregar nuevos productos") ? true : false,
      permisos.includes("Ver módulo para Salida de productos") ? true : false
    ];

    this.visibility = visibility;
    this.visibilityLogin = !this.isAuthenticated;
    localStorage.setItem("visibility", JSON.stringify(this.visibility));
  }

  updateNavBar(url: string) {
    const navItems = document.querySelectorAll('#nav-bar a');
    navItems.forEach(item => {
      item.classList.remove('active');
    });

    switch (url) {
      case '/':
        document.getElementById('home')?.classList.add('active');
        break;
      case '/logs':
        document.getElementById('logs')?.classList.add('active');
        break;
      case '/products':
        document.getElementById('products')?.classList.add('active');
        break;
      case '/sells':
        document.getElementById('sells')?.classList.add('active');
        break;
      case '/login':
        document.getElementById('login')?.classList.add('active');
        break;
      default:
        break;
    }
  }

  logout() {
    this.authService.logout();
    this.router.navigate(['/login']);
  }
}
