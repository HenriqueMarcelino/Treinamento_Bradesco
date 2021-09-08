import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { UsersTelefoneDto } from "src/app/dto/userstelefonedto";
import { Users } from "src/models/users";

@Injectable()
export class UsersService{


    constructor(private _http: HttpClient){

    }

    public create(users : Users){
        return this._http.post<Users>('http://localhost:8080/users/save', users);
    }

    public findAll(){
        return this._http.get<UsersTelefoneDto[]>('http://localhost:8080/users/findall')
    }

    public find(){
        return this._http.get<Users[]>('http://localhost:8080/users/find')
    }

    public login(users: Users){
        return this._http.post<Users>('http://localhost:8080/users/login', Users);
    }
}