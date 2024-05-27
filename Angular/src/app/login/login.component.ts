import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AuthService } from '../services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  correo: string = '';
  password: string = '';

  constructor(private authService: AuthService, private router: Router) {}

  async onLogin(): Promise<void> {
    try {
      const response = await this.authService.login(this.correo, this.password);

      if (response.length === 1 && response[0] === "Credenciales inválidas") { 
        console.log("Credenciales inválidas");
        this.correo = '';
        this.password = '';
        return;
      }

      this.router.navigate(['/']);
    } catch (error) {
      console.error('Login failed', error);
    }
  }
}
