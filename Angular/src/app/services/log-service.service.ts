import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LogServiceService {
  private baseUrl = 'http://localhost:8080';
  constructor() { }
  async queryLogs(){
    const response = await fetch(`${this.baseUrl}/logs`, {
      method:'GET'
    });
    if(!response.ok){
      throw new Error('Error fetching Logs data');
    }
    const data = await response.json();
    return data;
  }
}
