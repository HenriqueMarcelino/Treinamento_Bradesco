import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Funcionario } from '../model/funcionario';
import { FuncionarioService } from '../service/funcionario.service';

@Component({
  selector: 'app-funcionario',
  templateUrl: './funcionario.component.html',
  styleUrls: ['./funcionario.component.css']
})
export class FuncionarioComponent implements OnInit {

  funcionario: Funcionario;
  funcionarios: Funcionario[]=[];
  msg: string = '';
  fg: FormGroup;

  constructor(private service: FuncionarioService, 
    private fb: FormBuilder){
      this.funcionario = new Funcionario();
   }

  ngOnInit(): void {
    this.fg = this.fb.group({
      id: [0, Validators.compose([
        Validators.required,
        Validators.min(5),
        Validators.max(5000)
      ])],
      nome: ['', Validators.compose([
        Validators.required,
        Validators.minLength(5),
        Validators.maxLength(100),
        Validators.pattern(/^[a-z A-Z]*$/)
      ])],
      email: ['', Validators.compose([
        Validators.required,
        Validators.email
      ])],
      foto: ['', Validators.compose([
        Validators.required
      ])]
    })
  }

  gravar(){
    this.service.create(this.funcionario).subscribe(res => {
      console.log('Funcionario gravado', this.funcionario);
      this.funcionario = new Funcionario();
    })
  }
  private getControl(name: string){
    return this.fg.controls[name];
  }

  get id(){
    return this.getControl('id');
  }
  
  get nome(){
    return this.getControl('nome');
  }
  
  get email(){
    return this.getControl('email');
  }

  get foto(){
    return this.getControl('foto');
  }

}
