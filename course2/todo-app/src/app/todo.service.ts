import { Injectable } from '@angular/core';
import { Todo } from './todo';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor(public http: HttpClient) { }

  save(todo: Todo) {
    return this.http.post ("http://localhost:8080/todo", todo)
  }

  findAll() {
    return this.http.get<Todo[]> ("http://localhost:8080/todo")
  }

  delete(id: number){
    return this.http.delete("http://localhost:8080/todo/" + id)
  }

  search (id: number){
    return this.http.get<Todo> ("http://localhost:8080/todo/" + id)
  }
}
