import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InventarioService } from '../services/inventario.service';
@Component({
  selector: 'app-inventario',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './inventario.component.html',
  styleUrl: './inventario.component.scss'
})
export class InventarioComponent implements OnInit {
  data:any[] = [];
  constructor(private inventarioService:InventarioService){}
  async ngOnInit(){
    await this.QueryData();
  }
  async QueryData(){
    this.data = await this.inventarioService.queryInventario();
  }
  async activate(id:number,status:boolean){
    const response = await this.inventarioService.eliminarProducto(id,!status);
    await this.QueryData();
  }
  async edite(id:number, data:any[]){
    console.log(data);
  }
  async agregar(){
    const resposne = await this.inventarioService.agregarProducto();
    console.log(resposne);
  }
}
