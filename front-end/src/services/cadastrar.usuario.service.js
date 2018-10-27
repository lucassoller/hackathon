import BaseService from './base.service'
import axios from 'axios';

export default class CadastrarUsuario extends BaseService {
  
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
}
