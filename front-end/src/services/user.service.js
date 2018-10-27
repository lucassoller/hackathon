import axios from 'aixos'
import BaseService from './base.service'

export default class UserService extends BaseService {
    
    constructor(){
        super();
        this.baseUserUrl = `${this.baseUrl}usuario/`
    }
}
