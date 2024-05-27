import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private baseUrl = 'http://localhost:8080';
  private authStatus = new BehaviorSubject<boolean>(false);

  authStatus$ = this.authStatus.asObservable();

  constructor() { }

  async login(correo: string, password: string): Promise<any> {
    const response = await fetch(`${this.baseUrl}/login?correo=${correo}&password=${password}`, {
      method: 'POST'
    });

    if (!response.ok) {
      throw new Error('Login failed');
    }

    const data = await response.json();
    localStorage.setItem("permisos", JSON.stringify(data));

    // Actualizar el estado de autenticación si el login es exitoso
    if (data.length > 0 && data[0] !== "Credenciales inválidas") {
      this.authStatus.next(true);
    }

    return data;
  }

  logout(): void {
    localStorage.removeItem("permisos");
    this.authStatus.next(false);
  }
}
