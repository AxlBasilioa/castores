import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class InventarioService {
  private baseUrl = 'http://localhost:8080';

  constructor() { }
  async queryInventario(){
    const response = await fetch(`${this.baseUrl}/productos`,{
      method:'GET'
    });
    if(!response.ok){
      throw new Error('Error fetching inventario Data');
    }
    const data = await response.json();
    console.log(data);
    return data;
  }
  async agregarProducto(){
    const response = await fetch(`${this.baseUrl}/productos`, {
      method:'POST'
    });
    const data = await response.json();
      return data;
    }
    async eliminarProducto(id: number, estado: boolean) {
      const response = await fetch(`${this.baseUrl}/productos/${id}/estado?estado=${estado}`, {
        method: 'PUT',
        headers: {
          'Content-Type': 'application/json'
        }
      });
    
      if (!response.ok) {
        throw new Error(`Error ${response.status}: ${response.statusText}`);
      }
    
      const data = await response.json();
      return data;
    }    
  }
