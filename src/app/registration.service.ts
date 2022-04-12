import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { User } from './user';
import { SaveUser } from './save-user';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';





@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor( private _http : HttpClient) { }

  public loginUserFromRemote(user: User)// to call method from java side
  { 
    return this._http.get("http://localhost:8080/login/"+ user.email + "/" + user.password,{responseType:'text' as 'json'});   
  }
  
                               
                                
                    
  public RegisterUserFromRemote(user: User)// to call method from java side
  { 
    return this._http.post("http://localhost:8080/createaccount",user,{responseType:'text' as 'json'});
    

  }

  public saveUserData(saveuser : SaveUser):Observable<any>
  {
    return this._http.post<any>("http://localhost:8080/create",saveuser);
  }
  
}

