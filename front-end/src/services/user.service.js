import axios from 'axios'
import BaseService from './base.service'

export default class UserService extends BaseService {
    
    constructor(){
        super();
        this.baseUserUrl = `${this.baseUrl}usuario/`
        this.TOKEN_KEY = 'TOKEN'
    }

    login(email, senha){
        const usuarioDto = {
            email: email,
            senha: senha
        }
        return axios.post(`${this.baseUrl}public/login`, usuarioDto);
    }

    registrar(nomeCompleto, email, senha, imagem, telefone){
        const usuarioDto = {
            nomeCompleto: nomeCompleto,
            email: email,
            senha: senha,
            imagem: imagem,
            telefone: telefone
        }
        return axios.post(`${this.baseUrl}public/registro`, usuarioDto);
    }

    salvarToken(token) {
        localStorage.setItem(this.TOKEN_KEY, token)
    }

    getToken() {
        return localStorage.getItem(this.TOKEN_KEY)
    }

    /*getUser() {
        return axios.get(`${this.baseUrl}public/login`,
            {
                headers: {
                    'Authorization': `Bearer ${this.getToken()}`
                }
            })
    }*/
}
