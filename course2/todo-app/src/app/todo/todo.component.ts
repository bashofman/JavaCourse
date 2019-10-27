import { Component, OnInit } from '@angular/core';
import { Todo } from '../todo';
import { TodoService } from '../todo.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  todo = new Todo()
  todoList: Todo[]
  searchValue
  todoFound = new Todo()

  constructor(private todoService: TodoService) { }

  ngOnInit() {
    this.findAll()
  }

  save() {
    console.log(this.todo.task)
    this.todoService.save(this.todo).subscribe(
      () => this.findAll()
    )
  }

  findAll(){
    this.todoService.findAll().subscribe(
      data => this.todoList = data
    )
  }

  delete ( id: number){
    this.todoService.delete(id).subscribe(
      () => this.findAll()
    )
  }

  search(){
    this.todoService.search(this.searchValue).subscribe(
      result => this.todoFound = result
    )
  }


}
