import { Component, OnInit } from '@angular/core';
import { LogServiceService } from '../services/log-service.service';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-logs',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './logs.component.html',
  styleUrl: './logs.component.scss'
})
export class LogsComponent implements OnInit{
  data:any[] = [];
  constructor(private logService:LogServiceService){}
  async ngOnInit(){
    this.data = await this.logService.queryLogs();
    console.log(this.data);
  }
}
